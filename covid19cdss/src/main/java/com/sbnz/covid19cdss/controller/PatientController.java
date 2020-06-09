package com.sbnz.covid19cdss.controller;

import com.sbnz.covid19cdss.dto.MessageDto;
import com.sbnz.covid19cdss.dto.PatientDTO;
import com.sbnz.covid19cdss.mapper.PatientMapper;
import com.sbnz.covid19cdss.model.Patient;
import com.sbnz.covid19cdss.service.PatientService;
import org.apache.tools.ant.taskdefs.condition.Http;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins="*")
@RequestMapping(value="/patient")
public class PatientController {

    private PatientService service;

    public PatientController(PatientService service) {
        this.service = service;
    }

    @RequestMapping(value="", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<List<PatientDTO>> getAll() {
        List<Patient> patients = service.getAll();
        List<PatientDTO> patientDTOs = PatientMapper.toDTOList(patients);
        return new ResponseEntity<>(patientDTOs, HttpStatus.OK);
    }

    @RequestMapping(value="", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
    public ResponseEntity<MessageDto> add(@RequestBody PatientDTO patientDTO) {
        service.add(PatientMapper.fromDTO(patientDTO));
        return new ResponseEntity<>(new MessageDto("success"), HttpStatus.OK);
    }

    @RequestMapping(value="/{id}", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<PatientDTO> getOne(@PathVariable long id) {
        Patient patient = service.getOne(id);
        PatientDTO dto = PatientMapper.toDTO(patient);
        return new ResponseEntity<>(dto, HttpStatus.OK);
    }

}
