package com.sbnz.covid19cdss.mapper;

import com.sbnz.covid19cdss.dto.TestDTO;
import com.sbnz.covid19cdss.model.Patient;
import com.sbnz.covid19cdss.model.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestMapper {

    public static TestDTO toDTO(Test test) {
        return new TestDTO(test.getId(), test.isResult(), test.getTimestamp());
    }

    public static Test fromDTO(TestDTO dto) {
        Test test = new Test();
        test.setId(dto.getId());
        test.setResult(dto.isResult());
        test.setTimestamp(dto.getTimestamp());
        return test;
    }

    public static Set<TestDTO> toDTOSet(Set<Test> tests) {
        Set<TestDTO> dtos = new HashSet<>();
        for (Test t : tests) {
            dtos.add(toDTO(t));
        }
        return dtos;
    }

    public static Set<Test> fromDTOSet(Set<TestDTO> dtos, Patient patient) {
        Set<Test> tests = new HashSet<>();
        for (TestDTO dto : dtos) {
            Test test = fromDTO(dto);
            test.setPatient(patient);
            tests.add(test);
        }
        return tests;
    }
}
