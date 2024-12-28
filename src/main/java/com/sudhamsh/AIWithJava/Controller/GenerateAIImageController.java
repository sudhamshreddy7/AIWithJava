package com.sudhamsh.AIWithJava.Controller;

import com.sudhamsh.AIWithJava.ImageAI.GenerateImage;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
public class GenerateAIImageController {
    @Autowired
    GenerateImage generateImage;

    @GetMapping("generate-image")
    public List<String> generateImages( @RequestParam String message) throws IOException {
        return  generateImage.generateAIImage(message).getResults().stream().
                map(result -> result.getOutput().getUrl()).toList();
//        response.sendRedirect(imageURL);
    }
}
