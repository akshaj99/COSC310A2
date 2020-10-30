package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import ui.Conversation;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestTopicPainting {
    String input1 = "Do you like painting?";
    String input2 = "What do you know about painting?";
    String input3 = "What is your habit on painting?";
    String output1 = "I love painting!\n";
    String output2 = "Drawing is not a easy task, it needs a long time practice.\n";
    String output3 = "I often appreciate famous paintings, which also helps to improve my aesthetics.\n";
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
    public void likePaintingTest(){
        ArrayList<String> q = c.splitOnSpace(input1);
        c.userAskQuestion(q);
        assertEquals(output1,outContent.toString());
    }

    @Test
    public void knowPaintingTest(){
        ArrayList<String> q = c.splitOnSpace(input2);
        c.userAskQuestion(q);
        assertEquals(output2,outContent.toString());
    }

    @Test
    public void habitPaintingTest(){
        ArrayList<String> q = c.splitOnSpace(input3);
        c.userAskQuestion(q);
        assertEquals(output3,outContent.toString());
    }

}
