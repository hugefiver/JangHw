package CommonPacks.SockControl;

public abstract class MsgSuper {
    /**
     * 发送缓冲区数据
     */
    public abstract boolean sendMsg();

    /**
     * 添加String到缓冲区
     * @param msg: String
     */
    public abstract void addMsg(String msg);
}
