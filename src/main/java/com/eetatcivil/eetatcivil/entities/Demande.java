package com.eetatcivil.eetatcivil.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Demande {
    private Long id;
    private int numRegistre;
    private Date date;
    private String civilite;
    private String pays;
    private String nationalite;
    private String motif;
    private String natureActe;
    private int nbreExemplaire;
    private String qualiteDemande;
    private Boolean etat;
    private String commentaire;
}
