package com.kodilla.patterns2.adapter.bookclasifier.libraryb;

import java.util.Map;

public interface BookStatistics {
    int averagePublication(Map<BookSignature,Book> books);
    int medianPublication(Map<BookSignature,Book> books);
}
