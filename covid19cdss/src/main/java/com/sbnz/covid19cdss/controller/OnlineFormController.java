package com.sbnz.covid19cdss.controller;

import com.sbnz.covid19cdss.model.OnlineForm;
import com.sbnz.covid19cdss.service.OnlineFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/onlineForm")
public class OnlineFormController {

    private final OnlineFormService service;

    @Autowired
    public OnlineFormController(OnlineFormService service){
        this.service = service;
    }

    @RequestMapping(value="/evaluate", method = RequestMethod.POST,
            produces = "application/json", consumes = "application/json")
    public ResponseEntity<String> evaluateOnlineForm(@RequestBody OnlineForm onlineForm) {
        String message = service.evaulateOnlineForm(onlineForm);
        return new ResponseEntity<String>(message, HttpStatus.OK);
    }
}
