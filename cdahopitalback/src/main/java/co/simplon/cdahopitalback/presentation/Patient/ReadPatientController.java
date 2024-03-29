package co.simplon.cdahopitalback.presentation.Patient;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.cdahopitalback.business.dto.PatientDTO;
import co.simplon.cdahopitalback.business.service.Patient.PatientService;

/**
 * Controller class for handling HTTP GET requests related to patients.
 */
@RestController
public class ReadPatientController {

    private final PatientService patientService;

    /**
     * Constructs a new ReadPatientController with the specified PatientService.
     *
     * @param patientService The patient service to be used.
     */
    @Autowired
    public ReadPatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    /**
     *
     * 
     * @return La liste de tous les patients
     */
    @GetMapping("/patient")
    public List<PatientDTO> listPatients() {
        return patientService.getAllPatient();
    }

}
