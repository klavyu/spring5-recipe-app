package guru.springframework.spring5recipeapp.service;

import guru.springframework.spring5recipeapp.command.IngredientCommand;

public interface IngredientService {
    IngredientCommand findByRecipeIdAndId(Long recipeId, Long ingredientId);
    IngredientCommand saveIngredientCommand(IngredientCommand ingredientCommand);
}
