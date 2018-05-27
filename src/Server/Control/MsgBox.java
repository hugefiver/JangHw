package Server.Control;

import CommonPacks.SockControl.MsgSuper;
import CommonPacks.Threads.AddMsgThread;
import CommonPacks.Threads.SendMsgThread;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MsgBox {
    Set<MsgSuper> msgBoxs = new HashSet<>();
    Map<String, MsgSuper> boxMap = new HashMap<>();
    ExecutorService addMsgThreads = Executors.newCachedThreadPool();
    ExecutorService sendMsgThreads = Executors.newCachedThreadPool();

    public void addBox(MsgSuper box, String name) {
        if(!boxMap.containsKey(name)) {
            msgBoxs.add(box);
            boxMap.put(name, box);
        }
    }

    public void sendThread(MsgSuper box) {
        addMsgThreads.execute(new SendMsgThread(box));
    }

    public void addToAll(String msg) {
        for(MsgSuper x: msgBoxs) {
            addMsgThreads.execute(new AddMsgThread(msg, x));
        }
    }

    public void addExcept(String msg, String name) {
        Set<String> nameSet = boxMap.keySet();
        nameSet.remove(name);
        for(String name: nameSet) {
            addMsgThreads.execute(new AddMsgThread(msg, boxMap.get(name)));
        }
    }
}
