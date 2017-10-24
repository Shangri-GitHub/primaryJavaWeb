package controller.deadLock;

public class LockB {
    private LockB() {
    }

    public static final LockB lockb = new LockB();
}
