package com.company.GameProject;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ConsoleServiceLayer {
    @Autowired
    private ConsoleRepository consoleRepository;


    public Consoles addConsoles(Consoles consoles) {
        consoleRepository.save(consoles);
        return consoles; //POST
    }

    public List<Consoles> getAllConsoles() {
        return consoleRepository.findAll();  //GET
    }

    public List<Consoles> findConsolesByManufacturer(String manufacturer) {
        return consoleRepository.findByManufacturer(manufacturer); //GET
    }


    public void deleteConsoles(int consoleId) {
        consoleRepository.deleteById(consoleId); //DELETE
    }


    public void updateConsoles(Consoles consoles, int consoleId) {
        if (consoles.getConsoleId() != consoleId) {
            throw new IllegalArgumentException("Console id must match the id provided");
        }
        consoleRepository.save(consoles);   //PUT
    }




}

