package com.company.GameProject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TshirtServiceLayer {
    @Autowired
    private TshirtRepository tshirtRepo;

    public Tshirt addTshirt(Tshirt tshirt) {
        tshirtRepo.save(tshirt);
        return tshirt;
    }

    public List<Tshirt> getAllTshirts() {
        return tshirtRepo.findAll();

    }
    public Tshirt getTshirtById(Integer id) {
        return tshirtRepo.getOne(id);
    }


    public List<Tshirt> getTshirtBySize(String size) {
        return tshirtRepo.findBySize(size);
    }

    public List<Tshirt> getTshirtByColor(String color) {
        return tshirtRepo.findByColor(color);
    }

    public void updateTshirt(Tshirt tshirt, Integer id) {
        if (tshirt.getId() != id){
            throw new IllegalArgumentException("Id must match the id provided");
        }
        tshirtRepo.save(tshirt);
    }

    public void deleteTshirt(Integer id) {
        tshirtRepo.deleteById(id);

    }
}
