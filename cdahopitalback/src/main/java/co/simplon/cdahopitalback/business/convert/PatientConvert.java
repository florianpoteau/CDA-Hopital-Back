package co.simplon.cdahopitalback.business.convert;

import java.util.ArrayList;
import java.util.List;

import co.simplon.cdahopitalback.business.dto.PatientDTO;
import co.simplon.cdahopitalback.persistance.entity.Patient;

/**
 * Classe utilitaire pour la conversion entre les entités Patient et les DTO
 * PatientDTO.
 */
public class PatientConvert {

    /** Instance unique de la classe PatientConvert */
    private static PatientConvert instance;

    /** Constructeur privé pour empêcher l'instanciation directe de la classe. */
    private PatientConvert() {

    }

    /**
     * Obtient l'instance unique de la classe PatientConvert.
     *
     * @return L'instance unique de la classe PatientConvert.
     */
    public static PatientConvert getInstance() {
        if (instance == null)
            instance = new PatientConvert();
        return instance;
    }

    /**
     * Convertit une entité Patient en un DTO PatientDTO.
     *
     * @param entity L'entité Patient à convertir.
     * @return Le DTO PatientDTO correspondant à l'entité.
     */
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
        dto.setServiceId(entity.getService());
        dto.setBedId(entity.getBed());

        return dto;
    }

    /**
     * Convertit un DTO PatientDTO en une entité Patient.
     *
     * @param patient Le DTO PatientDTO à convertir.
     * @return L'entité Patient correspondant au DTO.
     */
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
        entity.setService(patient.getServiceId());
        entity.setBed(patient.getBedId());

        return entity;
    }

    /**
     * Convertit une liste d'entités Patient en une liste de DTO PatientDTO.
     *
     * @param listEntities La liste d'entités Patient à convertir.
     * @return La liste de DTO PatientDTO correspondante.
     */
    public List<PatientDTO> convertListEntityToListDto(final List<Patient> listEntities) {
        final List<PatientDTO> listeDto = new ArrayList<>();
        for (final Patient entity : listEntities) {
            listeDto.add(convertEntityToDto(entity));
        }
        return listeDto;
    }

    /**
     * Convertit une liste de DTO PatientDTO en une liste d'entités Patient.
     *
     * @param listEntities La liste de DTO PatientDTO à convertir.
     * @return La liste d'entités Patient correspondante.
     */
    public List<Patient> convertListDtoToListEntity(final List<PatientDTO> listEntities) {
        final List<Patient> listeDO = new ArrayList<>();
        for (final PatientDTO entity : listEntities) {
            listeDO.add(convertDtoToEntity(entity));
        }
        return listeDO;
    }

}
