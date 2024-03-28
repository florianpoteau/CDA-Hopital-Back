package co.simplon.cdahopitalback.presentation.Patient;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.cdahopitalback.business.dto.PatientDTO;
import co.simplon.cdahopitalback.business.service.Patient.PatientService;

@RestController
public class PostPatientController {

    private final PatientService patientService;

    public PostPatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    /**
     * 
     * @param patientDTO the patientDTO
     * @return new patient
     */
    @PostMapping("/patient")
    public PatientDTO postPatient(@RequestBody PatientDTO patientDTO) {
        return patientService.createPatient(patientDTO);
    }

}