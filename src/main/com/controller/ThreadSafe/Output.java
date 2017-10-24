package controller.ThreadSafe;

public class Output implements Runnable {
    private Resource resource;

    public Output(Resource r) {
        this.resource = r;
    }

    public void run() {
        while (true) {

            synchronized (resource) {
                if(!resource.flag){
                    try {
                        resource.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("name:" + resource.name + " sex:" + resource.sex);
                resource.flag = false;
                resource.notify();

            }

        }
    }
}
