import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class Task_6_5_7Test {

    private Task_6_5_7 task_6_5_7 = new Task_6_5_7();
    private final String[] spamKeywords = {"spam", "bad","malicious"};
    private final int commentMaxLength = 40;
    private final TextAnalyzer[] textAnalyzers = {
            new SpamAnalyzer(spamKeywords),
            new NegativeTextAnalyzer(),
            new TooLongTextAnalyzer(commentMaxLength)
    };

    private final String[] comments = {
            "This comment is so Loooooooooooooooooooooooooooong.", //TOO_LONG
            "Very negative comment !!!!=(!!!!;",                   // NEGATIVE_TEXT
            "Very BAAAAAAAAAAAAAAAAAAAAAAAAD comment with :|;",    // NEGATIVE_TEXT or TOO_LONG
            "This comment is so bad....",                        // SPAM
            "The comment is a spam, maybeeeeeeeeeeeeeeeeeeeeee!",  // SPAM or TOO_LONG
            "Negative bad :( spam.",                               // SPAM or NEGATIVE_TEXT
            "Very bad, very neg =(, very ..................",
            "Let's Go With Habsida",
            "This is very good Comment",
            "I don't like you :| "
    };

    @Test
    void testOk() {
        assertEquals(Label.OK, task_6_5_7.checkLabels(textAnalyzers, comments[7]));
    }

    @Test
    void testLongText() {
        assertEquals(Label.TOO_LONG, task_6_5_7.checkLabels(textAnalyzers, comments[0]));
    }

    @Test
    void testNegativeText() {
        assertEquals(Label.NEGATIVE_TEXT, task_6_5_7.checkLabels(textAnalyzers, comments[1]));
        assertEquals(Label.NEGATIVE_TEXT, task_6_5_7.checkLabels(textAnalyzers, comments[9]));
    }

    @Test
    void testNegativeOrTooLongText() {
        assertEquals(Label.NEGATIVE_TEXT, task_6_5_7.checkLabels(textAnalyzers, comments[2]));
    }

    @Test
    void testSpamText() {
        assertEquals(Label.SPAM, task_6_5_7.checkLabels(textAnalyzers, comments[3]));
    }

    @Test
    void testSpamOrTooLongText() {
        assertEquals(Label.SPAM, task_6_5_7.checkLabels(textAnalyzers, comments[4]));
    }

    @Test
    void testSpamOrNegativeText() {
        assertEquals(Label.SPAM, task_6_5_7.checkLabels(textAnalyzers, comments[5]));
    }

    @Test
    void testSpamText2() {
        assertEquals(Label.SPAM, task_6_5_7.checkLabels(textAnalyzers, comments[4]));
    }

    @Test
    void testFalseTests() {
        assertNotEquals(Label.NEGATIVE_TEXT, task_6_5_7.checkLabels(textAnalyzers, comments[8]));
    }
}