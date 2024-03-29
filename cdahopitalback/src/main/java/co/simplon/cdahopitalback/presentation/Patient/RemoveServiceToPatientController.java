package co.simplon.cdahopitalback.presentation.Patient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.cdahopitalback.business.dto.PatientDTO;
import co.simplon.cdahopitalback.business.service.Patient.PatientService;

@RestController
public class RemoveServiceToPatientController {

    @Autowired
    private PatientService patientService;

    @PutMapping("/patient/{id_patient}/removeService")
    public ResponseEntity<PatientDTO> removePatientFromService(@PathVariable int id_patient) {

        PatientDTO updatedPatient = patientService.removePatientFromService(id_patient);
        return ResponseEntity.ok(updatedPatient);

    }
}
