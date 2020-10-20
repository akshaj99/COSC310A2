package ui;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;
import java.util.Scanner;

public class Conversation {

    Scanner input;
    String inputQuestion;
    ArrayList<String> question = new ArrayList<String>();

    public void userAskQuestion(){
        input = new Scanner(System.in);
        inputQuestion = input.nextLine();
        question = splitOnSpace(inputQuestion);
        if (question.contains("reading")){
            Answers r = new Reading();
            differentQuestions(r);
        }
        else if (question.contains("basketball")){
            Answers b = new Basketball();
            differentQuestions(b);
        }
        else if (question.contains("cooking")){
            Answers c = new Cooking();
            differentQuestions(c);
        }
        else if (question.contains("painting")){
            Answers p = new Painting();
            differentQuestions(p);
        }
        else if (question.contains("movies")){
            Answers m = new Movies();
            differentQuestions(m);
        }
        else if (question.contains("swimming")){
            Answers s = new Swimming();
            differentQuestions(s);
        }
        else {
            if (question.contains("like")) {
                System.out.println("Sorry, I haven't tried it before. Do you want to introduce it for me?");
                Scanner a = new Scanner(System.in);
                String b = a.next();
                System.out.println("Cool! That's interesting!");
            }
            else if (question.contains("bye")){
                System.out.println("It's nice talking to you. Bye.");
                System.exit(0);
            }
            else {
                System.out.println("I'm sorry I don't understand. Could we talk about something else?");
            }
        }
    }

    public ArrayList<String> splitOnSpace(String line){
        String[] splits = line.split("\\W+");
        return new ArrayList<>(Arrays.asList(splits));
    }

    public void differentQuestions(Answers a){
        if (question.contains("like")){
            a.like();
        }
        else if (question.contains("know")&&question.contains("about")){
            a.knowAbout();
        }
        else if (question.contains("habit")){
            a.habit();
        }
        else{
            System.out.println("I'm sorry I don't understand. Could we talk about something else?");
        }
    }
}
