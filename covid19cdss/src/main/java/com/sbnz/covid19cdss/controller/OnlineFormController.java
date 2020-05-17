package com.sbnz.covid19cdss.controller;

import com.sbnz.covid19cdss.dto.MessageDto;
import com.sbnz.covid19cdss.model.OnlineForm;
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
    public ResponseEntity<MessageDto> evaluateOnlineForm(@RequestBody OnlineForm onlineForm) {
        String message = service.evaulateOnlineForm(onlineForm);
        return new ResponseEntity<MessageDto>(new MessageDto(message), HttpStatus.OK);
    }
}
