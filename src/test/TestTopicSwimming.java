package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import ui.Conversation;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestTopicSwimming {
    String input1 = "Do you like swimming?";
    String input2 = "What do you know about swimming?";
    String input3 = "What is your habit on swimming?";
    String output1 = "I love swimming!\n";
    String output2 = "Swimming is a very active sport. The muscles of the whole body will be practiced during swimming.\n";
    String output3 = "Don't forget to warm up before playing basketball!\n";
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
    public void likeSwimmingTest(){
        ArrayList<String> q = c.splitOnSpace(input1);
        c.userAskQuestion(q);
        assertEquals(output1,outContent.toString());
    }

    @Test
    public void knowSwimmingTest(){
        ArrayList<String> q = c.splitOnSpace(input2);
        c.userAskQuestion(q);
        assertEquals(output2,outContent.toString());
    }

    @Test
    public void habitSwimmingTest(){
        ArrayList<String> q = c.splitOnSpace(input3);
        c.userAskQuestion(q);
        assertEquals(output3,outContent.toString());
    }

}
