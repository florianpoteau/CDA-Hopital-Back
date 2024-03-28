package co.simplon.cdahopitalback.business.service.Bed;

import java.util.List;

import co.simplon.cdahopitalback.business.dto.BedDTO;

public interface BedService {

    BedDTO createBed(BedDTO bedDTO);

    List<BedDTO> getAllBed();

    BedDTO putBed(long id, BedDTO bedDTO);
}
