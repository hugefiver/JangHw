package CommonPacks.Threads;

import CommonPacks.SockControl.MsgSuper;

public class AddMsgThread implements Runnable {
    private String msg;
    private MsgSuper msgClass;
    @Override
    public void run() {
        msgClass.addMsg(msg);
    }

    public AddMsgThread(String message, MsgSuper msgBox) {
        msg = message;
        msgClass = msgBox;
    }
}
