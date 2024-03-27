package co.simplon.cdahopitalback.business.convert;

import java.util.ArrayList;
import java.util.List;

import co.simplon.cdahopitalback.business.dto.BedroomDTO;
import co.simplon.cdahopitalback.persistance.entity.Bedroom;

public class BedroomConvert {

    private static BedroomConvert instance;

    private BedroomConvert() {

    }

    public static BedroomConvert getInstance() {
        if (instance == null)
            instance = new BedroomConvert();
        return instance;
    }

    public BedroomDTO convertEntityToDto(final Bedroom entity) {
        final BedroomDTO dto = new BedroomDTO();
        dto.setId(entity.getId());
        dto.setNumeroChambre(entity.geNumerobedroom());

        return dto;
    }

    public Bedroom convertDtoToEntity(final BedroomDTO bedroom) {
        final Bedroom entity = new Bedroom();
        entity.setId(bedroom.getId());
        entity.setBedroom(bedroom.getNumeroChambre());

        return entity;
    }

    public List<BedroomDTO> convertListEntityToListDto(final List<Bedroom> listEntities) {
        final List<BedroomDTO> listeDto = new ArrayList<>();
        for (final Bedroom entity : listEntities) {
            listeDto.add(convertEntityToDto(entity));
        }
        return listeDto;
    }

    public List<Bedroom> convertListDtoToListEntity(final List<BedroomDTO> listEntities) {
        final List<Bedroom> listeDO = new ArrayList<>();
        for (final BedroomDTO entity : listEntities) {
            listeDO.add(convertDtoToEntity(entity));
        }
        return listeDO;
    }

}
