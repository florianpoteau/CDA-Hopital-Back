package co.simplon.cdahopitalback.business.convert;

import java.util.ArrayList;
import java.util.List;

import co.simplon.cdahopitalback.business.dto.BedroomDTO;
import co.simplon.cdahopitalback.persistance.entity.Bedroom;

/**
 * Classe utilitaire pour la conversion entre les entités Bedroom et les DTO
 * BedroomDTO.
 */
public class BedroomConvert {

    /** Instance unique de la classe BedroomConvert */
    private static BedroomConvert instance;

    /** Constructeur privé pour empêcher l'instanciation directe de la classe. */
    private BedroomConvert() {

    }

    /**
     * Obtient l'instance unique de la classe BedroomConvert.
     *
     * @return L'instance unique de la classe BedroomConvert.
     */
    public static BedroomConvert getInstance() {
        if (instance == null)
            instance = new BedroomConvert();
        return instance;
    }

    /**
     * Convertit une entité Bedroom en un DTO BedroomDTO.
     *
     * @param entity L'entité Bedroom à convertir.
     * @return Le DTO BedroomDTO correspondant à l'entité.
     */
    public BedroomDTO convertEntityToDto(final Bedroom entity) {
        final BedroomDTO dto = new BedroomDTO();
        dto.setId(entity.getId());
        dto.setNumeroChambre(entity.geNumerobedroom());

        return dto;
    }

    /**
     * Convertit un DTO BedroomDTO en une entité Bedroom.
     *
     * @param bedroom Le DTO BedroomDTO à convertir.
     * @return L'entité Bedroom correspondant au DTO.
     */
    public Bedroom convertDtoToEntity(final BedroomDTO bedroom) {
        final Bedroom entity = new Bedroom();
        entity.setId(bedroom.getId());
        entity.setBedroom(bedroom.getNumeroChambre());

        return entity;
    }

    /**
     * Convertit une liste d'entités Bedroom en une liste de DTO BedroomDTO.
     *
     * @param listEntities La liste d'entités Bedroom à convertir.
     * @return La liste de DTO BedroomDTO correspondante.
     */
    public List<BedroomDTO> convertListEntityToListDto(final List<Bedroom> listEntities) {
        final List<BedroomDTO> listeDto = new ArrayList<>();
        for (final Bedroom entity : listEntities) {
            listeDto.add(convertEntityToDto(entity));
        }
        return listeDto;
    }

    /**
     * Convertit une liste de DTO BedroomDTO en une liste d'entités Bedroom.
     *
     * @param listEntities La liste de DTO BedroomDTO à convertir.
     * @return La liste d'entités Bedroom correspondante.
     */
    public List<Bedroom> convertListDtoToListEntity(final List<BedroomDTO> listEntities) {
        final List<Bedroom> listeDO = new ArrayList<>();
        for (final BedroomDTO entity : listEntities) {
            listeDO.add(convertDtoToEntity(entity));
        }
        return listeDO;
    }

}
