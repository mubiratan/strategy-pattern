package br.com.strategy.service;

public interface NotificationStrategy {

    void sendNotification(String destination, String message);
}
