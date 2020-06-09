package com.sbnz.covid19cdss.controller;

import com.sbnz.covid19cdss.dto.MessageDto;
import com.sbnz.covid19cdss.dto.TestDTO;
import com.sbnz.covid19cdss.mapper.TestMapper;
import com.sbnz.covid19cdss.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins="*")
@RequestMapping(value="/test")
public class TestController {

    private TestService service;

    @Autowired
    public TestController(TestService service) {
        this.service = service;
    }

    @RequestMapping(value="/{patientId}", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
    public ResponseEntity<MessageDto> addTest(@RequestBody TestDTO dto, @PathVariable Long patientId) {
        this.service.add(TestMapper.fromDTO(dto), patientId);
        return new ResponseEntity<>(new MessageDto("success"), HttpStatus.OK);
    }
}
