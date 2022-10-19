package com.eetatcivil.eetatcivil.services;

import com.eetatcivil.eetatcivil.dtos.ActeDTO;
import com.eetatcivil.eetatcivil.dtos.ActeDecesDTO;
import com.eetatcivil.eetatcivil.dtos.ActeMariageDTO;
import com.eetatcivil.eetatcivil.dtos.ActeNaissanceDTO;
import com.eetatcivil.eetatcivil.exceptions.ActeNotFoundException;

import java.util.List;

public interface IActeService {

    ActeMariageDTO saveActeMariage(long id, int numRegistre, String mentionMarginale, String nomConjoint, String regime);

    ActeNaissanceDTO saveActeNaissance(long id, int numRegistre, String prenom, String nom, char genre, String prenomPere, String nomMere, String prenomMere, int hour, int minute, int second);

    ActeDecesDTO saveActeDeces(long id, int numRegistre, String motifDeces);

    ActeDTO getActe(String actetId) throws ActeNotFoundException;

    List<ActeDTO> listActes();

    ActeDTO updateActe(ActeDTO acteDTO);

    void deleteActe(Long acteId);

    List<ActeDTO> searchActes(String keyword);

}
