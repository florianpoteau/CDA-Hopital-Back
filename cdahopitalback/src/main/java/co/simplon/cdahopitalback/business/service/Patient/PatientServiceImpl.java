package co.simplon.cdahopitalback.business.service.Patient;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.simplon.cdahopitalback.business.convert.PatientConvert;
import co.simplon.cdahopitalback.business.dto.PatientDTO;
import co.simplon.cdahopitalback.persistance.entity.Patient;
import co.simplon.cdahopitalback.persistance.entity.Services;
import co.simplon.cdahopitalback.persistance.repository.PatientRepository;
import co.simplon.cdahopitalback.persistance.repository.ServicesRepository;
import jakarta.persistence.EntityNotFoundException;

/**
 * Implementation of the service for managing patients.
 */
@Service
public class PatientServiceImpl implements PatientService {

    private PatientRepository patientRepository;
    private ServicesRepository serviceRepository;

    /**
     * Constructor for the PatientServiceImpl service.
     *
     * @param patientRepository The repository for patients.
     */
    @Autowired
    public PatientServiceImpl(PatientRepository patientRepository, ServicesRepository serviceRepository) {
        this.patientRepository = patientRepository;
        this.serviceRepository = serviceRepository;
    }

    /**
     * Creates a new patient based on the information provided in the DTO.
     *
     * @param patientDTO The information of the patient to create.
     * @return The DTO of the created patient.
     */
    @Override
    public PatientDTO createPatient(PatientDTO patientDTO) {
        Patient patient = PatientConvert.getInstance().convertDtoToEntity(patientDTO);
        Patient savedPatient = patientRepository.save(patient);
        return PatientConvert.getInstance().convertEntityToDto(savedPatient);
    }

    /**
     * Retrieves the list of all patients.
     *
     * @return The list of all patients in DTO format.
     */
    @Override
    public List<PatientDTO> getAllPatient() {
        final List<Patient> result = patientRepository.findAll();
        return PatientConvert.getInstance().convertListEntityToListDto(result);
    }

    /**
     * Updates the information of an existing patient.
     *
     * @param id         The identifier of the patient to update.
     * @param patientDTO The new information of the patient.
     * @return The DTO of the updated patient.
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
            throw new EntityNotFoundException("The patient does not exist: " + id);
        }
    }

    /**
     * Assigns a patient to a service.
     *
     * @param id_patient The identifier of the patient.
     * @param id_service The identifier of the service.
     * @return The DTO of the assigned patient.
     */
    @Override
    public PatientDTO assignPatientToService(int id_patient, int id_service) {
        Optional<Patient> optionalPatient = patientRepository.findById((long) id_patient);
        if (optionalPatient.isPresent()) {
            Optional<Services> optionalService = serviceRepository.findById((long) id_service);
            if (optionalService.isPresent()) {
                Patient existingPatient = optionalPatient.get();
                existingPatient.setService(optionalService.get());

                Patient updatedPatient = patientRepository.save(existingPatient);

                return PatientConvert.getInstance().convertEntityToDto(updatedPatient);
            } else {
                throw new EntityNotFoundException("The service with id " + id_service + " does not exist");
            }
        } else {
            throw new EntityNotFoundException("The patient with id " + id_patient + " does not exist");
        }
    }

    @Override
    public PatientDTO removePatientFromService(int id_patient) {

        Optional<Patient> optionalPatient = patientRepository.findById((long) id_patient);
        Patient patient = optionalPatient.get();
        patient.setService(null);

        Patient updatedPatient = patientRepository.save(patient);

        return PatientConvert.getInstance().convertEntityToDto(updatedPatient);

    }
}
