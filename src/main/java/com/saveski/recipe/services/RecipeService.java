package com.saveski.recipe.services;

import com.saveski.recipe.domain.Recipe;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe getRecipeById(Long l);


}
