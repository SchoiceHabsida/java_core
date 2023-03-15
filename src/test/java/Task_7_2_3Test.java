import classes.MailMessage;
import classes.MailPackage;
import classes.Package;
import classes.RealMailService;
import interfaces.MailService;
import interfaces.Sendable;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.*;

import static org.junit.jupiter.api.Assertions.*;

public class Task_7_2_3Test {

    private static OutputStream logCapturingStream;
    private static CustomStreamHandler customLogHandler;
    private static Logger log = Logger.getLogger(Task_7_2_3.class.getName());

    @BeforeEach
    public void setLogCapturingStream() {
        logCapturingStream = new ByteArrayOutputStream();
        customLogHandler = new CustomStreamHandler();
        customLogHandler.setOutputStream(logCapturingStream);
        log.addHandler(customLogHandler);
    }

    public String getTestCapturedLog() throws IOException {
        customLogHandler.flush();
        return logCapturingStream.toString();
    }

    @Test
    void testSpy() throws IOException {
        Task_7_2_3.Spy spy = new Task_7_2_3.Spy(log);
        Sendable mail = new MailMessage("Austin Powers", "Schoice Habsida", "Hey, how are you?");
        spy.processMail(mail);
        String output = getTestCapturedLog();
        assertTrue(output.contains("WARNING"));
        assertTrue(output.contains("Detected target mail correspondence: from Austin Powers to Schoice Habsida \"Hey, how are you?\""));

        mail = new MailMessage("Akshay", "Kim", "Hey, Let's go for a movie!!");
        spy.processMail(mail);
        output = getTestCapturedLog();
        assertTrue(output.contains("INFO"));
        assertTrue(output.contains("Usual correspondence: from Akshay to Kim"));

        mail = new MailMessage("Akshay", "Austin Powers", "Hey, Let's go for a movie!!");
        spy.processMail(mail);
        output = getTestCapturedLog();
        assertTrue(output.contains("WARNING"));
        assertTrue(output.contains("Detected target mail correspondence: from Akshay to Austin Powers \"Hey, Let's go for a movie!!\""));
    }

    @Test
    void testInspector() throws Exception {
        Package packge = new Package("weapons", 500);
        Task_7_2_3.Inspector inspector = new Task_7_2_3.Inspector();
        MailPackage illegalPackage = new MailPackage("USA", "Russia", packge);
        assertTrue(packge.getContent() == "weapons" && packge.getPrice() == 500);
        assertTrue(illegalPackage.getFrom() == "USA" && illegalPackage.getTo() ==  "Russia");
        assertThrows( Task_7_2_3.IllegalPackageException.class, ()->{
            inspector.processMail(illegalPackage);
        });

        packge = new Package("stones", 200);
        MailPackage stonesPackage = new MailPackage("China", "Egypt", packge);
        assertTrue(packge.getContent() == "stones" && packge.getPrice() == 200);
        assertTrue(stonesPackage.getFrom() == "China" && stonesPackage.getTo() ==  "Egypt");
        assertThrows( Task_7_2_3.StolenPackageException.class, ()->{
            inspector.processMail(stonesPackage);
        });
    }

    @Test
    void testThief() throws Exception {
        Task_7_2_3.Thief thief = new Task_7_2_3.Thief(200);
        Package packge = new Package("Croissant", 417);
        MailPackage mailPackage = new MailPackage("Almaz", "Anton", packge);
        MailPackage newPackage = (MailPackage) thief.processMail(mailPackage);
        assertTrue(thief.getStolenValue() == 417);
        assertTrue(newPackage.getContent().getContent().contentEquals("stones instead of Croissant") && newPackage.getContent().getPrice() == 0);
    }


    @Test
    void testUntrustworthyMailWorker() throws IOException {

        MailMessage msg1 = new MailMessage("alice", "bob", "Hello, Bob!");
        MailMessage msg2 = new MailMessage("bob", "Austin Powers", "Howdy, Charlie!");
        Package pkg = new Package("some goods", 150);
        Package pkg2 = new Package("weapons", 97);

        RealMailService realMailService = new RealMailService();
        Task_7_2_3.Spy spy = new Task_7_2_3.Spy(log);
        Task_7_2_3.Inspector inspector = new Task_7_2_3.Inspector();
        Task_7_2_3.Thief thief = new Task_7_2_3.Thief(100);

        Task_7_2_3.UntrustworthyMailWorker worker = new Task_7_2_3.UntrustworthyMailWorker(new MailService[]{spy, thief, inspector});

        worker.processMail(msg1);
        String output = getTestCapturedLog();
        assertTrue(output.contains("INFO"));
        assertTrue(output.contains("Usual correspondence: from alice to bob"));
        assertTrue(thief.getStolenValue() == 0);

        worker.processMail(msg2);
        output = getTestCapturedLog();
        assertTrue(output.contains("WARNING"));
        assertTrue(output.contains("Detected target mail correspondence: from bob to Austin Powers \"Howdy, Charlie!\""));
        assertTrue(thief.getStolenValue() == 0);

        assertThrows( Task_7_2_3.StolenPackageException.class, ()->{
            worker.processMail(new MailPackage("Sender", "Recipient", pkg));
        });
        assertTrue(thief.getStolenValue() == 150);

        assertThrows(Task_7_2_3.IllegalPackageException.class, () -> {
            worker.processMail(new MailPackage("Sender", "Recipient", pkg2));
        });
        assertTrue(thief.getStolenValue() == 150);

        assertEquals(worker.getRealMailService().getClass().getName(), realMailService.getClass().getName());

    }
}
