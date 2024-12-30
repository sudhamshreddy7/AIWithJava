package com.sudhamsh.AIWithJava.ImageAI;

import org.springframework.ai.image.ImageModel;
import org.springframework.ai.image.ImagePrompt;
import org.springframework.ai.image.ImageResponse;
import org.springframework.ai.openai.OpenAiImageOptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GenerateImage {
    @Autowired
    private ImageModel imageModel;
    public ImageResponse generateAIImage(String query){
        ImageResponse response = imageModel.call(
                new ImagePrompt(query,
                        OpenAiImageOptions.builder()
                                .withQuality("standard")
                                .withN(4)
                                .withModel("dall-e-3")
                                .withHeight(1024)
                                .withWidth(1024).build())

        );
        return response;
    }
}
