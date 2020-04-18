package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigMacTestSuite {
    @Test
    public void testNewBigMac(){
        //Given
        BigMac bigmac = new BigMac.BigMacBuilder()
                .burger(2)
                .sauce("standard")
                .ingredient("lettuce")
                .ingredient("bacon")
                .ingredient("chili peppers")
                .bun(true)
                .build();
        System.out.println(bigmac);
        //When
        String sauce = bigmac.getSauce();
        int ingredient = bigmac.getIngredients().size();
        int burger = bigmac.getBurgers();
        boolean isSesame = bigmac.isBun();
        //Then
        Assert.assertEquals("standard",sauce);
        Assert.assertEquals(3,ingredient);
        Assert.assertEquals(2,burger);
        Assert.assertTrue(isSesame);
    }
}
