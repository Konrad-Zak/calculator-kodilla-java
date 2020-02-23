package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {
    public static void main(String[] args) {

        String addText = "SOS";
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("adam",text -> text.replace("a","p"));
        poemBeautifier.beautify("STAR WARS",text -> text.substring(2,6));
        poemBeautifier.beautify("asdfghj",String::toUpperCase);
        poemBeautifier.beautify("NOWA_HUTA",String::toLowerCase);
        poemBeautifier.beautify("CALL TO ",text -> text.concat(addText));
    }
}
