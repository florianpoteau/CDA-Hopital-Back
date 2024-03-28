package co.simplon.cdahopitalback.presentation.Bed;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.cdahopitalback.business.dto.BedDTO;
import co.simplon.cdahopitalback.business.service.Bed.BedService;

@RestController
public class ReadBedController {

    private final BedService bedService;

    @Autowired
    public ReadBedController(BedService bedService) {
        this.bedService = bedService;
    }

    @GetMapping("/bed")
    public List<BedDTO> listBed() {
        return bedService.getAllBed();
    }

}
