package co.simplon.cdahopitalback.business.convert;

import java.util.ArrayList;
import java.util.List;

import co.simplon.cdahopitalback.business.dto.BedDTO;
import co.simplon.cdahopitalback.persistance.entity.Bed;

/**
 * Classe utilitaire pour la conversion entre les entités Bed et le DTO BedDTO.
 */
public class BedConvert {

    /** Instance unique de la classe BedConvert. */
    private static BedConvert instance;

    /** Constructeur privé pour empêcher l'instanciation directe de la classe. */
    private BedConvert() {

    }

    /**
     * Obtient l'instance unique de la classe BedConvert (singleton).
     *
     * @return L'instance unique de la classe BedConvert.
     */
    public static BedConvert getInstance() {
        if (instance == null)
            instance = new BedConvert();
        return instance;
    }

    /**
     * Convertit une entité Bed en un DTO BedDTO.
     *
     * @param entity L'entité Bed à convertir.
     * @return Le DTO BedDTO correspondant à l'entité.
     */
    public BedDTO convertEntityToDto(final Bed entity) {
        final BedDTO dto = new BedDTO();
        dto.setId(entity.getId());
        dto.setPatientId(entity.getPatient());
        dto.setBedroomId(entity.getbedroom());
        dto.setServiceId(entity.getService());

        return dto;
    }

    /**
     * Convertit un DTO BedDTO en une entité Bed.
     *
     * @param dto Le DTO BedDTO à convertir.
     * @return L'entité Bed correspondant au DTO.
     */
    public Bed convertDtoToEntity(final BedDTO entity) {
        final Bed bed = new Bed();
        bed.setId(entity.getId());
        bed.setBedroom(entity.getBedroomId());
        bed.setPatient(entity.getPatientId());
        bed.setService(entity.getServiceId());

        return bed;
    }

    /**
     * Convertit une liste d'entités Bed en une liste de DTO BedDTO.
     *
     * @param listEntities La liste d'entités Bed à convertir.
     * @return La liste de DTO BedDTO correspondante.
     */
    public List<BedDTO> convertListEntityToListDto(final List<Bed> listEntities) {
        final List<BedDTO> listeDto = new ArrayList<>();
        for (final Bed entity : listEntities) {
            listeDto.add(convertEntityToDto(entity));
        }
        return listeDto;
    }

    /**
     * Convertit une liste de DTO BedDTO en une liste d'entités Bed.
     *
     * @param listEntities La liste de DTO BedDTO à convertir.
     * @return La liste d'entités Bed correspondante.
     */
    public List<Bed> convertListDtoToListEntity(final List<BedDTO> listEntities) {
        final List<Bed> listeDO = new ArrayList<>();
        for (final BedDTO entity : listEntities) {
            listeDO.add(convertDtoToEntity(entity));
        }
        return listeDO;
    }

}
