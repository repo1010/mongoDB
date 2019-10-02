package com.spring.springmongorabbit.service;

import java.util.List;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.spring.springmongorabbit.model.Employee;

@Service
public class RabbitMQService {

	@Autowired
	private AmqpTemplate rabbitTemplate;

	@Value("${app.rabbitmq.routingkey}")
	private String routingKey;

	@Value("${app.rabbitmq.exchange}")
	private String exchang;
	
	public boolean publishMesaage(List<Employee> empList) {
		rabbitTemplate.convertAndSend(exchang, routingKey, empList);
		System.out.println("Send Message: " + empList);
		
		return true;		
	}
}
