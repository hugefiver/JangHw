package Server.Control;

public class Add implements Runnable {
    String msg;
    MsgBox box;

    @Override
    public void run() {
        box.addToAll(msg);
    }

    public Add(String msg, MsgBox box) {
        this.msg = msg;
        this.box = box;
    }
}
