package JavaOOps.Interface;

public class CDPlayer implements Media{

    @Override
    public void stop() {
        System.out.println("Media is stopped");

    }

    @Override
    public void start() {
        System.out.println("Media is start");

    }
}
