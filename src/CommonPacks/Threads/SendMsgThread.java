package CommonPacks.Threads;

import CommonPacks.SockControl.MsgSuper;

public class SendMsgThread implements Runnable {
    private MsgSuper msgClass;
    @Override
    public void run() {
        msgClass.sendMsg();
    }

    public SendMsgThread(MsgSuper msgBox) {
        msgClass = msgBox;
    }
}
