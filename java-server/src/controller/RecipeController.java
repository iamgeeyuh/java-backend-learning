package controller;

import java.io.IOException;

import com.sun.net.httpserver.HttpExchange;

import dto.GetRecipes;
import service.RecipeService;
import util.HttpUtil;
import model.Recipe;
import java.util.Collection;

public class RecipeController {

    private RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    public void handle(HttpExchange exchange) throws IOException {

        String method = exchange.getRequestMethod();
        String path = exchange.getRequestURI().getPath();

        // Split path into parts
        String[] parts = path.split("/");

        try {

            // GET /recipes
            if (method.equals("GET") && parts.length == 2) {
                getAllRecipes(exchange);
                return;
            }

            // If nothing matched
            HttpUtil.sendResponse(exchange, 404, "Not Found");

        } catch (Exception e) {
            HttpUtil.sendResponse(exchange, 500, "Internal Server Error");
        }
    }

    private void getAllRecipes(HttpExchange exchange) throws IOException {
        Collection<Recipe> recipes = recipeService.getAll();
        GetRecipes response = new GetRecipes(recipes);
        HttpUtil.sendResponse(exchange, 200, response.toJson());
    }
}