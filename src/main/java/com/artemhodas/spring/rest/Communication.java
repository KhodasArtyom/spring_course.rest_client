package com.artemhodas.spring.rest;


import com.artemhodas.spring.rest.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class Communication {

    @Autowired
    private RestTemplate restTemplate;
    private final String URL = "http://localhost:8080/spring_course_rest_war_exploded/api/employees";

    protected List<Employee> getAllEmployees() {
        ResponseEntity<List<Employee>> responseEntity =
                restTemplate.exchange(URL, HttpMethod.GET, null,
                        new ParameterizedTypeReference<List<Employee>>() {
                        });
        List<Employee> allEmployees = responseEntity.getBody();

        return allEmployees;
    }

    private Employee getEmployee(int id) {

        return null;
    }

    private void saveEmployee(Employee employee) {

    }

    ;

    private void deleteEmployee(int id) {

    }

    ;


}
