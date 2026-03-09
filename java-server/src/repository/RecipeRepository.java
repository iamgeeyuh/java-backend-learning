package repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Collection;

import model.Recipe;

public class RecipeRepository {

    private Map<Long, Recipe> recipes = new HashMap<>();

    public RecipeRepository() {
        Recipe recipe = new Recipe(
            1L,
            "Garlic Pasta",
            "Simple pasta with garlic",
            10,
            2,
            1
        );

        recipes.put(recipe.getId(), recipe);

        Recipe recipe2 = new Recipe(
            2L,
            "Shrimp Pasta",
            "Simple pasta with shrimp",
            10,
            2,
            1
        );

        recipes.put(recipe2.getId(), recipe2);
    }

    public Collection<Recipe> findAll() {
        return recipes.values();
    }
}
