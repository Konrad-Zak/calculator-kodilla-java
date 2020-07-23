package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookStatistics;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.Statistics;

import java.util.Map;

public class MedianAdaptee implements BookStatistics {

    private Statistics statistics = new Statistics();

    @Override
    public int averagePublication(Map<BookSignature, Book> books) {
        return statistics.averagePublication(books);
    }

    @Override
    public int medianPublication(Map<BookSignature, Book> books) {
        return statistics.medianPublication(books);
    }
}
