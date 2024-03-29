package co.simplon.cdahopitalback.presentation.Patient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.cdahopitalback.business.dto.AssignPatientToServiceDTO;
import co.simplon.cdahopitalback.business.dto.PatientDTO;
import co.simplon.cdahopitalback.business.service.Patient.PatientService;

@RestController
public class AssignPatientToService {

    private final PatientService patientService;

    @Autowired
    public AssignPatientToService(PatientService patientService) {
        this.patientService = patientService;
    }

    @PutMapping("/patient/{id_patient}/{id_service}")
    public PatientDTO assignPatientToService(@PathVariable int id_patient, @PathVariable int id_service) {
        AssignPatientToServiceDTO assignPatientToServiceDTO = new AssignPatientToServiceDTO();
        assignPatientToServiceDTO.setPatientId(id_patient);
        assignPatientToServiceDTO.setServiceId(id_service);
        return patientService.assignPatientToService(assignPatientToServiceDTO, id_patient, id_service);
    }
}
