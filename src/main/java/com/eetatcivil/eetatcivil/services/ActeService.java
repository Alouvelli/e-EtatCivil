package com.eetatcivil.eetatcivil.services;

import com.eetatcivil.eetatcivil.dtos.ActeDTO;
import com.eetatcivil.eetatcivil.dtos.ActeDecesDTO;
import com.eetatcivil.eetatcivil.dtos.ActeMariageDTO;
import com.eetatcivil.eetatcivil.dtos.ActeNaissanceDTO;
import com.eetatcivil.eetatcivil.entities.ActeDeces;
import com.eetatcivil.eetatcivil.entities.ActeMariage;
import com.eetatcivil.eetatcivil.entities.ActeNaissance;
import com.eetatcivil.eetatcivil.exceptions.ActeNotFoundException;
import com.eetatcivil.eetatcivil.mappers.ActeMappers;
import com.eetatcivil.eetatcivil.repositories.ActeRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Time;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
@AllArgsConstructor
@Slf4j
public class ActeService implements IActeService{

    private ActeRepository acteRepository;
    private ActeMappers dtoMapper;

    @Override
    public ActeMariageDTO saveActeMariage(long id, int numRegistre, String mentionMarginale, String nomConjoint, String regime) {
        ActeMariage acteMariage=new ActeMariage();
        acteMariage.setId(id);
        acteMariage.setNumRegistre(numRegistre);
        acteMariage.setMentionMarginale(mentionMarginale);
        acteMariage.setDateContrat(new Date());
        acteMariage.setNomConjoint(nomConjoint);
        acteMariage.setRegime(regime);
        ActeMariage acteMariage1 = acteRepository.save(acteMariage);
        return dtoMapper.fromActeMariage(acteMariage1);
    }


    @Override
    public ActeNaissanceDTO saveActeNaissance(long id, int numRegistre, String prenom, String nom, char genre, String prenomPere, String nomMere, String prenomMere, int hour, int minute, int second) {
        ActeNaissance acteNaissance = new ActeNaissance();
        acteNaissance.setId(id);
        acteNaissance.setNumRegistre(numRegistre);
        acteNaissance.setPrenom(prenom);
        acteNaissance.setNom(nom);
        acteNaissance.setDatenaiss(new Date());
        acteNaissance.setHeurenaiss(new Time(hour, minute, second));
        acteNaissance.setGenre(genre);
        acteNaissance.setPrenomPere(prenomPere);
        acteNaissance.setNomMere(nomMere);
        acteNaissance.setPrenomMere(prenomMere);
        ActeNaissance acteNaissance1 = acteRepository.save(acteNaissance);
        return dtoMapper.fromActeNaissance(acteNaissance1);
    }

    @Override
    public ActeDecesDTO saveActeDeces(long id, int numRegistre, String motifDeces) {
        ActeDeces acteDeces = new ActeDeces();
        acteDeces.setId(id);
        acteDeces.setNumRegistre(numRegistre);
        acteDeces.setDateDeces(new Date());
        acteDeces.setMotifDeces(motifDeces);
        ActeDeces acteDeces1 = acteRepository.save(acteDeces);
        return dtoMapper.fromActeDeces(acteDeces1);
    }

    @Override
    public ActeDTO getActe(String actetId) throws ActeNotFoundException {
        return null;
    }

    @Override
    public List<ActeDTO> listActes() {
        return null;
    }

    @Override
    public ActeDTO updateActe(ActeDTO acteDTO) {
        return null;
    }

    @Override
    public void deleteActe(Long acteId) {

    }

    @Override
    public List<ActeDTO> searchActes(String keyword) {
        return null;
    }
}


