package co.simplon.cdahopitalback.business.convert;

import java.util.ArrayList;
import java.util.List;

import co.simplon.cdahopitalback.business.dto.BedDTO;
import co.simplon.cdahopitalback.persistance.entity.Bed;

public class BedConvert {

    private static BedConvert instance;

    private BedConvert() {

    }

    public static BedConvert getInstance() {
        if (instance == null)
            instance = new BedConvert();
        return instance;
    }

    public BedDTO convertEntityToDto(final Bed entity) {
        final BedDTO dto = new BedDTO();
        dto.setId(entity.getId());
        dto.setPatientId(entity.getPatient());
        dto.setBedroomId(entity.getbedroom());
        dto.setServiceId(entity.getService());

        return dto;
    }

    public Bed convertDtoToEntity(final BedDTO entity) {
        final Bed bed = new Bed();
        bed.setId(entity.getId());
        bed.setBedroom(entity.getBedroomId());
        bed.setPatient(entity.getPatientId());
        bed.setService(entity.getServiceId());

        return bed;
    }

    public List<BedDTO> convertListEntityToListDto(final List<Bed> listEntities) {
        final List<BedDTO> listeDto = new ArrayList<>();
        for (final Bed entity : listEntities) {
            listeDto.add(convertEntityToDto(entity));
        }
        return listeDto;
    }

    public List<Bed> convertListDtoToListEntity(final List<BedDTO> listEntities) {
        final List<Bed> listeDO = new ArrayList<>();
        for (final BedDTO entity : listEntities) {
            listeDO.add(convertDtoToEntity(entity));
        }
        return listeDO;
    }

}
