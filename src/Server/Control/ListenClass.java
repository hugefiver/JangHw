package Server.Control;

import Server.Users.*;

import java.io.DataInputStream;
import java.io.IOException;

public class ListenClass implements Runnable {
    User me;
    UserSet group;
    MsgBox box;
    DataInputStream input;

    @Override
    public void run() {
        while(true) {
            try {
                String msg = input.readUTF();
                new Thread(new AddExcept("[" + me.getName() + "] " + msg + "\n",
                                            box, me.getName()));
            } catch (IOException ex) {
                new Thread(new Add(me.getName() + " Exited.\n", box));
                this.del();
            }

        }
    }

    public ListenClass(User me, UserSet group, MsgBox msgBox) {
        this.me = me;
        this.group = group;
        this.box = msgBox;
        try {
            input = new DataInputStream(me.getsock().getInputStream());
        }
        catch (IOException ex) {
        }
    }

    void del() {
        group.del(me.getName());
    }
}
