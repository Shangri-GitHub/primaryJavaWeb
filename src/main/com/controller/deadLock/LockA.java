package controller.deadLock;

public class LockA {
    private LockA() {
    }

    public static final LockA locka = new LockA();
}
