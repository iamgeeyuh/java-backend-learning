package model;

import java.lang.StringBuilder;

public class Recipe {
    private Long id;
    private String name;
    private String description;
    private int prepTimeMinutes;
    private int cookTimeMinutes;
    private int servings;

    public Recipe(
            Long id,
            String name,
            String description,
            int prepTimeMinutes,
            int cookTimeMinutes,
            int servings) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.prepTimeMinutes = prepTimeMinutes;
        this.cookTimeMinutes = cookTimeMinutes;
        this.servings = servings;
    }

    public String toJson() {

        StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append("\"id\":").append(this.id).append(",");
        sb.append("\"name\":\"").append(this.name).append("\"");
        sb.append("}");

        return sb.toString();
    }

    public Long getId() {
        return this.id;
    }
}