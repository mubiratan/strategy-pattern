package br.com.strategy.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class NotificationService {
    // Autowired will inject the map of NotificationStrategy implementations
    // The key is the channelname (e.g., "discord", "instagram", etc
    @Autowired
    private final Map<String, NotificationStrategy> mapStrategy;

//    private final Map<String, NotificationStrategy> mapStrategy = Map.of(
//        "discord", new DiscordNotificationStrategy(),
//        "instagram", new InstagramNotificationStrategy(),
//        "twitter", new TwitterNotificationStrategy(),
//        "email", new EmailNotificationStrategy(),
//        "whatsapp", new WhatsappNotificationStrategy()
//    );
    private final Logger logger = LoggerFactory.getLogger(NotificationService.class);

    public NotificationService(Map<String, NotificationStrategy> mapStrategy) {
        this.mapStrategy = mapStrategy;
    }

    public void notify(String channel, String destination, String message) {
        mapStrategy.get(channel.toLowerCase()).sendNotification(destination, message);
    }
}
