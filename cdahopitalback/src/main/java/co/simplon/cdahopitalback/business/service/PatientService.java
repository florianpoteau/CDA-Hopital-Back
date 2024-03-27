package co.simplon.cdahopitalback.business.service;

import java.util.List;

import co.simplon.cdahopitalback.business.dto.PatientDTO;

public interface PatientService {

    PatientDTO createPatient(PatientDTO patientDTO);

    List<PatientDTO> getAllPatient();

    PatientDTO putPatient(long id, PatientDTO patientDTO);

}
