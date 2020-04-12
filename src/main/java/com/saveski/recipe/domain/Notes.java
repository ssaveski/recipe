package com.saveski.recipe.domain;

import javax.persistence.*;

@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne // no cascade attribute that means if we delete note we dont want to delete the recipe too
    private Recipe recipe;

    @Lob // allows to store CLOB field in the database larger than 255 characters
    private String recipeNotes;

}
