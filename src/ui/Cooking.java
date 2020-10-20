package ui;

public class Cooking implements Answers{
    @Override
    public void like() {
        System.out.println("I loving cooking!");
    }

    @Override
    public void knowAbout() {
        System.out.println("Cooking by yourself is a very fulfilling thing.");
    }

    @Override
    public void habit() {
        System.out.println("I will cook by myself on weekends.");
    }
}
