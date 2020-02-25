package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){
        //Given
        BigDecimal expected = new BigDecimal("50");

        List<Continent>continentList = new ArrayList<>();
        continentList.add(new Continent(countryListGenerator(5)));
        continentList.add(new Continent(countryListGenerator(10)));
        continentList.add(new Continent(countryListGenerator(20)));
        continentList.add(new Continent(countryListGenerator(15)));

        World world = new World(continentList);
        //When
        BigDecimal result = world.getPeopleQuantity();
        //Then
        Assert.assertEquals(expected, result);
    }

    private List<Country> countryListGenerator(int size){
        List<Country> countries = new ArrayList<>();
        BigDecimal bigDecimal = BigDecimal.ZERO;
        for (int i = 0; i <size ; i++) {
            countries.add(new Country(bigDecimal.add(BigDecimal.ONE)));
        }
        return countries;
    }
}
