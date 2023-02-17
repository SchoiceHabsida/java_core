import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Task_5_1_10Test {

    private String[] roles;
    private String[] textLines;
    private String result;

    @Test
    void test1_PrintTextPerRole() {
        roles = new String[]{"BARNARDO", "FRANCISCO", "HORATIO", "MARCELLUS"};
        textLines = new String[]{"BARNARDO: Who's there?",
                "FRANCISCO:Nay, answer me. Stand and unfold yourself.",
                "BARNARDO: Long live the King!",
                "FRANCISCO: Barnardo?",
                "BARNARDO: He.",
                "FRANCISCO: You come most carefully upon your hour.",
                "BARNARDO: 'Tis now struck twelve. Get thee to bed, Francisco.",
                "FRANCISCO: For this relief much thanks. 'Tis bitter cold, And I am sick at heart.",
                "BARNARDO: Have you had quiet guard?",
                "FRANCISCO: Not a mouse stirring.",
                "BARNARDO: Well, good night. If you do meet Horatio and Marcellus, The rivals of my watch, bid them make haste.",
                "FRANCISCO: I think I hear them. Stand, ho! Who's there?",
                "FRANCISCO: I think I hear them. Stand, ho! Who's there? Enter Horatio and Marcellus.",
                "HORATIO: Friends to this ground.",
                "MARCELLUS: And liegemen to the Dane.",
                "FRANCISCO: Give you good night.",
                "MARCELLUS: O, farewell, honest soldier. Who hath relieved you?",
                "FRANCISCO: Barnardo has my place. Give you good night.",
                "MARCELLUS: Holla, Barnardo!",
                "BARNARDO: Say, what is Horatio there?",
                "HORATIO: A piece of him.",
                "BARNARDO: Welcome, Horatio. Welcome, good Marcellus.",
                "MARCELLUS: What, has this thing appeared again tonight?",
                "BARNARDO: I have seen nothing.",
                "MARCELLUS: Horatio says 'tis but our fantasy, " +
                        "And will not let belief take hold of him Touching this dreaded sight, twice seen of us. " +
                        "Therefore I have entreated him along With us to watch the minutes of this night, " +
                        "That, if again this apparition come, He may approve our eyes and speak to it.",
                "HORATIO: Tush, tush, 'twill not appear.",
                "BARNARDO: Sit down awhile, And let us once again assail your ears, " +
                        "That are so fortified against our story, What we two nights have seen.",
                "HORATIO: Well, sit we down, And let us hear Barnardo speak of this.",
                "BARNARDO: Last night of all, " +
                        "When yond same star that's westward from the pole Had made his course to illume that part of heaven " +
                        "Where now it burns, Marcellus and myself, The bell then beating one—",
                "MARCELLUS: Peace, break thee off. Look where it comes again!",
                "BARNARDO: In the same figure like the King that's dead.",
                "MARCELLUS: Thou art a scholar; speak to it, Horatio.",
                "BARNARDO: Looks it not like the King? Mark it, Horatio.",
                "BARNARDO: It would be spoke to.",
                "MARCELLUS: Question it, Horatio.",
                "HORATIO: What art thou that usurp'st this time of night, " +
                        "Together with that fair and warlike form In which the majesty of buried Denmark Did sometimes march? " +
                        "By heaven, I charge thee, speak!",
                "MARCELLUS: It is offended.",
                "BARNARDO: See, it stalks away!",
                "HORATIO: Stay! Speak, speak! I charge thee, speak! Exit Ghost.",
                "MARCELLUS: 'Tis gone, and will not answer.",
                "BARNARDO: How now, Horatio? You tremble and look pale."};

        result = "BARNARDO:\n" +
                "1) Who's there?\n" +
                "3) Long live the King!\n" +
                "5) He.\n" +
                "7) 'Tis now struck twelve. Get thee to bed, Francisco.\n" +
                "9) Have you had quiet guard?\n" +
                "11) Well, good night. If you do meet Horatio and Marcellus, The rivals of my watch, bid them make haste.\n" +
                "20) Say, what is Horatio there?\n" +
                "22) Welcome, Horatio. Welcome, good Marcellus.\n" +
                "24) I have seen nothing.\n" +
                "27) Sit down awhile, And let us once again assail your ears, That are so fortified against our story, What we two nights have seen.\n" +
                "29) Last night of all, When yond same star that's westward from the pole Had made his course to illume that part of heaven Where now it burns, Marcellus and myself, The bell then beating one—\n" +
                "31) In the same figure like the King that's dead.\n" +
                "33) Looks it not like the King? Mark it, Horatio.\n" +
                "34) It would be spoke to.\n" +
                "38) See, it stalks away!\n" +
                "41) How now, Horatio? You tremble and look pale.\n" +
                "\n" +
                "FRANCISCO:\n" +
                "2)Nay, answer me. Stand and unfold yourself.\n" +
                "4) Barnardo?\n" +
                "6) You come most carefully upon your hour.\n" +
                "8) For this relief much thanks. 'Tis bitter cold, And I am sick at heart.\n" +
                "10) Not a mouse stirring.\n" +
                "12) I think I hear them. Stand, ho! Who's there?\n" +
                "13) I think I hear them. Stand, ho! Who's there? Enter Horatio and Marcellus.\n" +
                "16) Give you good night.\n" +
                "18) Barnardo has my place. Give you good night.\n" +
                "\n" +
                "HORATIO:\n" +
                "14) Friends to this ground.\n" +
                "21) A piece of him.\n" +
                "26) Tush, tush, 'twill not appear.\n" +
                "28) Well, sit we down, And let us hear Barnardo speak of this.\n" +
                "36) What art thou that usurp'st this time of night, Together with that fair and warlike form In which the majesty of buried Denmark Did sometimes march? By heaven, I charge thee, speak!\n" +
                "39) Stay! Speak, speak! I charge thee, speak! Exit Ghost.\n" +
                "\n" +
                "MARCELLUS:\n" +
                "15) And liegemen to the Dane.\n" +
                "17) O, farewell, honest soldier. Who hath relieved you?\n" +
                "19) Holla, Barnardo!\n" +
                "23) What, has this thing appeared again tonight?\n" +
                "25) Horatio says 'tis but our fantasy, And will not let belief take hold of him Touching this dreaded sight, twice seen of us. Therefore I have entreated him along With us to watch the minutes of this night, That, if again this apparition come, He may approve our eyes and speak to it.\n" +
                "30) Peace, break thee off. Look where it comes again!\n" +
                "32) Thou art a scholar; speak to it, Horatio.\n" +
                "35) Question it, Horatio.\n" +
                "37) It is offended.\n" +
                "40) 'Tis gone, and will not answer.\n\n";

        assertEquals(result, Task_5_1_10.printTextPerRole(roles, textLines));
    }

    @Test
    void test2_PrintTextPerRole() {
        roles = new String[]{"Will",
                "Ser Waymer",
                "Gared"};

        textLines = new String[] {"Will: We should start back. They’re all dead.",
                "Ser Waymer: Any Blood?",
                "Will: Not that I saw.",
                "Ser Waymer: How close did you get?",
                "Will: Close enough to see they was dead.",
                "Ser Waymer: (skeptical) Or sleeping?",
                "Gared: If Will says they’re dead, they’re dead. We should head back to the Wall.",
                "Ser Waymer: Do the dead frighten you?",
                "Gared: Mormont said we should track ‘em. We tracked ‘em. They won’t trouble us no more.",
                "Ser Waymer: You don’t think Mormont will ask us how they died?"};

        result = "Will:\n" +
                "1) We should start back. They’re all dead.\n" +
                "3) Not that I saw.\n" +
                "5) Close enough to see they was dead.\n" +
                "\n" +
                "Ser Waymer:\n" +
                "2) Any Blood?\n" +
                "4) How close did you get?\n" +
                "6) (skeptical) Or sleeping?\n" +
                "8) Do the dead frighten you?\n" +
                "10) You don’t think Mormont will ask us how they died?\n" +
                "\n" +
                "Gared:\n" +
                "7) If Will says they’re dead, they’re dead. We should head back to the Wall.\n" +
                "9) Mormont said we should track ‘em. We tracked ‘em. They won’t trouble us no more.\n\n";

        assertEquals(result, Task_5_1_10.printTextPerRole(roles, textLines));
    }

    @Test
    void test3_PrintTextPerRole() {
        roles = new String[]{"Will",
                "Ser Waymer",
                "Gared"};

        textLines = new String[] {"Will: We should start back. They’re all dead.",
                "Ser Waymer: Any Blood?",
                "Will: Not that I saw.",
                "Ser Waymer: How close did you get?",
                "Will: Close enough to see they was dead.",
                "Ser Waymer: (skeptical) Or sleeping?",
                "Gared: If Will says they’re dead, they’re dead. We should head back to the Wall.",
                "Ser Waymer: Do the dead frighten you?",
                "Gared: Mormont said we should track ‘em. We tracked ‘em. They won’t trouble us no more.",
                "Ser Waymer: You don’t think Mormont will ask us how they died?"};

        result = "Will:\n" +
                "1) We should start back. They’re all dead.\n" +
                "3) Not that I saw.\n" +
                "5) Close enough to see they was dead.\n" +
                "\n" +
                "Ser Waymer:\n" +
                "2) Any Blood?\n" +
                "4) How close did you get?\n" +
                "6) (skeptical) Or sleeping?\n" +
                "8) If Will says they’re dead, they’re dead. We should head back to the Wall.\n" +
                "10) You don’t think Mormont will ask us how they died?\n" +
                "\n" +
                "Gared:\n" +
                "7) Do the dead frighten you?\n" +
                "9) Mormont said we should track ‘em. We tracked ‘em. They won’t trouble us no more.\n\n";

        assertNotEquals(result, Task_5_1_10.printTextPerRole(roles, textLines));
    }

    @Test
    void test4_PrintTextPerRole() {
        roles = new String[]{"Banner",
                "Natasha",
                "Rogers",
                "Stark"};

        textLines = new String[] {"Banner: So, this all seems horrible.",
                "Natasha: I've seen worse.",
                "Banner: Sorry.",
                "Natasha: No, we could use a little worse.",
                "Rogers: Stark, we got him",
                "Stark: Banner?",
                "Rogers: Just like you said.",
                "Stark: Then tell him to suit up, I'm bringing the party to you.",
                "Natasha: I don't see how that's a party.",
                "Rogers: Dr.Banner, Now might be a really good time for you to get angry.",
                "Banner: That's my secret, captain.",
                "Banner: I'm always angry"};

        result = "Banner:\n" +
                "1) So, this all seems horrible.\n" +
                "3) Sorry.\n" +
                "11) That's my secret, captain.\n" +
                "12) I'm always angry.\n" +
                "\n" +
                "Natasha:\n" +
                "2) I've seen worse.\n" +
                "4) No, we could use a little worse.\n" +
                "9) I don't see how that's a party.\n" +
                "\n" +
                "Rogers:\n" +
                "5) Stark, we got him\n" +
                "7) Just like you said.\n" +
                "10) Dr.Banner, Now might be a really good time for you to get angry.\n" +
                "\n" +
                "Stark:\n" +
                "6) Banner?\n"+
                "8) Then tell him to suit up, I'm bringing the party to you.\n";

        assertNotEquals(result, Task_5_1_10.printTextPerRole(roles, textLines));
    }

    @Test
    void test5_PrintTextPerRole() {
        roles = new String[]{"WORLD", "FOLLY"};
        textLines = new String[]{
                "WORLD: Welcome, dear Folly, to this stage of mine, " +
                        "The theatre of the world, where I display The vast variety of human life.",
                "FOLLY: I thank you, World, for giving me this place To show my tricks and antic ways, and prove " +
                        "That wisdom is but folly, after all.",
                "WORLD: Indeed, dear Folly, you are very wise, For you can make the wise man play the fool, " +
                        "And teach the fool to think himself a sage.",
                "FOLLY: That is my art, dear World, and I will use it To play my part to the utmost of my skill.",
                "WORLD: And I, dear Folly, will assist you well, By showing men the things they love are empty, " +
                        "And that the things they hate are often good.",
                "FOLLY: Then let us start, dear World, and play our parts, To show the world the comedy of life, " +
                        "And teach men how to laugh at their own folly."};

        result = "WORLD:\n" +
                "1) Welcome, dear Folly, to this stage of mine, The theatre of the world, where I display The vast variety of human life.\n" +
                "\n" +
                "3) Indeed, dear Folly, you are very wise, For you can make the wise man play the fool, And teach the fool to think himself a sage.\n" +
                "\n" +
                "5) And I, dear Folly, will assist you well, By showing men the things they love are empty, And that the things they hate are often good.\n" +
                "\n" +
                "FOLLY:\n" +
                "2) I thank you, World, for giving me this place To show my tricks and antic ways, and prove That wisdom is but folly, after all.\n" +
                "\n" +
                "4) That is my art, dear World, and I will use it To play my part to the utmost of my skill.\n" +
                "\n" +
                "6) Then let us start, dear World, and play our parts, To show the world the comedy of life, And teach men how to laugh at their own folly.\n" +
                "\n";

        assertNotEquals(result, Task_5_1_10.printTextPerRole(roles, textLines));
    }

    @Test
    void test6_PrintTextPerRole() {
        roles = new String[]{"WORLD", "FOLLY"};
        textLines = new String[]{
                "WORLD: Welcome, dear Folly, to this stage of mine, " +
                        "The theatre of the world, where I display The vast variety of human life.",
                "FOLLY: I thank you, World, for giving me this place To show my tricks and antic ways, and prove " +
                        "That wisdom is but folly, after all.",
                "WORLD: Indeed, dear Folly, you are very wise, For you can make the wise man play the fool, " +
                        "And teach the fool to think himself a sage.",
                "FOLLY: That is my art, dear World, and I will use it To play my part to the utmost of my skill.",
                "WORLD: And I, dear Folly, will assist you well, By showing men the things they love are empty, " +
                        "And that the things they hate are often good.",
                "FOLLY: Then let us start, dear World, and play our parts, To show the world the comedy of life, " +
                        "And teach men how to laugh at their own folly."};

        result = "WORLD:\n" +
                "1) Welcome, dear Folly, to this stage of mine, The theatre of the world, where I display The vast variety of human life.\n" +
                "3) Indeed, dear Folly, you are very wise, For you can make the wise man play the fool, And teach the fool to think himself a sage.\n" +
                "5) And I, dear Folly, will assist you well, By showing men the things they love are empty, And that the things they hate are often good.\n\n" +
                "FOLLY:\n" +
                "2) I thank you, World, for giving me this place To show my tricks and antic ways, and prove That wisdom is but folly, after all.\n" +
                "4) That is my art, dear World, and I will use it To play my part to the utmost of my skill.\n" +
                "6) Then let us start, dear World, and play our parts, To show the world the comedy of life, And teach men how to laugh at their own folly.\n\n";

        assertEquals(result, Task_5_1_10.printTextPerRole(roles, textLines));
    }

}
