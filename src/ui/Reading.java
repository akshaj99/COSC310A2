package ui;

public class Reading implements Answers{

    @Override
    public void like(){
        System.out.println("I love reading!");
    }

    @Override
    public void knowAbout(){
        System.out.println("Reading is a good way for us to gain knowledge and enrich our experience.");
    }

    @Override
    public void habit() {
        System.out.println("I read for half an hour every day, which helps me develop good reading habits.");
    }
}
