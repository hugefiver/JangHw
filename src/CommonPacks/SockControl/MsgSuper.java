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

    /**
     * 判断是否为空
     * @return is_empty: boolean
     */
    public abstract boolean isEmpty();
}
