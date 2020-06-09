package com.sbnz.covid19cdss.mapper;


import com.sbnz.covid19cdss.dto.PatientDTO;
import com.sbnz.covid19cdss.model.Patient;
import com.sbnz.covid19cdss.model.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PatientMapper {

    public static PatientDTO toDTO(Patient patient) {
        return new PatientDTO(patient.getId(),
                patient.getName(),
                patient.getLastName(),
                patient.getRecoveryLocation(),
                AnamnesisMapper.toDTO(patient.getAnamneses()),
                TestMapper.toDTOSet(patient.getTests()));
    }

    public static Patient fromDTO(PatientDTO dto) {
        Patient patient = new Patient();

        patient.setId(dto.getId());
        patient.setName(dto.getName());
        patient.setLastName(dto.getLastName());
        patient.setRecoveryLocation(dto.getRecoveryLocation());
        patient.setAnamneses(AnamnesisMapper.fromDTO(dto.getAnamneses(), patient));
        patient.setTests(TestMapper.fromDTOSet(dto.getTests(), patient));

        return patient;
    }

    public static List<PatientDTO> toDTOList(List<Patient> patients) {
        List<PatientDTO> dtos = new ArrayList<>();
        for (Patient p : patients) {
            dtos.add(toDTO(p));
        }
        return dtos;
    }
}
