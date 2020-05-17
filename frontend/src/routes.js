import AnamnesisPage from './components/AnamnesisPage.vue'
import OnlineHelpPage from './components/OnlineHelpPage.vue'

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
    { path: "/", redirect: "/onlineHelp" }
  ];
  
  export default routes;