package az.shopery.notification_ms.kafka.consumer;

import az.shopery.notification_ms.event.NotificationEvent;
import az.shopery.notification_ms.service.EmailService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class NotificationConsumer {

    private final EmailService emailService;

    @KafkaListener(topics = "${topic.notification}", groupId = "notification-group")
    public void consume(NotificationEvent event) {
        log.info("Received notification event for {}", event.to());
        emailService.sendNotification(event);
    }
}
