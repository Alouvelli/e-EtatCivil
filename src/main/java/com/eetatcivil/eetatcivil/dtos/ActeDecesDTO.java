package com.eetatcivil.eetatcivil.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.Date;

@Data

public class ActeDecesDTO extends ActeDTO {

    private Long id;
    private int numRegistre;
    //private Date date;
    private Date dateDeces;
    private String motifDeces;
}
