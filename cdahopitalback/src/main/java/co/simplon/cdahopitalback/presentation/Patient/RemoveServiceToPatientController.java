package co.simplon.cdahopitalback.presentation.Patient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.cdahopitalback.business.dto.PatientDTO;
import co.simplon.cdahopitalback.business.service.Patient.PatientService;

/**
 * Controller class for handling HTTP PUT requests related to patients.
 */
@RestController
public class RemoveServiceToPatientController {

    /**
     * Constructs a new RemoveServiceToPatientController with the specified
     * PatientService.
     *
     * @param patientService The patient service to be used.
     */
    @Autowired
    private PatientService patientService;

    /**
     * 
     * @param id_patient The ID of the patient to remove from the service.
     * @return patient modified
     */
    @PutMapping("/patient/{id_patient}/removeService")
    public PatientDTO removePatientFromService(@PathVariable int id_patient) {

        return patientService.removePatientFromService(id_patient);

    }
}
