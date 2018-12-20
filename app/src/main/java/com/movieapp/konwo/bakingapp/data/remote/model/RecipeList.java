package com.movieapp.konwo.bakingapp.data.remote.model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class RecipeList {

    @SerializedName("recipes")
    List<Recipe> recipes;

    public RecipeList() {
        recipes = new ArrayList<Recipe>();
    }

    public static RecipeList parseJson(String json) {
        Gson gson = new GsonBuilder().create();

        return gson.fromJson(json, RecipeList.class);
    }

    public List<Recipe> getRecipes() {
        return recipes;
    }
}
