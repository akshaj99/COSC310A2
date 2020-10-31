package ui;

import java.util.ArrayList;

public class Main {

    public static void main(String args[]){
      Opening s = new Opening();
      s.sayHi();
      while (true){
          Conversation c = new Conversation();
          ArrayList<String> q = c.input();
          c.userAskQuestion(q);
      }
    }
}
