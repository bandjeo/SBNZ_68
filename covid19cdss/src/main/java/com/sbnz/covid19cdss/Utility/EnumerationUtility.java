package com.sbnz.covid19cdss.Utility;

import com.sbnz.covid19cdss.model.OnlineInstruction;

public class EnumerationUtility {

    public static String OnlineInstructionToString(OnlineInstruction instruction) {
        switch (instruction) {
            case StayHome:
                return "home";
            case VisitHealthCenter:
                return "health center";
            case VisitHospital:
                return "hospital";
            case GoToEmergencyHospital:
                return "emergency";
        }
        return "home";
    }
}
