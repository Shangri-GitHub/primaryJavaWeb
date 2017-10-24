package controller.ThreadSafe;

public class ThradSafeDemo {
    public static void main(String[] args) {
        Resource resource = new Resource();
        Input input = new Input(resource);
        Output output = new Output(resource);

        Thread t1 = new Thread(input);
        Thread t2 = new Thread(output);

        t1.start();
        t2.start();


    }
}
