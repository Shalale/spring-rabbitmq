package com.example.springrabbitmq.controller;

import com.example.springrabbitmq.producer.Producer;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("api")
public class MessageController {
    private final Producer producer;

    @GetMapping("/publish")
    @ResponseStatus(HttpStatus.OK)
    public void sendMessage(@RequestParam("message") String message){
        producer.sendMessage(message);
    }

}
