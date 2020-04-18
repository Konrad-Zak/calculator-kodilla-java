package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.stream.IntStream;

public class LibraryTestSuite {

    private int size = 12;
    private Library library = new Library("Set of books number 1");

    @Before
    public void init(){
        IntStream.iterate(1,n->n+1)
                .limit(size)
                .forEach(n -> library.getBooks().add(new Book("title "+ n,
                        "author " + n, LocalDate.now())));
    }

    @Test
    public void testGetBooks(){
        //Given
        System.out.println(library);
        //When
        int result = library.getBooks().size();
        //Then
        Assert.assertEquals(size,result);
    }

    @Test
    public void testShallowCopy() throws CloneNotSupportedException{
        //Given
        Library clonedLibrary = library.shallowCopy();
        clonedLibrary.setName("Set of books number 2");
        //When
        library.getBooks().remove(new Book("title 8","author 8", LocalDate.now()));
        //Then
        Assert.assertEquals(library.getBooks(),clonedLibrary.getBooks());
    }

    @Test
    public void testDeepCopy() throws CloneNotSupportedException{
        //Given
        Library clonedLibrary = library.deepCopy();
        clonedLibrary.setName("Set of books number 3");
        //When
        library.getBooks().remove(new Book("title 8","author 8", LocalDate.now()));
        //Then
        Assert.assertNotEquals(library.getBooks(),clonedLibrary.getBooks());
        Assert.assertEquals(size,clonedLibrary.getBooks().size());
        Assert.assertTrue(size > library.getBooks().size());
    }

}
