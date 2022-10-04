package com.eetatcivil.eetatcivil.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@DiscriminatorValue("NAI")
public class ActeNaissance extends Acte{

    private Date heurenaiss;
    private char genre;
    private String nomPere;
    private String prenomPere;
    private String nomMere;
    private String prenomMere;
}
