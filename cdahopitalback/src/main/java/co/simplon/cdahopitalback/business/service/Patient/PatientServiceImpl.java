package co.simplon.cdahopitalback.business.service.Patient;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.simplon.cdahopitalback.business.convert.PatientConvert;
import co.simplon.cdahopitalback.business.dto.AssignPatientToServiceDTO;
import co.simplon.cdahopitalback.business.dto.PatientDTO;
import co.simplon.cdahopitalback.persistance.entity.Patient;
import co.simplon.cdahopitalback.persistance.entity.Services;
import co.simplon.cdahopitalback.persistance.repository.PatientRepository;
import co.simplon.cdahopitalback.persistance.repository.ServicesRepository;
import co.simplon.cdahopitalback.presentation.Patient.AssignPatientToService;
import jakarta.persistence.EntityNotFoundException;

/**
 * Implémentation du service pour la gestion des patients.
 */
@Service
public class PatientServiceImpl implements PatientService {

    private PatientRepository patientRepository;
    private ServicesRepository serviceRepository;

    /**
     * Constructeur pour le service PatientServiceImpl.
     *
     * @param patientRepository Le repository des patients.
     */
    @Autowired
    public PatientServiceImpl(PatientRepository patientRepository, ServicesRepository serviceRepository) {
        this.patientRepository = patientRepository;
        this.serviceRepository = serviceRepository;
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
        Optional<Patient> optionalPatient = patientRepository.findById(id);
        if (optionalPatient.isPresent()) {
            Patient existingPatient = optionalPatient.get();
            existingPatient.setName(patientDTO.getName());
            existingPatient.setFirstname(patientDTO.getFirstname());
            existingPatient.setDatebirth(patientDTO.getDatebirth());
            existingPatient.setDatearrivee(patientDTO.getDatearrivee());
            existingPatient.setDatesortie(patientDTO.getDatesortie());
            existingPatient.setNosecu(patientDTO.getNosecu());
            existingPatient.setBed(patientDTO.getBedId());
            existingPatient.setNotel(patientDTO.getNotel());
            existingPatient.setSexe(patientDTO.getSexe());
            existingPatient.setService(patientDTO.getServiceId());

            Patient updatedPatient = patientRepository.save(existingPatient);

            return PatientConvert.getInstance().convertEntityToDto(updatedPatient);
        } else {
            throw new EntityNotFoundException("Le patient n'existe pas " + id);
        }
    }

    @Override
    public PatientDTO assignPatientToService(AssignPatientToServiceDTO assignPatientToServiceDTO, int id_patient,
            int id_service) {

        Optional<Patient> optionalPatient = patientRepository.findById((long) id_patient);
        if (optionalPatient.isPresent()) {
            Optional<Services> optionalService = serviceRepository.findById((long) id_service);
            if (optionalService.isPresent()) {
                Patient existingPatient = optionalPatient.get();
                existingPatient.setService(optionalService.get());

                Patient updatedPatient = patientRepository.save(existingPatient);

                return PatientConvert.getInstance().convertEntityToDto(updatedPatient);
            } else {
                throw new EntityNotFoundException("Le service avec l'identifiant " + id_service + " n'existe pas");
            }
        } else {
            throw new EntityNotFoundException("Le patient avec l'identifiant " + id_patient + " n'existe pas");
        }
    }

}
