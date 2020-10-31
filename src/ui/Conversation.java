package ui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Conversation {

    public void userAskQuestion(ArrayList<String> question){
        if (question.contains("reading")){
            Answers r = new Reading();
            differentQuestions(question,r);
        }
        else if (question.contains("basketball")){
            Answers b = new Basketball();
            differentQuestions(question,b);
        }
        else if (question.contains("cooking")){
            Answers c = new Cooking();
            differentQuestions(question,c);
        }
        else if (question.contains("painting")){
            Answers p = new Painting();
            differentQuestions(question,p);
        }
        else if (question.contains("movies")){
            Answers m = new Movies();
            differentQuestions(question,m);
        }
        else if (question.contains("swimming")){
            Answers s = new Swimming();
            differentQuestions(question,s);
        }
        else {
            if (question.contains("like")) {
                System.out.println("Sorry, I haven't tried it before. Do you want to introduce it for me?");
            }
            else if (question.contains("bye")){
                System.out.println("It's nice talking to you. Bye.");
            }
            else if (question.size()==1){
                System.out.println("I'm sorry I don't understand. Could we talk about something else?");
            }
            else{
                System.out.println("That's interesting!");
            }
        }
    }

    public ArrayList<String> input(){
        Scanner input = new Scanner(System.in);
        String inputQuestion = input.nextLine();
        ArrayList<String> q = splitOnSpace(inputQuestion);
        return q;
    }

    public ArrayList<String> splitOnSpace(String line){
        String[] splits = line.split("\\W+");
        return new ArrayList<>(Arrays.asList(splits));
    }

    public void differentQuestions(ArrayList<String> q, Answers a){
        if (q.contains("like")){
            a.like();
        }
        else if (q.contains("know")&&q.contains("about")){
            a.knowAbout();
        }
        else if (q.contains("habit")){
            a.habit();
        }
        else{
            System.out.println("I'm sorry I don't understand. Could we talk about something else?");
        }
    }
}
