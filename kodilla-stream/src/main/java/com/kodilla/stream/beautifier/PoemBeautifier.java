package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify(String text, PoemDecorator poemDecorator){
        System.out.println("\nText before: "+ text + "\nText after beautifly: " + poemDecorator.decorate(text));
    }
}
