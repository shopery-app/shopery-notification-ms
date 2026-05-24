package az.shopery.notification_ms.service;

import az.shopery.notification_ms.event.NotificationEvent;

public interface EmailService {
    void sendNotification(NotificationEvent notificationEvent);
}
