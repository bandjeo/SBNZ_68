package com.sbnz.covid19cdss.repository;

import com.sbnz.covid19cdss.model.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestRepository extends JpaRepository<Test, Long> {

    public List<Test> findAllByPatientId(Long id);
}
