package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.math.BigDecimal;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;
    @Autowired
    ItemDao itemDao;
    @Autowired
    ProductDao productDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product product = new Product("car tool");
        Item item = new Item(new BigDecimal(10), 10, new BigDecimal(150));
        Item item1 = new Item(new BigDecimal(400), 10, new BigDecimal(40_000));
        Invoice invoice = new Invoice("02/05/2020");

        item.setProduct(product);
        item1.setProduct(product);
        item.setInvoice(invoice);
        item1.setInvoice(invoice);
        invoice.getItems().add(item);
        invoice.getItems().add(item1);

        //When
        invoiceDao.save(invoice);
        int invoiceSize = invoice.getItems().size();
        int id = product.getId();
        Optional<Product> readProduct = productDao.findById(id);

        //Then
        Assert.assertEquals(2, invoiceSize);
        Assert.assertTrue(readProduct.isPresent());

        //CleanUp
        invoiceDao.deleteAll();
        itemDao.deleteAll();
    }
}