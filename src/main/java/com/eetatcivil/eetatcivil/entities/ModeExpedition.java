package com.eetatcivil.eetatcivil.entities;

import com.eetatcivil.eetatcivil.enums.modeExpedition;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ModeExpedition {
    private Long id;
    private modeExpedition mode;
}
