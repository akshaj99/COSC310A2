package ui;

public class Movies implements Answers{
    @Override
    public void like() {
        System.out.println("I love watching movies!");
    }

    @Override
    public void knowAbout() {
        System.out.println("Watching movies is a good way to help us relax.");
    }

    @Override
    public void habit() {
        System.out.println("I like watching action movies and romance movies, hope you will like it too.");
    }
}
