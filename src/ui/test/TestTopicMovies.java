package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import ui.Conversation;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestTopicMovies {
    String input1 = "Do you like movies?";
    String input2 = "What do you know about movies?";
    String input3 = "What is your habit on watching movies?";
    String output1 = "I love watching movies!\n";
    String output2 = "Watching movies is a good way to help us relax.\n";
    String output3 = "I like watching action movies and romance movies, hope you will like it too.\n";
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
    public void likeMoviesTest(){
        ArrayList<String> q = c.splitOnSpace(input1);
        c.userAskQuestion(q);
        assertEquals(output1,outContent.toString());
    }

    @Test
    public void knowMoviesTest(){
        ArrayList<String> q = c.splitOnSpace(input2);
        c.userAskQuestion(q);
        assertEquals(output2,outContent.toString());
    }

    @Test
    public void habitMoivesTest(){
        ArrayList<String> q = c.splitOnSpace(input3);
        c.userAskQuestion(q);
        assertEquals(output3,outContent.toString());
    }

}
