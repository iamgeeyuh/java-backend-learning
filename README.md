# Backend Architecture Playground

This repository explores backend architecture by implementing the same
REST API using multiple technologies in the Java ecosystem.

The goal is to understand how backend frameworks evolve from lower-level
tools by progressively building the same server with:

-   Java (no framework)
-   Groovy
-   Spring
-   Spring Boot
-   Grails

Each implementation highlights what the framework provides and how it
reduces boilerplate.

------------------------------------------------------------------------

## Project Structure

    backend-architecture-playground

    java-server/
    groovy-server/
    spring-server/
    spring-boot-server/
    grails-server/

Each folder contains the same API implemented with a different stack.

------------------------------------------------------------------------

## API Overview

The API implements a simple **meal planning system** where users can:

-   create recipes
-   manage ingredients
-   add recipes to a weekly meal plan
-   generate a grocery list from planned meals

------------------------------------------------------------------------

## Architecture

    Controller → handles HTTP requests
    Service → business logic
    Repository → data access
    DTO → request/response models
    Domain Model → core entities

------------------------------------------------------------------------

## Learning Focus

This project is intended to practice:

-   REST API design
-   dependency injection
-   DTO patterns
-   service-layer architecture
-   persistence with MySQL
-   backend testing

------------------------------------------------------------------------

## Notes

This repository was created for learning purposes to better understand
backend development in the Java ecosystem.
