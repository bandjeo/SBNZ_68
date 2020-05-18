import axios from "axios";
const submitOnlineFormURL = "http://localhost:8080/onlineForm/evaluate"
const submitAnamnesisURL = "http://localhost:8080/anamnesis/evaluate"

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