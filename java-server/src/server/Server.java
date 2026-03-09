package server;

import com.sun.net.httpserver.HttpServer;

import controller.RecipeController;

import java.io.IOException;
import java.net.InetSocketAddress;

public class Server {

    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);

        RecipeController recipeController = new RecipeController();
        server.createContext("/recipes", recipeController::handle);

        server.start();

        System.out.println("Server running on http://localhost:8080");
    }
}