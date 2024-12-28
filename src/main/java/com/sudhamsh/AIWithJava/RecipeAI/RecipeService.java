package com.sudhamsh.AIWithJava.RecipeAI;

import com.sudhamsh.AIWithJava.ChatAI.ChatAI;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.chat.prompt.PromptTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class RecipeService {
    @Autowired
    ChatAI chatAI;
    public String createRecipe(String items, String cuisine, String restrictions){
        var promot = """
                    I want recipe using the following items: {items},
                    the cuisine is :{cuisine},
                    and it shouldn't have the following:{restrictions}.
                    Please provide a detailed instructions of the recipe
                """;
        PromptTemplate promptTemplate = new PromptTemplate(promot);
        Map<String ,Object> map = Map.of(
                "items",items,
                "cuisine",cuisine,
                "restrictions",restrictions
        );
        Prompt prompt = promptTemplate.create(map);
//        System.out.println(prompt);
        return chatAI.getResponseWithOptions(prompt.toString());
    }
}
