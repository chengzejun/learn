package com.chengzejun;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.socket.config.annotation.EnableWebSocket;

@SpringBootApplication
@EnableWebSocket
public class ApplicationSocket {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationSocket.class,args);
    }
}
