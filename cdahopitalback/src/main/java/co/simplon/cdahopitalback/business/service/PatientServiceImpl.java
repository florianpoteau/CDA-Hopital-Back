package co.simplon.cdahopitalback.business.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.simplon.cdahopitalback.business.convert.PatientConvert;
import co.simplon.cdahopitalback.business.dto.PatientDTO;
import co.simplon.cdahopitalback.persistance.entity.Patient;
import co.simplon.cdahopitalback.persistance.repository.PatientRepository;

@Service
public class PatientServiceImpl implements PatientService {

    private PatientRepository patientRepository;

    @Autowired
    public PatientServiceImpl(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @Override
    public PatientDTO createPatient(PatientDTO patientDTO) {
        Patient patient = PatientConvert.getInstance().convertDtoToEntity(patientDTO);
        Patient savedPatient = patientRepository.save(patient);
        return PatientConvert.getInstance().convertEntityToDto(savedPatient);
    }

    @Override
    public List<PatientDTO> getAllPatient() {
        final List<Patient> result = patientRepository.findAll();
        return PatientConvert.getInstance().convertListEntityToListDto(result);
    }

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
