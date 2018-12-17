package org.bumblebee.until;

import org.bumblebee.WebSocket.WebSocketChat;

import java.util.LinkedList;
import java.util.concurrent.CopyOnWriteArraySet;

public class WebSocketUntil {
    public static CopyOnWriteArraySet<WebSocketChat> temp =new CopyOnWriteArraySet<>();

    public void temp_add(WebSocketChat webSocketChat){
        temp.add(webSocketChat);
    }
    public void temp_remove(WebSocketChat webSocketChat){
        temp.remove(webSocketChat);
    }

    public void finally_do(){
        if (!temp.isEmpty()){
            for (WebSocketChat ws: temp) {
                int id=ws.getRoomId();
                LinkedList<WebSocketChat> ls =WebSocketChat.webSocketRoom.get(id);
                if(ls.isEmpty()){
                    ls = new LinkedList<>();
                }
                ls.add(ws);
                WebSocketChat.webSocketRoom.put(id,ls);
            }
            temp.clear();
        }
    }
}
