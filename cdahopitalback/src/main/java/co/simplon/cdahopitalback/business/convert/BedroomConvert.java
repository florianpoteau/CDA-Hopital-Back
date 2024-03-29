package co.simplon.cdahopitalback.business.convert;

import java.util.ArrayList;
import java.util.List;

import co.simplon.cdahopitalback.business.dto.BedroomDTO;
import co.simplon.cdahopitalback.persistance.entity.Bedroom;

/**
 * Utility class for converting between Bedroom entities and BedroomDTOs.
 */
public class BedroomConvert {

    /** The singleton instance of the BedroomConvert class. */
    private static BedroomConvert instance;

    /** Private constructor to prevent direct instantiation of the class. */
    private BedroomConvert() {

    }

    /**
     * Gets the singleton instance of the BedroomConvert class.
     *
     * @return The singleton instance of the BedroomConvert class.
     */
    public static BedroomConvert getInstance() {
        if (instance == null)
            instance = new BedroomConvert();
        return instance;
    }

    /**
     * Converts a Bedroom entity to a BedroomDTO.
     *
     * @param entity The Bedroom entity to convert.
     * @return The corresponding BedroomDTO.
     */
    public BedroomDTO convertEntityToDto(final Bedroom entity) {
        final BedroomDTO dto = new BedroomDTO();
        dto.setId(entity.getId());
        dto.setNumeroChambre(entity.geNumerobedroom());

        return dto;
    }

    /**
     * Converts a BedroomDTO to a Bedroom entity.
     *
     * @param bedroom The BedroomDTO to convert.
     * @return The corresponding Bedroom entity.
     */
    public Bedroom convertDtoToEntity(final BedroomDTO bedroom) {
        final Bedroom entity = new Bedroom();
        entity.setId(bedroom.getId());
        entity.setBedroom(bedroom.getNumeroChambre());

        return entity;
    }

    /**
     * Converts a list of Bedroom entities to a list of BedroomDTOs.
     *
     * @param listEntities The list of Bedroom entities to convert.
     * @return The corresponding list of BedroomDTOs.
     */
    public List<BedroomDTO> convertListEntityToListDto(final List<Bedroom> listEntities) {
        final List<BedroomDTO> dtoList = new ArrayList<>();
        for (final Bedroom entity : listEntities) {
            dtoList.add(convertEntityToDto(entity));
        }
        return dtoList;
    }

    /**
     * Converts a list of BedroomDTOs to a list of Bedroom entities.
     *
     * @param listEntities The list of BedroomDTOs to convert.
     * @return The corresponding list of Bedroom entities.
     */
    public List<Bedroom> convertListDtoToListEntity(final List<BedroomDTO> listEntities) {
        final List<Bedroom> entityList = new ArrayList<>();
        for (final BedroomDTO dto : listEntities) {
            entityList.add(convertDtoToEntity(dto));
        }
        return entityList;
    }

}
