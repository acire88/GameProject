package com.company.GameProject;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;           //DAO - How we talk to the database

public interface ConsoleRepository extends JpaRepository<Consoles, Integer> {

    List<Consoles> findByManufacturer(String manufacturer);


}
