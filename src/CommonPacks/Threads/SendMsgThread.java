package CommonPacks.Threads;

import CommonPacks.SockControl.MsgSuper;

public class SendMsgThread implements Runnable {
    private MsgSuper msgClass;

    @Override
    public void run() {
        if(!msgClass.isEmpty())
            msgClass.sendMsg();
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException ex) {
        }
    }

    public SendMsgThread(MsgSuper msgBox) {
        msgClass = msgBox;
    }
}
