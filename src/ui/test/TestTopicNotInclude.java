package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import ui.Conversation;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestTopicNotInclude {
    String input1 = "Do you like playing football?";
    String input2 = "Football is a very interesting sport.";
    String output1 = "Sorry, I haven't tried it before. Do you want to introduce it for me?\n";
    String output2 = "That's interesting!\n";
    PrintStream sysOut;
    ByteArrayOutputStream outContent = null;
    Conversation c;

    @Before
    public void setUpStreams() {
        c = new Conversation();
        outContent = new ByteArrayOutputStream();
        sysOut = System.out;
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void revertStreams() {
        System.setOut(sysOut);
    }

    @Test
    public void notIncludeAskTest(){
        ArrayList<String> q = c.splitOnSpace(input1);
        c.userAskQuestion(q);
        assertEquals(output1,outContent.toString());
    }

    @Test
    public void notIncludeAnswerTest(){
        ArrayList<String> q = c.splitOnSpace(input2);
        c.userAskQuestion(q);
        assertEquals(output2,outContent.toString());
    }
}
