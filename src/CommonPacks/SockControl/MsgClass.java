package CommonPacks.SockControl;

import java.net.Socket;
import java.io.*;

public class MsgClass extends MsgSuper{
    private StringBuffer message;

    private DataOutputStream output;

    public MsgClass(Socket sock) {
        message = new StringBuffer();
        try {
            output = new DataOutputStream(sock.getOutputStream());
        } catch (IOException ex) {
        }
    }

    @Override
    public synchronized boolean sendMsg() {
        if(message.length() != 0) {
            try {
                output.writeUTF(message.toString());
                message = new StringBuffer();
                return true;
            } catch (IOException ex) {
                return false;
            }
        }
        else
            return true;
    }

    @Override
    public synchronized void addMsg(String msg) {
        message.append(msg);
    }

    @Override
    public boolean isEmpty() {
        return message.length() == 0;
    }
}
