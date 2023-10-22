package com.filmmaniabe.filmmaniabe.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Film {
    @Id
    private int id;
    private String name;
    private String kind;
}