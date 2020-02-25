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
        BigDecimal expected = new BigDecimal("84000000.0");

        List<Continent>continentList = new ArrayList<>();
        continentList.add(new Continent(countryListGenerator(2)));
        continentList.add(new Continent(countryListGenerator(3)));
        continentList.add(new Continent(countryListGenerator(4)));
        continentList.add(new Continent(countryListGenerator(5)));

        World world = new World(continentList);
        //When
        BigDecimal result = world.getPeopleQuantity();
        //Then
        Assert.assertEquals(expected, result);
    }

    private List<Country> countryListGenerator(int size){
        List<Country> countries = new ArrayList<>();
        for (int i = 0; i <size ; i++) {
            countries.add(new Country(new BigDecimal(4_000_000L).multiply(BigDecimal.valueOf(1.5))));
        }
        return countries;
    }
}
