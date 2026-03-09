package server;

import com.sun.net.httpserver.HttpServer;

import controller.RecipeController;
import repository.RecipeRepository;
import service.RecipeService;

import java.io.IOException;
import java.net.InetSocketAddress;

public class Server {

    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);

        RecipeRepository recipeRepository = new RecipeRepository();
        RecipeService recipeService = new RecipeService(recipeRepository);
        RecipeController recipeController = new RecipeController(recipeService);
        server.createContext("/recipes", recipeController::handle);

        server.start();

        System.out.println("Server running on http://localhost:8080");
    }
}