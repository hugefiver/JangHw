package Server.Users;

import CommonPacks.SockControl.MsgSuper;

import java.util.HashMap;
import java.util.Map;

public class UserMsgMap {
    private Map<String, MsgSuper> userToMsgbox;

    public UserMsgMap() {
        userToMsgbox = new HashMap<>();
    }

    public boolean isIn(String name) {
        return userToMsgbox.containsKey(name);
    }

    public void add(String name, MsgSuper msgbox) {
        userToMsgbox.put(name, msgbox);
    }

    public MsgSuper getMsgbox(String name) {
        if(isIn(name))
            return userToMsgbox.get(name);
        else
            return null;
    }

    public void del(String name) {
        if(isIn(name))
            userToMsgbox.remove(name);
    }
}