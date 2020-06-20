package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class SearchFacade {

    private static final Logger LOGGER = LoggerFactory.getLogger(SearchFacade.class);

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    public List<Company> searchCompanyNameByAnyFragment(String fragment){
        LOGGER.info("Sending request to Company database");
        List<Company> companyList = companyDao.retrieveCompanyWithFragmentText("%"+fragment+"%");
        if(companyList.size() > 0){
            LOGGER.info("Companies found succeeded");
        } else {
            LOGGER.error("Not found companies with given parameters");
        }
        return companyList;
    }

    public List<Employee> searchEmployeeLastNameByAnyFragment(String fragment){
        LOGGER.info("Sending request to Employee database");
        List<Employee> employeeList = employeeDao.retrieveEmployeeWithFragmentLastName("%"+fragment+"%");
        if(employeeList.size() > 0){
            LOGGER.info("Employee found succeeded");
        } else {
            LOGGER.error("Not found employee with given parameters");
        }
        return employeeList;
    }

}
