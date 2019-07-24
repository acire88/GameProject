package com.company.GameProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
public class ConsoleController {
    @Autowired
    private ConsoleServiceLayer consoleServiceLayer;


    @RequestMapping(value = "/consoles/{manufacturer}", method = RequestMethod.GET)
    public List<Consoles> getConsolesByManufacturer(@PathVariable String manufacturer) {
        return consoleServiceLayer.findConsolesByManufacturer(manufacturer);

    }
    @RequestMapping(value = "/consoles", method = RequestMethod.GET)
    public List<Consoles> getAllConsoles() {
        return consoleServiceLayer.getAllConsoles();
    }

    @RequestMapping(value="/consoles", method= RequestMethod.POST)
    public Consoles addConsoles(@RequestBody @Valid Consoles consoles) {
        consoleServiceLayer.addConsoles(consoles);
        return consoles;
    }

    @RequestMapping(value="/consoles/{consoleId}", method = RequestMethod.PUT)
    public void updateConsoles(@RequestBody @Valid Consoles consoles, @PathVariable int ConsoleId) {
        consoleServiceLayer.updateConsoles(consoles, ConsoleId);
    }


    @RequestMapping(value="/consoles/{consoleId}", method = RequestMethod.DELETE)
    public void deleteConsoles(@PathVariable int consoleId) {
        consoleServiceLayer.deleteConsoles(consoleId);
    }

}

