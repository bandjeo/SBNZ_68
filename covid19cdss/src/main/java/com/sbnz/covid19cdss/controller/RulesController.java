package com.sbnz.covid19cdss.controller;


import com.sbnz.covid19cdss.dto.MessageDto;
import com.sbnz.covid19cdss.service.RulesService;
import org.apache.tools.ant.taskdefs.condition.Http;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.FileNotFoundException;
import java.io.IOException;

@RestController
@CrossOrigin(origins="*")
@RequestMapping(value="/rules")
public class RulesController {

    private RulesService service;

    @Autowired
    public RulesController(RulesService service) {
        this.service = service;
    }

    @RequestMapping(value="", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
    public ResponseEntity<MessageDto> set(@RequestBody MessageDto messageDto) {
        try {
            this.service.setDrl(messageDto.getMessage());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return new ResponseEntity<>(new MessageDto("could not read drlFile"), HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(new MessageDto("success"), HttpStatus.OK);
    }

    @RequestMapping(value="", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<String> get() {

        String rulesText = null;
        try {
            rulesText = service.getDrl();
        } catch (IOException e) {
            e.printStackTrace();
            return new ResponseEntity<>("could not read file", HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(rulesText, HttpStatus.OK);
    }

}
