package service;

import repository.RecipeRepository;
import java.util.Collection;
import model.Recipe;

public class RecipeService {
    private RecipeRepository recipeRepository;

    public RecipeService(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    public Collection<Recipe> getAll() {
        return recipeRepository.findAll();
    }
}