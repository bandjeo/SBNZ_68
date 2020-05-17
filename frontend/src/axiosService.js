import axios from "axios";
const submitOnlineFormURL = "http://localhost:8080/onlineForm/evaluate"

export const submitOnlineForm = (data) => {
    return axios({
        method: "post",
        url: submitOnlineFormURL,
        data
    })
}