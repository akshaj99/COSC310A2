package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import ui.Conversation;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class TestEnding {
    String input1 = "bye";
    String output1 = "It's nice talking to you. Bye.\n";
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
    public void EndingTest(){
        ArrayList<String> q = c.splitOnSpace(input1);
        c.userAskQuestion(q);
        assertEquals(output1,outContent.toString());
    }

}
