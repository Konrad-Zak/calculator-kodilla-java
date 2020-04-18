package com.kodilla.patterns.builder.bigmac;

import java.util.*;

public class BigMac {

    private boolean bun;
    private int burgers;
    private String sauce;
    private List<String> ingredients;


    public static class BigMacBuilder {
        private boolean bun;
        private int burgers;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();
        private List<String> sauces = Arrays.asList("standard","1000 islands","barbecue");
        private List<String> availableIngredients = Arrays.asList("lettuce", "onion", "bacon", "cucumber",
                "chili peppers", "mushrooms", "shrimps", "cheese");

        public BigMacBuilder bun(boolean bun){
            this.bun = bun;
            return this;
        }

        public BigMacBuilder burger(int burgers){
            this.burgers = burgers;
            return this;
        }

        public BigMacBuilder sauce(String sauce){
            if (sauces.contains(sauce)){
                this.sauce = sauce;
            } else {
                throw new IllegalStateException("There is no such sauce: " + sauce);
            }
            return this;
        }

        public BigMacBuilder ingredient(String ingredient){
            if(availableIngredients.contains(ingredient)){
                ingredients.add(ingredient);
            } else {
                throw new IllegalStateException("There is no such ingredient: " + ingredient);
            }
            return this;
        }

        public BigMac build(){
            return new BigMac(bun,burgers,sauce,ingredients);
        }
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public boolean isBun() {
        return bun;
    }

    public String getSauce() {
        return sauce;
    }

    public int getBurgers() {
        return burgers;
    }

    @Override
    public String toString() {
        return "BigMac: " +
                "bun with sesame: " + bun +
                " burgers: " + burgers +
                " sauce: " + sauce +
                " ingredients: " + ingredients;
    }

    private BigMac(boolean bun, int burgers, String sauce, List<String> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = ingredients;
    }
}
