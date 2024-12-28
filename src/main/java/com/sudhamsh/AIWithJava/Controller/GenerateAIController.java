package com.sudhamsh.AIWithJava.Controller;

import com.sudhamsh.AIWithJava.ChatAI.ChatAI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GenerateAIController {
    @Autowired
    ChatAI chatAI;
    @GetMapping("QueryAI")
    public String generateResponse(@RequestParam String message){
        return  chatAI.getResponseWithOptions(message);
    }
}
