package Server.Control;

public class AddExcept implements Runnable {
    String msg;
    MsgBox box;
    String name;

    @Override
    public void run() {
        box.addExcept(msg, name);
    }

    public Add(String msg, MsgBox box, String expectUser) {
        this.msg = msg;
        this.box = box;
        this.name = expectUser;
    }
}
