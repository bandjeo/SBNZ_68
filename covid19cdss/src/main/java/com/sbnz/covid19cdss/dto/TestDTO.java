package com.sbnz.covid19cdss.dto;

import com.sbnz.covid19cdss.model.Patient;

import javax.persistence.*;
import java.util.Date;

public class TestDTO {

    private Long id;
    private boolean result;
    private Date timestamp;

    public TestDTO() {
    }

    public TestDTO(Long id, boolean result, Date timestamp) {
        this.id = id;
        this.result = result;
        this.timestamp = timestamp;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}
