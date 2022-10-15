package com.example.demo.producer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;

@Service
public class MessageProducer {
	
	private Logger log =LoggerFactory.getLogger(MessageProducer.class);
	
	@Autowired 
    private KafkaTemplate<String, User> kafkaTemplate;

    @Value("${myapp.kafka.topic}")
    private String topic;

    public void sendMessage(User usr) {
       log.info("MESSAGE SENT FROM PRODUCER END -> " + usr.toString());
       kafkaTemplate.send(topic, usr);
    }

}
