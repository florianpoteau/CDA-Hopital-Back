package co.simplon.cdahopitalback.business.convert;

import java.util.ArrayList;
import java.util.List;

import co.simplon.cdahopitalback.business.dto.BedDTO;
import co.simplon.cdahopitalback.persistance.entity.Bed;

/**
 * Utility class for converting between Bed entities and BedDTOs.
 */
public class BedConvert {

    /** The singleton instance of the BedConvert class. */
    private static BedConvert instance;

    /** Private constructor to prevent direct instantiation of the class. */
    private BedConvert() {

    }

    /**
     * Gets the singleton instance of the BedConvert class (singleton).
     *
     * @return The singleton instance of the BedConvert class.
     */
    public static BedConvert getInstance() {
        if (instance == null)
            instance = new BedConvert();
        return instance;
    }

    /**
     * Converts a Bed entity to a BedDTO.
     *
     * @param entity The Bed entity to convert.
     * @return The corresponding BedDTO.
     */
    public BedDTO convertEntityToDto(final Bed entity) {
        final BedDTO dto = new BedDTO();
        dto.setId(entity.getId());
        dto.setBedroomId(entity.getbedroom());

        return dto;
    }

    /**
     * Converts a BedDTO to a Bed entity.
     *
     * @param entity The BedDTO to convert.
     * @return The corresponding Bed entity.
     */
    public Bed convertDtoToEntity(final BedDTO entity) {
        final Bed bed = new Bed();
        bed.setId(entity.getId());
        bed.setBedroom(entity.getBedroomId());

        return bed;
    }

    /**
     * Converts a list of Bed entities to a list of BedDTOs.
     *
     * @param listEntities The list of Bed entities to convert.
     * @return The corresponding list of BedDTOs.
     */
    public List<BedDTO> convertListEntityToListDto(final List<Bed> listEntities) {
        final List<BedDTO> dtoList = new ArrayList<>();
        for (final Bed entity : listEntities) {
            dtoList.add(convertEntityToDto(entity));
        }
        return dtoList;
    }

    /**
     * Converts a list of BedDTOs to a list of Bed entities.
     *
     * @param listEntities The list of BedDTOs to convert.
     * @return The corresponding list of Bed entities.
     */
    public List<Bed> convertListDtoToListEntity(final List<BedDTO> listEntities) {
        final List<Bed> entityList = new ArrayList<>();
        for (final BedDTO dto : listEntities) {
            entityList.add(convertDtoToEntity(dto));
        }
        return entityList;
    }

}
