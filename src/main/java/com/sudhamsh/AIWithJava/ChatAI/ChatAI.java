package com.sudhamsh.AIWithJava.ChatAI;

import org.springframework.ai.chat.model.ChatModel;
import org.springframework.ai.chat.model.ChatResponse;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.openai.OpenAiChatOptions;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class ChatAI {
    private ChatModel chatModel;

    public ChatAI(ChatModel chatModel) {
        this.chatModel = chatModel;
    }
    //Without options
    public String getResponse(String query){
        String response = chatModel.call(query);
        return response;
    }
    //Response with Options
    public String getResponseWithOptions(String query){
        ChatResponse response = chatModel.call(
                new Prompt(
                        query,
                        OpenAiChatOptions.builder()
                                .withModel("gpt-4o-mini")
                                .withTemperature(0.4)
                                .withMaxTokens(1000)
                                .withN(1)
                                .build()
                ));
        return response.getResult().getOutput().getContent();
    }
}
