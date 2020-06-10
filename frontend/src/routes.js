import AnamnesisPage from './components/AnamnesisPage.vue'
import OnlineHelpPage from './components/OnlineHelpPage.vue'
import OnlineInstructionPage from './components/OnlineInstructionPage.vue'
import PatientsPage from './components/PatientsPage.vue'
import singlePatientPage from './components/singlePatientPage.vue'
import rulesPage from './components/rulesPage.vue'

const routes = [
    {
      name: "onlineHelp",
      path: "/onlineHelp",
      component: OnlineHelpPage
    },
    {
      name: "anamnesis",
      path: "/anamnesis",
      component: AnamnesisPage
    },
    {
      name: "onlineInstruction",
      path: "/onlineInstruction/:instruction",
      component: OnlineInstructionPage,
    },
    {
      name: "patients",
      path: "/patients",
      component: PatientsPage,
    },
    {
      name: "patient",
      path: "/patient/:id",
      component: singlePatientPage,

    },
    {
      name: "rules",
      path: "/rules",
      component: rulesPage,

    },
    { path: "/", redirect: "/onlineHelp" }
  ];
  
  export default routes;