package az.shopery.notification_ms.event;

import az.shopery.notification_ms.util.enums.NotificationType;
import java.util.Map;

public record NotificationEvent(
        String to,
        NotificationType type,
        Map<String, Object> params) {
}
