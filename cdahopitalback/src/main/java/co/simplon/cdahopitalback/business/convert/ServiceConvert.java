package co.simplon.cdahopitalback.business.convert;

import java.util.ArrayList;
import java.util.List;

import co.simplon.cdahopitalback.business.dto.ServiceDTO;
import co.simplon.cdahopitalback.persistance.entity.Service;

public class ServiceConvert {

    private static ServiceConvert instance;

    private ServiceConvert() {

    }

    public static ServiceConvert getInstance() {
        if (instance == null)
            instance = new ServiceConvert();
        return instance;
    }

    public ServiceDTO convertEntityToDto(final Service entity) {
        final ServiceDTO dto = new ServiceDTO();
        dto.setId(entity.getId());
        dto.setName(entity.getName());

        return dto;
    }

    public Service convertDtoToEntity(final ServiceDTO service) {
        final Service entity = new Service();
        entity.setId(service.getId());
        entity.setName(service.getName());

        return entity;
    }

    public List<ServiceDTO> convertListEntityToListDto(final List<Service> listEntities) {
        final List<ServiceDTO> listeDto = new ArrayList<>();
        for (final Service entity : listEntities) {
            listeDto.add(convertEntityToDto(entity));
        }
        return listeDto;
    }

    public List<Service> convertListDtoToListEntity(final List<ServiceDTO> listEntities) {
        final List<Service> listeDO = new ArrayList<>();
        for (final ServiceDTO entity : listEntities) {
            listeDO.add(convertDtoToEntity(entity));
        }
        return listeDO;
    }

}
