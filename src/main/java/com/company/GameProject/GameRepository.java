package com.company.GameProject;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GameRepository extends JpaRepository<Game, Integer> {
    List<Game> findByESRBRating(String eSRBRating);
    List<Game> findByStudio(String studio);
    List<Game> findByTitle(String title);

}

