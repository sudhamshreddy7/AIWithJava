package com.sudhamsh.AIWithJava.Controller;

import com.sudhamsh.AIWithJava.RecipeAI.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GenerateRecipyController {
    @Autowired
    RecipeService recipeService;
    @GetMapping("recipe")
    public String generateRecipy(@RequestParam(defaultValue = "any") String items,
                                     @RequestParam(defaultValue = "any") String cuisine,
                                 @RequestParam(defaultValue = "none") String restrictions){
        return recipeService.createRecipe(items,cuisine,restrictions).replace("#","").replace("*","");
    }
}
