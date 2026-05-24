package az.shopery.notification_ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class NotificationMsApplication {

	static void main(String[] args) {
		SpringApplication.run(NotificationMsApplication.class, args);
	}
}
