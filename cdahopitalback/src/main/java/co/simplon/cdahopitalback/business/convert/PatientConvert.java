package co.simplon.cdahopitalback.business.convert;

import java.util.ArrayList;
import java.util.List;

import co.simplon.cdahopitalback.business.dto.PatientDTO;
import co.simplon.cdahopitalback.persistance.entity.Patient;

/**
 * Utility class for converting between Patient entities and PatientDTOs.
 */
public class PatientConvert {

    /** The singleton instance of the PatientConvert class. */
    private static PatientConvert instance;

    /** Private constructor to prevent direct instantiation of the class. */
    private PatientConvert() {

    }

    /**
     * Gets the singleton instance of the PatientConvert class.
     *
     * @return The singleton instance of the PatientConvert class.
     */
    public static PatientConvert getInstance() {
        if (instance == null)
            instance = new PatientConvert();
        return instance;
    }

    /**
     * Converts a Patient entity to a PatientDTO.
     *
     * @param entity The Patient entity to convert.
     * @return The corresponding PatientDTO.
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
     * Converts a PatientDTO to a Patient entity.
     *
     * @param patient The PatientDTO to convert.
     * @return The corresponding Patient entity.
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
     * Converts a list of Patient entities to a list of PatientDTOs.
     *
     * @param listEntities The list of Patient entities to convert.
     * @return The corresponding list of PatientDTOs.
     */
    public List<PatientDTO> convertListEntityToListDto(final List<Patient> listEntities) {
        final List<PatientDTO> dtoList = new ArrayList<>();
        for (final Patient entity : listEntities) {
            dtoList.add(convertEntityToDto(entity));
        }
        return dtoList;
    }

    /**
     * Converts a list of PatientDTOs to a list of Patient entities.
     *
     * @param listEntities The list of PatientDTOs to convert.
     * @return The corresponding list of Patient entities.
     */
    public List<Patient> convertListDtoToListEntity(final List<PatientDTO> listEntities) {
        final List<Patient> entityList = new ArrayList<>();
        for (final PatientDTO dto : listEntities) {
            entityList.add(convertDtoToEntity(dto));
        }
        return entityList;
    }

}
