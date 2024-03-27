package co.simplon.cdahopitalback.business.convert;

import java.util.ArrayList;
import java.util.List;

import co.simplon.cdahopitalback.business.dto.PatientDTO;
import co.simplon.cdahopitalback.persistance.entity.Patient;

public class PatientConvert {

    private static PatientConvert instance;

    private PatientConvert() {

    }

    public static PatientConvert getInstance() {
        if (instance == null)
            instance = new PatientConvert();
        return instance;
    }

    public PatientDTO convertEntityToDto(final Patient entity) {
        final PatientDTO dto = new PatientDTO();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setFirstname(entity.getFirstname());
        dto.setDatebirth(entity.getDatebirth());
        dto.setDatearrivee(entity.getDatearrivee());
        dto.setDatesortie(entity.getDatesortie());
        dto.setSexe(entity.getSexe());
        dto.setNosecu(entity.getNosecu());
        dto.setNotel(entity.getNotel());

        return dto;
    }

    public Patient convertDtoToEntity(final PatientDTO patient) {
        final Patient entity = new Patient();
        entity.setId(patient.getId());
        entity.setName(patient.getName());
        entity.setFirstname(patient.getFirstname());
        entity.setDatebirth(patient.getDatebirth());
        entity.setDatearrivee(patient.getDatearrivee());
        entity.setDatesortie(patient.getDatesortie());
        entity.setSexe(patient.getSexe());
        entity.setNosecu(patient.getNosecu());
        entity.setNotel(patient.getNotel());

        return entity;
    }

    public List<PatientDTO> convertListEntityToListDto(final List<Patient> listEntities) {
        final List<PatientDTO> listeDto = new ArrayList<>();
        for (final Patient entity : listEntities) {
            listeDto.add(convertEntityToDto(entity));
        }
        return listeDto;
    }

    public List<Patient> convertListDtoToListEntity(final List<PatientDTO> listEntities) {
        final List<Patient> listeDO = new ArrayList<>();
        for (final PatientDTO entity : listEntities) {
            listeDO.add(convertDtoToEntity(entity));
        }
        return listeDO;
    }

}
