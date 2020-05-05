package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyDaoTestSuite {
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;

    @Test
    public void testSaveManyToMany(){
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        //Then
        Assert.assertNotEquals(0, softwareMachineId);
        Assert.assertNotEquals(0, dataMaestersId);
        Assert.assertNotEquals(0, greyMatterId);

        //CleanUp
        try {
            companyDao.deleteById(softwareMachineId);
            companyDao.deleteById(dataMaestersId);
            companyDao.deleteById(greyMatterId);
        } catch (Exception ignored) {
        }
    }

    @Test
    public void testFindCurrentEmployee(){
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");
        Employee maxNowak = new Employee("Max","Nowak");

        employeeDao.save(johnSmith);
        employeeDao.save(stephanieClarckson);
        employeeDao.save(lindaKovalsky);
        employeeDao.save(maxNowak);
        //When
        List<Employee> expectedEmployee1 = employeeDao.retrieveEmployeeWithCurrentLastName("Nowak");
        List<Employee> expectedEmployee2 = employeeDao.retrieveEmployeeWithCurrentLastName("Cass");
        //Then
        Assert.assertEquals(1,expectedEmployee1.size());
        Assert.assertEquals(0,expectedEmployee2.size());
        //CleanUp
        employeeDao.deleteAll();
    }

    @Test
    public void testFindCurrentCompany(){
        //Given
        Company softwareMachine = new Company("Software Machine");
        Company dataMasters = new Company("Data Masters");
        Company greyMatter = new Company("Grey Matter");
        Company mcDonald = new Company("McDonald");
        Company greyVision = new Company("Grey Vision");

        companyDao.save(softwareMachine);
        companyDao.save(dataMasters);
        companyDao.save(greyMatter);
        companyDao.save(mcDonald);
        companyDao.save(greyVision);
        //When
        List<Company> expectedCompany1 = companyDao.retrieveCompanyWithStartLetters("Sof");
        List<Company> expectedCompany2 = companyDao.retrieveCompanyWithStartLetters("Gre");
        List<Company> expectedCompany3 = companyDao.retrieveCompanyWithStartLetters("Xaw");
        //Then
        Assert.assertEquals(1,expectedCompany1.size());
        Assert.assertEquals(2,expectedCompany2.size());
        Assert.assertEquals(0,expectedCompany3.size());
        //CleanUp
        companyDao.deleteAll();
    }
}