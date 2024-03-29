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
public class AssignPatientToService {

    private final PatientService patientService;

    /**
     * Constructs a new AssignPatientController with the specified PatientService.
     *
     * @param patientService The patient service to be used.
     */
    @Autowired
    public AssignPatientToService(PatientService patientService) {
        this.patientService = patientService;
    }

    /**
     *
     * @param id_patient The ID of the patient to be assigned.
     * @param id_service The ID of the service to which the patient will be
     *                   assigned.
     * @return The DTO of the patient after assignment.
     */
    @PutMapping("/patient/{id_patient}/{id_service}")
    public PatientDTO assignPatientToService(@PathVariable int id_patient, @PathVariable int id_service) {
        return patientService.assignPatientToService(id_patient, id_service);
    }
}
