package com.eetatcivil.eetatcivil.entities;

import com.eetatcivil.eetatcivil.enums.libelleEtatCivil;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class TypeActe {

    private Long id;
    private libelleEtatCivil libelle;
}
