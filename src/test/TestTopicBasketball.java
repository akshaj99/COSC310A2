package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import ui.Conversation;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestTopicBasketball {
    String input1 = "Do you like playing basketball?";
    String input2 = "What do you know about basketball?";
    String input3 = "What is your habit on playing basketball?";
    String output1 = "I love playing basketball!\n";
    String output2 = "Playing basketball is a good way to exercise.\n";
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
    public void likeBasketballTest(){
       ArrayList<String> q = c.splitOnSpace(input1);
       c.userAskQuestion(q);
       assertEquals(output1,outContent.toString());
    }

    @Test
    public void knowBasketballTest(){
        ArrayList<String> q = c.splitOnSpace(input2);
        c.userAskQuestion(q);
        assertEquals(output2,outContent.toString());
    }

    @Test
    public void habitBasketballTest(){
        ArrayList<String> q = c.splitOnSpace(input3);
        c.userAskQuestion(q);
        assertEquals(output3,outContent.toString());
    }

}
