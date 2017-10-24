package controller.ThreadSafe;

public class Input implements Runnable {
    private Resource resource;


    public Input(Resource r) {
        this.resource = r;
    }


    public void run() {
        int i = 0;
        while (true) {
            synchronized (resource) {
                if (resource.flag) {
                    try {
                        resource.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                } else {
                    if (i % 2 == 0) {
                        resource.name = "张三";
                        resource.sex = "男";

                    } else {
                        resource.name = "lisi";
                        resource.sex = "nv";
                    }
                }
                resource.flag = true;
                resource.notify();
            }
            i++;
        }
    }


}
