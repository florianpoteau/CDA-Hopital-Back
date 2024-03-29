package co.simplon.cdahopitalback.business.convert;

import java.util.ArrayList;
import java.util.List;

import co.simplon.cdahopitalback.business.dto.ServiceDTO;
import co.simplon.cdahopitalback.persistance.entity.Services;

/**
 * Utility class for converting between Service entities and ServiceDTOs.
 */
public class ServiceConvert {

    /** The singleton instance of the ServiceConvert class */
    private static ServiceConvert instance;

    /** Private constructor to prevent direct instantiation of the class. */
    private ServiceConvert() {

    }

    /**
     * Gets the singleton instance of the ServiceConvert class.
     *
     * @return The singleton instance of the ServiceConvert class.
     */
    public static ServiceConvert getInstance() {
        if (instance == null)
            instance = new ServiceConvert();
        return instance;
    }

    /**
     * Converts a Service entity to a ServiceDTO.
     *
     * @param entity The Service entity to convert.
     * @return The corresponding ServiceDTO.
     */
    public ServiceDTO convertEntityToDto(final Services entity) {
        final ServiceDTO dto = new ServiceDTO();
        dto.setId(entity.getId());
        dto.setName(entity.getName());

        return dto;
    }

    /**
     * Converts a ServiceDTO to a Service entity.
     *
     * @param service The ServiceDTO to convert.
     * @return The corresponding Service entity.
     */
    public Services convertDtoToEntity(final ServiceDTO service) {
        final Services entity = new Services();
        entity.setId(service.getId());
        entity.setName(service.getName());

        return entity;
    }

    /**
     * Converts a list of Service entities to a list of ServiceDTOs.
     *
     * @param listEntities The list of Service entities to convert.
     * @return The corresponding list of ServiceDTOs.
     */
    public List<ServiceDTO> convertListEntityToListDto(final List<Services> listEntities) {
        final List<ServiceDTO> dtoList = new ArrayList<>();
        for (final Services entity : listEntities) {
            dtoList.add(convertEntityToDto(entity));
        }
        return dtoList;
    }

    /**
     * Converts a list of ServiceDTOs to a list of Service entities.
     *
     * @param listEntities The list of ServiceDTOs to convert.
     * @return The corresponding list of Service entities.
     */
    public List<Services> convertListDtoToListEntity(final List<ServiceDTO> listEntities) {
        final List<Services> entityList = new ArrayList<>();
        for (final ServiceDTO dto : listEntities) {
            entityList.add(convertDtoToEntity(dto));
        }
        return entityList;
    }

}
