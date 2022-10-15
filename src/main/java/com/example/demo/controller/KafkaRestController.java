package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.producer.MessageProducer;
import com.example.demo.repo.MessageRepository;

@RestController
public class KafkaRestController {

      @Autowired
      private MessageProducer producer;

      @Autowired
      private MessageRepository messageRepo;

      //Send message to kafka
      @GetMapping("/send")
      public String publishMsg(
      @RequestParam("name") String name,
      @RequestParam("dept") String dept,
      @RequestParam("sal") Long sal) {
          producer.sendMessage(new User(name, dept, sal));
          return "" + name  + " created successfully!";
      }

      //Read all messages
      @GetMapping("/getAll")
      public String getAllMessages() {
         return messageRepo.getAllMessages() ;
      }
}
