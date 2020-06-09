package com.sbnz.covid19cdss.mapper;

import com.sbnz.covid19cdss.dto.AnamnesisDTO;
import com.sbnz.covid19cdss.model.Anamnesis;
import com.sbnz.covid19cdss.model.Patient;

public class AnamnesisMapper {

    public static AnamnesisDTO toDTO(Anamnesis anamnesis) {
        return new AnamnesisDTO(anamnesis.getId(),
                anamnesis.getAge(),
                anamnesis.getWeight(),
                anamnesis.getHeight(),
                anamnesis.getGender(),
                anamnesis.isTravelled(),
                anamnesis.isInContact(),
                anamnesis.isFever(),
                anamnesis.isDryCough(),
                anamnesis.isTiredness(),
                anamnesis.isAches(),
                anamnesis.isSoreThroat(),
                anamnesis.isDiarrhoea(),
                anamnesis.isConjuctivits(),
                anamnesis.isHeadache(),
                anamnesis.isLossOfTasteOrSmell(),
                anamnesis.isRashDiscolouration(),
                anamnesis.isDifficultyBreathing(),
                anamnesis.isChestPains(),
                anamnesis.isLossOfSpeachOrMovement(),
                anamnesis.isAsthma(),
                anamnesis.isChronicKidney(),
                anamnesis.isChronicLung(),
                anamnesis.isDiabetes(),
                anamnesis.isHemoglobinDisorder(),
                anamnesis.isImmunocompromised(),
                anamnesis.isLiverDisease(),
                anamnesis.isHeartConditions(),
                anamnesis.isRiskGroup(),
                anamnesis.isObese());
    }

    public static Anamnesis fromDTO(AnamnesisDTO dto, Patient patient) {
        Anamnesis anamnesis = new Anamnesis();
        anamnesis.setId(dto.getId());
        anamnesis.setAge(dto.getAge());
        anamnesis.setWeight(dto.getWeight());
        anamnesis.setHeight(dto.getHeight());
        anamnesis.setGender(dto.getGender());
        anamnesis.setTravelled(dto.isTravelled());
        anamnesis.setInContact(dto.isInContact());
        anamnesis.setFever(dto.isFever());
        anamnesis.setDryCough(dto.isDryCough());
        anamnesis.setTiredness(dto.isTiredness());
        anamnesis.setAches(dto.isAches());
        anamnesis.setSoreThroat(dto.isSoreThroat());
        anamnesis.setDiarrhoea(dto.isDiarrhoea());
        anamnesis.setConjuctivits(dto.isConjuctivits());
        anamnesis.setHeadache(dto.isHeadache());
        anamnesis.setLossOfTasteOrSmell(dto.isLossOfTasteOrSmell());
        anamnesis.setAsthma(dto.isAsthma());
        anamnesis.setChronicKidney(dto.isChronicKidney());
        anamnesis.setChronicLung(dto.isChronicLung());
        anamnesis.setDiabetes(dto.isDiabetes());
        anamnesis.setHemoglobinDisorder(dto.isHemoglobinDisorder());
        anamnesis.setImmunocompromised(dto.isImmunocompromised());
        anamnesis.setLiverDisease(dto.isLiverDisease());
        anamnesis.setHeartConditions(dto.isHeartConditions());
        anamnesis.setRiskGroup(dto.isRiskGroup());
        anamnesis.setObese(dto.isObese());
        anamnesis.setPatient(patient);
        return anamnesis;
    }
}
