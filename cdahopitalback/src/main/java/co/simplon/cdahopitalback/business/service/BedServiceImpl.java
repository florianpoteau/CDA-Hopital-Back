package co.simplon.cdahopitalback.business.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.simplon.cdahopitalback.business.convert.BedConvert;
import co.simplon.cdahopitalback.business.dto.BedDTO;
import co.simplon.cdahopitalback.persistance.entity.Bed;
import co.simplon.cdahopitalback.persistance.repository.BedRepository;

@Service
public class BedServiceImpl implements BedService {

    private BedRepository bedRepository;

    @Autowired
    public BedServiceImpl(BedRepository bedRepository) {
        this.bedRepository = bedRepository;
    }

    @Override
    public BedDTO createBed(BedDTO bedDTO) {
        Bed bed = BedConvert.getInstance().convertDtoToEntity(bedDTO);
        Bed savedBed = bedRepository.save(bed);
        return BedConvert.getInstance().convertEntityToDto(savedBed);
    }

    @Override
    public List<BedDTO> getAllBed() {
        final List<Bed> result = bedRepository.findAll();
        return BedConvert.getInstance().convertListEntityToListDto(result);
    }

    @Override
    public BedDTO putBed(long id, BedDTO bedDTO) {
        Bed bed = BedConvert.getInstance().convertDtoToEntity(bedDTO);
        Optional<Bed> optionalBed = bedRepository.findById(id);
        if (optionalBed.isPresent()) {
            Bed savedBed = bedRepository.save(bed);
            return BedConvert.getInstance().convertEntityToDto(savedBed);
        }
        return bedDTO;

    }

}
