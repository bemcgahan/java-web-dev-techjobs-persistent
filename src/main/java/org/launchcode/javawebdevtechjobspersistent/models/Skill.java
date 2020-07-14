package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {

    @NotNull
    @Size(min=3, max=150)
    private String description;

    //empty constructor
    public Skill () {}

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



}