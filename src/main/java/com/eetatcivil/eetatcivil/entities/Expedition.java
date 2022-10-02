package com.eetatcivil.eetatcivil.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Expedition {
    private Long id;
    private Date date;
    private String description;
    private String boiteEmail;
    private String adresse;
    private String pays;
}
