package co.simplon.cdahopitalback.business.service.Patient;

import java.util.List;

import co.simplon.cdahopitalback.business.dto.PatientDTO;

/**
 * Service interface for managing patient-related operations.
 */
public interface PatientService {

    /**
     * Crée un nouveau patient à partir des informations fournies dans le DTO.
     *
     * @param patientDTO Les informations du patient à créer.
     * @return Le DTO du patient créé.
     */
    PatientDTO createPatient(PatientDTO patientDTO);

    /**
     * Récupère la liste de tous les patients.
     *
     * @return La liste de tous les patients sous forme de DTO.
     */
    List<PatientDTO> getAllPatient();

    /**
     * Met à jour les informations d'un patient existant.
     *
     * @param id         L'identifiant du patient à mettre à jour.
     * @param patientDTO Les nouvelles informations du patient.
     * @return Le DTO du patient mis à jour.
     */
    PatientDTO putPatient(long id, PatientDTO patientDTO);

    PatientDTO assignPatientToService(int id_patient,
            int id_service);

}
