package com.sbnz.covid19cdss.controller;

import com.sbnz.covid19cdss.Utility.EnumerationUtility;
import com.sbnz.covid19cdss.dto.MessageDto;
import com.sbnz.covid19cdss.model.OnlineEvaluation;
import com.sbnz.covid19cdss.model.OnlineForm;
import com.sbnz.covid19cdss.model.OnlineInstruction;
import com.sbnz.covid19cdss.service.OnlineFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins="*")
@RequestMapping(value="/onlineForm")
public class OnlineFormController {

    private final OnlineFormService service;

    @Autowired
    public OnlineFormController(OnlineFormService service){
        this.service = service;
    }

    @RequestMapping(value="/evaluate", method = RequestMethod.POST,
            produces = "application/json", consumes = "application/json")
    public ResponseEntity<OnlineInstruction> evaluateOnlineForm(@RequestBody OnlineForm onlineForm) {
        OnlineEvaluation evaluation = service.evaulateOnlineForm(onlineForm);
        return new ResponseEntity<OnlineInstruction>(evaluation.getInstruction(), HttpStatus.OK);
    }
}
