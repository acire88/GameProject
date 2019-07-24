package com.company.GameProject;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name="games")
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    @Size(max=11)
    private Integer id;
    @NotNull
    @Length(max=50)
    private String studio;
    @NotNull
    @Length(max=50)
    private String eSRBRating;
    @NotNull
    @Length(max=50)
    private String description;
    @NotNull
    @Length(max=50)
    private String title;
    @NotNull
    @Size(max=5, min=2)
    private Double price;
    @NotNull
    @Size(max=11)
    private Integer quantity;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public String getESRBRating() {
        return eSRBRating;
    }

    public void setESRBRating(String eSRBRating) {
        this.eSRBRating = eSRBRating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
       this.description = description;
    }
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

}