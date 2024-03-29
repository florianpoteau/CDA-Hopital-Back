package co.simplon.cdahopitalback.business.service.Patient;

import java.util.List;

import co.simplon.cdahopitalback.business.dto.PatientDTO;

/**
 * Service interface for managing patient-related operations.
 */
public interface PatientService {

    /**
     * Creates a new patient based on the information provided in the DTO.
     *
     * @param patientDTO The information of the patient to create.
     * @return The DTO of the created patient.
     */
    PatientDTO createPatient(PatientDTO patientDTO);

    /**
     * Retrieves the list of all patients.
     *
     * @return The list of all patients in DTO format.
     */
    List<PatientDTO> getAllPatient();

    /**
     * Updates the information of an existing patient.
     *
     * @param id         The identifier of the patient to update.
     * @param patientDTO The new information of the patient.
     * @return The DTO of the updated patient.
     */
    PatientDTO putPatient(long id, PatientDTO patientDTO);

    /**
     * Assigns a patient to a service.
     *
     * @param id_patient The identifier of the patient.
     * @param id_service The identifier of the service.
     * @return The DTO of the assigned patient.
     */
    PatientDTO assignPatientToService(int id_patient, int id_service);

    PatientDTO removePatientFromService(int id_patient);
}
