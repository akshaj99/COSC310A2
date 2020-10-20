package ui;

public class Main {

    public static void main(String args[]){
      Opening s = new Opening();
      s.sayHi();
      while (true){
          Conversation c = new Conversation();
          c.userAskQuestion();
      }
    }
}
