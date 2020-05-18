package com.sbnz.covid19cdss.controller;

import com.sbnz.covid19cdss.Utility.EnumerationUtility;
import com.sbnz.covid19cdss.dto.MessageDto;
import com.sbnz.covid19cdss.model.Anamnesis;
import com.sbnz.covid19cdss.model.AnamnesisEvaluation;
import com.sbnz.covid19cdss.model.OnlineForm;
import com.sbnz.covid19cdss.model.OnlineInstruction;
import com.sbnz.covid19cdss.service.AnamnesisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins="*")
@RequestMapping(value="/anamnesis")
public class AnamnesisController {

    private final AnamnesisService service;

    @Autowired
    public AnamnesisController(AnamnesisService service) {
        this.service = service;
    }

    @RequestMapping(value="/evaluate", method = RequestMethod.POST,
            produces = "application/json", consumes = "application/json")
    public ResponseEntity<AnamnesisEvaluation> evaluateOnlineForm(@RequestBody Anamnesis anamnesis) {
        AnamnesisEvaluation evaluation = service.evaluateAnamnesis(anamnesis);
        return new ResponseEntity<AnamnesisEvaluation>(evaluation, HttpStatus.OK);
    }
}
