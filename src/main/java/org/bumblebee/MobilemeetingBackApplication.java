package org.bumblebee;

import org.bumblebee.WebSocket.WebSocketChat;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MobilemeetingBackApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(MobilemeetingBackApplication.class, args);
        WebSocketChat.setApplicationContext(applicationContext);
    }
}
