package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;
import java.util.HashSet;
import java.util.Set;
import static org.junit.Assert.*;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest(){
        //Given
        Set<Book> bookSet = new HashSet<>();
        MedianAdapter medianAdapter = new MedianAdapter();
        bookSet.add(new Book("a","a",1990,"11111"));
        bookSet.add(new Book("b","b",1995,"22222"));
        bookSet.add(new Book("c","c",2000,"33333"));
        bookSet.add(new Book("d","d",2005,"44444"));
        //When
        int medianPublicationYear = medianAdapter.publicationYearMedian(bookSet);
        //Then
        assertEquals(2000,medianPublicationYear);

    }
}
