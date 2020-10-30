package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import ui.Conversation;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestTopicReading {
    String input1 = "Do you like reading?";
    String input2 = "What do you know about reading?";
    String input3 = "What is your habit on reading?";
    String output1 = "I love reading!\n";
    String output2 = "Reading is a good way for us to gain knowledge and enrich our experience.\n";
    String output3 = "I read for half an hour every day, which helps me develop good reading habits.\n";
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
    public void likeReadingTest(){
        ArrayList<String> q = c.splitOnSpace(input1);
        c.userAskQuestion(q);
        assertEquals(output1,outContent.toString());
    }

    @Test
    public void knowReadingTest(){
        ArrayList<String> q = c.splitOnSpace(input2);
        c.userAskQuestion(q);
        assertEquals(output2,outContent.toString());
    }

    @Test
    public void habitReadingTest(){
        ArrayList<String> q = c.splitOnSpace(input3);
        c.userAskQuestion(q);
        assertEquals(output3,outContent.toString());
    }

}
