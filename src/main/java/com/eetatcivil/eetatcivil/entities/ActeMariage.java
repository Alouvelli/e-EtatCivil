package com.eetatcivil.eetatcivil.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ActeMariage extends Acte{

    private String mentionMarginale;
    private String nomConjoint;
    private Date contrat;
    private String regime;
}
