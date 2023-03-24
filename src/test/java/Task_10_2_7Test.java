import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class Task_10_2_7Test {

    private String randomFrom = "...";
    private String randomTo = "...";
    private int randomSalary = 100;

    @Test
    void testMailMessage() {
        Task_10_2_7.MailMessage firstMessage = new Task_10_2_7.MailMessage(
                "Robert Howard",
                "H.P. Lovecraft",
                "This \"The Shadow over Innsmouth\" story is real masterpiece, Howard!"
        );

        assertTrue(firstMessage.getFrom().equals("Robert Howard"));
        assertTrue(firstMessage.getTo().equals("H.P. Lovecraft"));
        assertTrue(firstMessage.getContent().endsWith("Howard!"));

        Task_10_2_7.MailMessage secondMessage = new Task_10_2_7.MailMessage(
                "Jonathan Nolan",
                "Christopher Nolan",
                "Brother, why is everyone only praising you when almost all the scripts were written by me. " +
                        "It's not fair!"
        );

        Task_10_2_7.MailMessage thirdMessage = new Task_10_2_7.MailMessage(
                "Stephen Hawking",
                "Christopher Nolan",
                "I still don't understand Interstellar."
        );

        List<Task_10_2_7.MailMessage> messages = Arrays.asList(
                firstMessage, secondMessage, thirdMessage
        );

        Task_10_2_7.MailService<String> mailService = new Task_10_2_7.MailService<>();

        messages.stream().forEachOrdered(mailService);

        Map<String, List<String>> mailBox = mailService.getMailBox();

        assertTrue(mailBox.get("H.P. Lovecraft").equals(
                Arrays.asList(
                        "This \"The Shadow over Innsmouth\" story is real masterpiece, Howard!"
                )
        ));

        assertTrue( mailBox.get("Christopher Nolan").equals(
                Arrays.asList(
                        "Brother, why is everyone only praising you when almost all the scripts were written by me. " +
                                "It's not fair!",
                        "I still don't understand Interstellar."
                )
        ));

        assertTrue(mailBox.get(randomTo).equals(Collections.<String>emptyList()));
    }

    @Test
    void testSalaryService() {
        Task_10_2_7.Salary salary1 = new Task_10_2_7.Salary("Facebook", "Mark Zuckerberg", 1);
        Task_10_2_7.Salary salary2 = new Task_10_2_7.Salary("FC Barcelona", "Lionel Messi", Integer.MAX_VALUE);
        Task_10_2_7.Salary salary3 = new Task_10_2_7.Salary(randomFrom, randomTo, randomSalary);

        Task_10_2_7.MailService<Integer> salaryService = new Task_10_2_7.MailService<>();

        Arrays.asList(salary1, salary2, salary3).forEach(salaryService);

        Map<String, List<Integer>> salaries = salaryService.getMailBox();
        assertFalse(salaries.get(salary1.getTo()).equals(Arrays.asList(18)));
        assertTrue(salaries.get(salary1.getTo()).equals(Arrays.asList(1)));

        assertFalse(salaries.get(salary2.getTo()).equals(Arrays.asList(Integer.MIN_VALUE)));
        assertTrue(salaries.get(salary2.getTo()).equals(Arrays.asList(Integer.MAX_VALUE)));

        assertFalse(salaries.get(randomTo).equals(Arrays.asList(80000)));
        assertTrue(salaries.get(randomTo).equals(Arrays.asList(randomSalary)));
    }
}
