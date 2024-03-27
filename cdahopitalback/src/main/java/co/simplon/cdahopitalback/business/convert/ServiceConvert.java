package co.simplon.cdahopitalback.business.convert;

import java.util.ArrayList;
import java.util.List;

import co.simplon.cdahopitalback.business.dto.ServiceDTO;
import co.simplon.cdahopitalback.persistance.entity.Service;

/**
 * Classe utilitaire pour la conversion entre les entités Service et les DTO
 * ServiceDTO.
 */
public class ServiceConvert {

    /** Instance unique de la classe ServiceConvert */
    private static ServiceConvert instance;

    /** Constructeur privé pour empêcher l'instanciation directe de la classe. */
    private ServiceConvert() {

    }

    /**
     * Obtient l'instance unique de la classe ServiceConvert.
     *
     * @return L'instance unique de la classe ServiceConvert.
     */
    public static ServiceConvert getInstance() {
        if (instance == null)
            instance = new ServiceConvert();
        return instance;
    }

    /**
     * Convertit une entité Service en un DTO ServiceDTO.
     *
     * @param entity L'entité Service à convertir.
     * @return Le DTO ServiceDTO correspondant à l'entité.
     */
    public ServiceDTO convertEntityToDto(final Service entity) {
        final ServiceDTO dto = new ServiceDTO();
        dto.setId(entity.getId());
        dto.setName(entity.getName());

        return dto;
    }

    /**
     * Convertit un DTO ServiceDTO en une entité Service.
     *
     * @param service Le DTO ServiceDTO à convertir.
     * @return L'entité Service correspondant au DTO.
     */
    public Service convertDtoToEntity(final ServiceDTO service) {
        final Service entity = new Service();
        entity.setId(service.getId());
        entity.setName(service.getName());

        return entity;
    }

    /**
     * Convertit une liste d'entités Service en une liste de DTO ServiceDTO.
     *
     * @param listEntities La liste d'entités Service à convertir.
     * @return La liste de DTO ServiceDTO correspondante.
     */
    public List<ServiceDTO> convertListEntityToListDto(final List<Service> listEntities) {
        final List<ServiceDTO> listeDto = new ArrayList<>();
        for (final Service entity : listEntities) {
            listeDto.add(convertEntityToDto(entity));
        }
        return listeDto;
    }

    /**
     * Convertit une liste de DTO ServiceDTO en une liste d'entités Service.
     *
     * @param listEntities La liste de DTO ServiceDTO à convertir.
     * @return La liste d'entités Service correspondante.
     */
    public List<Service> convertListDtoToListEntity(final List<ServiceDTO> listEntities) {
        final List<Service> listeDO = new ArrayList<>();
        for (final ServiceDTO entity : listEntities) {
            listeDO.add(convertDtoToEntity(entity));
        }
        return listeDO;
    }

}
