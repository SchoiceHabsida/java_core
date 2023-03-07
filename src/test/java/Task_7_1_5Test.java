import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class Task_7_1_5Test {
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final Task_7_1_5 task = new Task_7_1_5();

    @Test
    void testCreditIsGranted() {
        BankClient bankClient = new BankClient(true, false, false);
        BankWorker bankWorker = new ActualBankWorker();
        assertDoesNotThrow(() -> task.getCreditForClient(bankWorker, bankClient));
        assertTrue(task.getCreditForClient(bankWorker, bankClient));
    }

    @Test
    void testCreditIsNotGranted() {
        BankClient bankClient = new BankClient(false, false, false);
        BankWorker bankWorker = new ActualBankWorker();
        assertDoesNotThrow(() -> task.getCreditForClient(bankWorker, bankClient));
        assertFalse(task.getCreditForClient(bankWorker, bankClient));
    }

    @Test
    void testHasBadCreditHistory() {
        System.setOut(new PrintStream(outputStream));
        BankClient bankClient = new BankClient(false, true, false);
        BankWorker bankWorker = new ActualBankWorker();
        task.getCreditForClient(bankWorker, bankClient);
        String result = outputStream.toString().trim();
        assertEquals("The client has a bad credit history!", result);
        assertFalse(task.getCreditForClient(bankWorker, bankClient));
        System.setOut(standardOut);
    }

    @Test
    void testProblemWithLawIsIgnored() {
        BankClient bankClient = new BankClient(false, false, true);
        BankWorker bankWorker = new ActualBankWorker();
        assertDoesNotThrow(() -> task.getCreditForClient(bankWorker, bankClient));
    }

}
