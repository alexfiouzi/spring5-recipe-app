package guru.springframework.spring5recipeapp.services;

import guru.springframework.spring5recipeapp.commands.IngredientCommand;

public interface IngredientService {

    IngredientCommand findByRecipeIdAndIngredientId(Long recipeId,Long IngredientId);

    IngredientCommand saveIngredientCommand(IngredientCommand command);

    void deleteById(Long Id);

    void deleteById(Long recipeId, Long idToDelete);
}
