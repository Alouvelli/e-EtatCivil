package com.eetatcivil.eetatcivil.entities;

import com.eetatcivil.eetatcivil.enums.RoleLibelle;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Role {
    private Long id;
    private RoleLibelle libelle;
}
