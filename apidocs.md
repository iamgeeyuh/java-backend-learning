# API Endpoints

This document describes the REST API for the Meal Planning backend.

------------------------------------------------------------------------

## Recipes

### Create a recipe

**POST /recipes**

Creates a new recipe.

Request:

``` json
{
  "name": "Garlic Pasta",
  "description": "Simple pasta with garlic and olive oil",
  "prepTimeMinutes": 20,
  "servings": 2
}
```

Response:

``` json
{
  "id": 1,
  "name": "Garlic Pasta",
  "description": "Simple pasta with garlic and olive oil",
  "prepTimeMinutes": 20,
  "servings": 2
}
```

------------------------------------------------------------------------

### Get all recipes

**GET /recipes**

Returns all recipes.

------------------------------------------------------------------------

### Get recipe by ID

**GET /recipes/{id}**

Returns details for a single recipe.

------------------------------------------------------------------------

### Delete a recipe

**DELETE /recipes/{id}**

Deletes a recipe.

------------------------------------------------------------------------

## Ingredients

### Create ingredient

**POST /ingredients**

Request:

``` json
{
  "name": "Garlic",
  "unit": "cloves"
}
```

------------------------------------------------------------------------

### Get all ingredients

**GET /ingredients**

Returns all ingredients.

------------------------------------------------------------------------

## Recipe Ingredients

### Add ingredient to recipe

**POST /recipes/{recipeId}/ingredients**

Associates an ingredient with a recipe.

Request:

``` json
{
  "ingredientId": 1,
  "quantity": 2
}
```

------------------------------------------------------------------------

### Get ingredients for recipe

**GET /recipes/{recipeId}/ingredients**

Returns all ingredients required for the recipe.

------------------------------------------------------------------------

## Meal Plans

### Create meal plan

**POST /mealplans**

Request:

``` json
{
  "weekStartDate": "2026-03-02"
}
```

------------------------------------------------------------------------

### Get meal plan

**GET /mealplans/{id}**

Returns a meal plan and its scheduled recipes.

------------------------------------------------------------------------

## Meal Plan Entries

### Add recipe to meal plan

**POST /mealplans/{mealPlanId}/entries**

Request:

``` json
{
  "recipeId": 1,
  "dayOfWeek": "MONDAY"
}
```

------------------------------------------------------------------------

### Get entries for meal plan

**GET /mealplans/{mealPlanId}/entries**

Returns all recipes scheduled for the week.

------------------------------------------------------------------------

## Grocery List

### Generate grocery list

**GET /mealplans/{mealPlanId}/grocery-list**

Aggregates ingredients from recipes in the meal plan.

Example response:

``` json
[
  {
    "ingredient": "Garlic",
    "quantity": 4,
    "unit": "cloves"
  },
  {
    "ingredient": "Pasta",
    "quantity": 400,
    "unit": "grams"
  }
]
```
