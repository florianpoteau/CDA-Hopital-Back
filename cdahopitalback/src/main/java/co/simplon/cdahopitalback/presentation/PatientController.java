package co.simplon.cdahopitalback.presentation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.cdahopitalback.business.dto.PatientDTO;
import co.simplon.cdahopitalback.business.service.PatientService;

/**
 * Contrôleur REST pour la gestion des patients.
 */
@RestController
public class PatientController {

    private final PatientService patientService;

    /**
     * 
     * @param patientService Le service de gestion des patients
     */
    @Autowired
    public PatientController(PatientService patientService) {
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
