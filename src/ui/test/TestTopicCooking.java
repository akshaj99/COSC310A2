package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import ui.Conversation;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestTopicCooking {
    String input1 = "Do you like cooking?";
    String input2 = "What do you know about cooking?";
    String input3 = "What is your habit on cooking?";
    String output1 = "I loving cooking!\n";
    String output2 = "Cooking by yourself is a very fulfilling thing.\n";
    String output3 = "I will cook by myself on weekends.\n";
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
    public void likeCookingTest(){
        ArrayList<String> q = c.splitOnSpace(input1);
        c.userAskQuestion(q);
        assertEquals(output1,outContent.toString());
    }

    @Test
    public void knowCookingTest(){
        ArrayList<String> q = c.splitOnSpace(input2);
        c.userAskQuestion(q);
        assertEquals(output2,outContent.toString());
    }

    @Test
    public void habitCookingTest(){
        ArrayList<String> q = c.splitOnSpace(input3);
        c.userAskQuestion(q);
        assertEquals(output3,outContent.toString());
    }

}
