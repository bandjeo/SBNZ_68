import AnamnesisPage from './components/AnamnesisPage.vue'
import OnlineHelpPage from './components/OnlineHelpPage.vue'
import OnlineInstructionPage from './components/OnlineInstructionPage.vue'

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
    { path: "/", redirect: "/onlineHelp" }
  ];
  
  export default routes;