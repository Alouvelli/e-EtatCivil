package com.eetatcivil.eetatcivil.entities;

import com.eetatcivil.eetatcivil.enums.typeActe;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE",length = 4)
@Data @AllArgsConstructor @NoArgsConstructor
public abstract class Acte {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int numRegistre;
    private Date date;
    @Enumerated(EnumType.STRING)
    private typeActe typeActe;
    @OneToMany(mappedBy = "acte")
    private List<EtatCivil> etatCivil;

}
