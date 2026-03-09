package dto;

import model.Recipe;
import java.util.Collection;

public class GetRecipes {
    private Collection<Recipe> recipes;

    public GetRecipes(Collection<Recipe> recipes) {
        this.recipes = recipes;
    }

    public String toJson() {

        StringBuilder sb = new StringBuilder();

        sb.append("[");
        boolean first = true;

        for (Recipe recipe : recipes) {

            if (!first) {
                sb.append(",");
            }

            sb.append(recipe.toJson());

            first = false;
        }

        sb.append("]");

        return sb.toString();
    }
}