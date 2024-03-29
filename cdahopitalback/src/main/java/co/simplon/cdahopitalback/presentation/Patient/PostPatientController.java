package co.simplon.cdahopitalback.presentation.Patient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.cdahopitalback.business.dto.PatientDTO;
import co.simplon.cdahopitalback.business.service.Patient.PatientService;

/**
 * Controller class for handling HTTP POST requests related to patients.
 */
@RestController
public class PostPatientController {

    private final PatientService patientService;

    /**
     * Constructs a new PostPatientController with the specified PatientService.
     *
     * @param patientService The patient service to be used.
     */
    @Autowired
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
