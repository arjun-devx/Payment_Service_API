package devx.arjun.PaymentService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class PaymentServiceApplication {
	public static void main(String[] args) {

		SpringApplication.run(PaymentServiceApplication.class, args);
	}
}
