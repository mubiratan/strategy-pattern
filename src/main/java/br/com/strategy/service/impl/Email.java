package br.com.strategy.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import br.com.strategy.service.NotificationStrategy;

@Component
public class Email implements NotificationStrategy {
    private final Logger logger = LoggerFactory.getLogger(Email.class);

    @Override
    public void sendNotification(String destination, String message) {
        logger.info("Notificacao [{}] enviada para o Email [{}]", message, destination);
    }
}
