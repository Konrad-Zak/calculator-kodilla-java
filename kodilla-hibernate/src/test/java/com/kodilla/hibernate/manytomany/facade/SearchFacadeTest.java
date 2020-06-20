package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class SearchFacadeTest {

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private SearchFacade searchFacade;

    @Test
    public void testSearchCompanyByAnyFragment(){
        //Given
        companyDao.save(new Company("Company 1"));
        companyDao.save(new Company("Comp1any 2"));
        companyDao.save(new Company("Company 3"));
        companyDao.save(new Company("StartUp p1"));
        //When
        List<Company> companies = searchFacade.searchCompanyNameByAnyFragment("p1");
        //Then
        Assert.assertEquals(2,companies.size());
        //CleanUp
        companyDao.deleteAll();
    }

    @Test
    public void testSearchEmployeeLastNameByAnyFragment(){
        //Given
        employeeDao.save(new Employee("Adam","Nowak"));
        employeeDao.save(new Employee("Bartosz", "Zak"));
        employeeDao.save(new Employee("Konrad", "Wakaz"));
        //When
        List<Employee> employees = searchFacade.searchEmployeeLastNameByAnyFragment("ak");
        //Then
        Assert.assertEquals(3,employees.size());
        //CleanUp
        employeeDao.deleteAll();
    }

}