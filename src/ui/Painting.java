package ui;

public class Painting implements Answers{
    @Override
    public void like() {
        System.out.println("I love painting!");
    }

    @Override
    public void knowAbout() {
        System.out.println("Drawing is not a easy task, it needs a long time practice.");
    }

    @Override
    public void habit() {
        System.out.println("I often appreciate famous paintings, which also helps to improve my aesthetics.");
    }
}
