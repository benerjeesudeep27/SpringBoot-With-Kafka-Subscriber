package com.kafka.subscriber;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

import com.kafka.subscriber.constants.AppConstants;

@SpringBootApplication
public class KafkaSubscriber1Application {

	public static void main(String[] args) {
		SpringApplication.run(KafkaSubscriber1Application.class, args);
	}


	@KafkaListener(topics = AppConstants.TOPIC, groupId = AppConstants.GROUP_ID)
	public void receiveCustomer(String customerDetails) {
		System.out.println("* * * Received Message From Publisher. . .* * *");
		System.out.println(customerDetails);
	}
}
