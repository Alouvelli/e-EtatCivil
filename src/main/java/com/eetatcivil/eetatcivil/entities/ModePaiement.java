package com.eetatcivil.eetatcivil.entities;

import com.eetatcivil.eetatcivil.enums.modePaiement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ModePaiement {

    private Long id;
    private modePaiement mode;
}
