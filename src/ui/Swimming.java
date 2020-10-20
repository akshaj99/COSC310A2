package ui;

public class Swimming implements Answers{

    @Override
    public void like() {
        System.out.println("I love swimming!");
    }

    @Override
    public void knowAbout() {
        System.out.println("Swimming is a very active sport. The muscles of the whole body will be practiced during swimming.");
    }

    @Override
    public void habit() {
        System.out.println("Don't forget to warm up before playing basketball!");
    }
}
