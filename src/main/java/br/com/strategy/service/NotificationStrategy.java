package br.com.strategy.service;

import org.springframework.stereotype.Component;

@Component
public interface NotificationStrategy {

    void sendNotification(String destination, String message);
}
