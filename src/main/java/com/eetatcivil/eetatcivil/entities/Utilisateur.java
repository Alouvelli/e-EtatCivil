package com.eetatcivil.eetatcivil.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Utilisateur {

    private Long id;
    private String login;
    private String password;
    private String email;
    private Boolean active;
}
