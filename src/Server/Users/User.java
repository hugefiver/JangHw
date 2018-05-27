package Server.Users;

import CommonPacks.SockControl.MsgClass;

import java.net.*;

public class User {
    UserInfo info;

    UserSet group;

    public MsgClass msgBox;

    public User(String name, UserSet group) {
        this.info.name = name;
        this.group = group;
    }

    public String getName() {
        return info.name;
    }

    public Socket getsock () {
        return info.sock;
    }

    public void setSock(Socket sock) {
        this.info.sock = sock;
    }

    public void createMsgBox() {
        msgBox = new MsgClass(info.sock);
    }

    public void setMsgBox(MsgClass messageBox) {
        msgBox = messageBox;
    }
}

class UserInfo {
    String name;
    Socket sock;
}