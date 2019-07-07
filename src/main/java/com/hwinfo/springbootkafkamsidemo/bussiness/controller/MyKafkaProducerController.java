package com.hwinfo.springbootkafkamsidemo.bussiness.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/kafka")
public class MyKafkaProducerController {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @RequestMapping("/send")
    public String send(String msg){
        kafkaTemplate.send("tianyafu001", msg);
        return "success";
    }

}
