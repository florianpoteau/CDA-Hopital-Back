package co.simplon.cdahopitalback.business.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.simplon.cdahopitalback.business.convert.PatientConvert;
import co.simplon.cdahopitalback.business.dto.PatientDTO;
import co.simplon.cdahopitalback.persistance.entity.Patient;
import co.simplon.cdahopitalback.persistance.repository.PatientRepository;

/**
 * Implémentation du service pour la gestion des patients.
 */
@Service
public class PatientServiceImpl implements PatientService {

    private PatientRepository patientRepository;

    /**
     * Constructeur pour le service PatientServiceImpl.
     *
     * @param patientRepository Le repository des patients.
     */
    @Autowired
    public PatientServiceImpl(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    /**
     * Crée un nouveau patient à partir des informations fournies dans le DTO.
     *
     * @param patientDTO Les informations du patient à créer.
     * @return Le DTO du patient créé.
     */
    @Override
    public PatientDTO createPatient(PatientDTO patientDTO) {
        Patient patient = PatientConvert.getInstance().convertDtoToEntity(patientDTO);
        Patient savedPatient = patientRepository.save(patient);
        return PatientConvert.getInstance().convertEntityToDto(savedPatient);
    }

    /**
     * Récupère la liste de tous les patients.
     *
     * @return La liste de tous les patients sous forme de DTO.
     */
    @Override
    public List<PatientDTO> getAllPatient() {
        final List<Patient> result = patientRepository.findAll();
        return PatientConvert.getInstance().convertListEntityToListDto(result);
    }

    /**
     * Met à jour les informations d'un patient existant.
     *
     * @param id         L'identifiant du patient à mettre à jour.
     * @param patientDTO Les nouvelles informations du patient.
     * @return Le DTO du patient mis à jour.
     */
    @Override
    public PatientDTO putPatient(long id, PatientDTO patientDTO) {
        Patient patient = PatientConvert.getInstance().convertDtoToEntity(patientDTO);
        Optional<Patient> optionalPatient = patientRepository.findById(id);
        if (optionalPatient.isPresent()) {
            Patient savedPatient = patientRepository.save(patient);
            return PatientConvert.getInstance().convertEntityToDto(savedPatient);
        }
        return patientDTO;
    }

}
