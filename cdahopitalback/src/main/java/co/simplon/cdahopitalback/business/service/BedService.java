package co.simplon.cdahopitalback.business.service;

import java.util.List;

import co.simplon.cdahopitalback.business.dto.BedDTO;

public interface BedService {

    BedDTO createBed(BedDTO bedDTO);

    List<BedDTO> getAllBed();

    BedDTO putBed(long id, BedDTO bedDTO);
}
