package com.eetatcivil.eetatcivil.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.Date;

@Data
public class ActeNaissanceDTO extends ActeDTO {

    private Long id;
    private int numRegistre;
    private String prenom;
    private String nom;
    private Date date;
    private Date heurenaiss;
    private char genre;
    private String prenomPere;
    private String nomMere;
    private String prenomMere;
}
