package co.simplon.cdahopitalback;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import co.simplon.cdahopitalback.business.dto.PatientDTO;
import co.simplon.cdahopitalback.business.service.Patient.PatientService;

@SpringBootTest
public class PatientServiceImplIntegrationTest {

    // PatientService
    @Autowired
    private PatientService patientService;

    // Integration test to check if a patient is updated
    @Test
    public void testPutPatient() {

        // I am checking with the patient who has id 1
        int patientId = 1;
        PatientDTO patientDTOToUpdate = new PatientDTO();
        patientDTOToUpdate.setId(patientId);
        patientDTOToUpdate.setName("Test");
        patientDTOToUpdate.setFirstname("D'intégration");

        // I call my service with my patientDTO
        PatientDTO updatedPatientDTO = patientService.putPatient(patientId, patientDTOToUpdate);

        // I check if the results are OK
        assertEquals(patientId, updatedPatientDTO.getId());
        assertEquals(patientDTOToUpdate.getName(), updatedPatientDTO.getName());
        assertEquals(patientDTOToUpdate.getFirstname(), updatedPatientDTO.getFirstname());

    }
}
