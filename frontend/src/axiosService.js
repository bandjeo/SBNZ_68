import axios from "axios";
const submitOnlineFormURL = "http://localhost:8080/onlineForm/evaluate";
const submitAnamnesisURL = "http://localhost:8080/anamnesis/evaluate";
const admitPatientUrl = "http://localhost:8080/patient";
const getAllPatientsURL = "http://localhost:8080/patient";
const getSinglePatientUTL = "http://localhost:8080/patient/";
const submitTestURL = "http://localhost:8080/test/"
const patientTestStatusURL = "http://localhost:8080/test/"

export const submitOnlineForm = (data) => {
    return axios({
        method: "post",
        url: submitOnlineFormURL,
        data
    })
}

export const submitAnamnesis = (data) => {
    return axios({
        method: "post",
        url: submitAnamnesisURL,
        data
    })
}

export const admitPatient = (data) => {
    return axios({
        method: "post",
        url: admitPatientUrl,
        data
    })
}

export const getAllPatients = () => {
    return axios({
        method: "get",
        url: getAllPatientsURL
    })
}

export const getSinglePatient = (id) => {
    return axios({
        method: "get",
        url: getSinglePatientUTL + id
    })
}

export const submitTest = (test, patientId) => {
    return axios({
        method: "post",
        data: test,
        url: submitTestURL + patientId
    })
}

export const patientTestStatus = (patientId) => {
    return axios({
        method: "get",
        url: patientTestStatusURL + patientId
    })
}