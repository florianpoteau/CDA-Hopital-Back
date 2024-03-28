package co.simplon.cdahopitalback.presentation.Patient;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.cdahopitalback.business.dto.PatientDTO;
import co.simplon.cdahopitalback.business.service.Patient.PatientService;

@RestController
public class PutPatientController {

    private final PatientService patientService;

    @Autowired
    public PutPatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @PutMapping("/patient/{id}")
    public PatientDTO putPatient(@PathVariable int id, @RequestBody PatientDTO patientDTO) {
        return patientService.putPatient(id, patientDTO);
    }

}
