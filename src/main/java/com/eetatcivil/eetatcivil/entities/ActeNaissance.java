package com.eetatcivil.eetatcivil.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ActeNaissance extends Acte{

    private Date heurenaiss;
    private char genre;
    private String nomPere;
    private String prenomPere;
    private String nomMere;
    private String prenomMere;
}
