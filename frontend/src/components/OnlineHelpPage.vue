<template lang="html">
  <v-container>
    <v-row justify="center">
      <h1>Online Help</h1>
    </v-row>
    <div class="container">
    <v-row>
      <h2>Personal info</h2>
    </v-row>
    <v-row>
      <v-col cols="12" sm="6" md="1">
        <v-text justify="center">Age: </v-text>
      </v-col>
      <v-col cols="12" sm="6" md="1">
        <v-text-field v-model="age" single-line outlined></v-text-field>
      </v-col>
    </v-row>
    
    <v-row >
      <v-col cols="12" sm="12">
        <v-switch v-model="riskGroup" class="ma-2" label="Do you have any underlying health conditions?"></v-switch>
      </v-col>
    </v-row>
    
    <v-row >
      <v-col cols="12" sm="12">
        <v-switch v-model="travelled" class="ma-2" label="Have you been outside the country recently?"></v-switch>
      </v-col>
    </v-row>
    
    <v-row >
      <v-col cols="12" sm="12">
        <v-switch v-model="inContact" class="ma-2" label="Have you been in contact with anyone tested positive for COVID-19?"></v-switch>
      </v-col>
    </v-row>
    
    
    <v-row>
      <h2>Severe symptoms - check any symptoms you exibit</h2>
    </v-row>
    <v-row >
      <v-col cols="12" sm="12">
        <v-switch v-model="difficultyBreathing" class="ma-2" label="Difficulty breathing"></v-switch>
      </v-col>
    </v-row>
    
    <v-row >
      <v-col cols="12" sm="12">
        <v-switch v-model="chestPains" class="ma-2" label="Chest pains"></v-switch>
      </v-col>
    </v-row>
    
    <v-row >
      <v-col cols="12" sm="12">
        <v-switch v-model="lossOfSpeachOrMovement" class="ma-2" label="Loss of speach or movement"></v-switch>
      </v-col>
    </v-row>

    <v-row>
      <h2>Common symptoms - check any symptoms you exibit</h2>
    </v-row>
    <v-row >
      <v-col cols="12" sm="12">
        <v-switch v-model="fever" class="ma-2" label="Fever"></v-switch>
      </v-col>
    </v-row>
    
    <v-row >
      <v-col cols="12" sm="12">
        <v-switch v-model="dryCough" class="ma-2" label="Dry cough"></v-switch>
      </v-col>
    </v-row>
    
    <v-row >
      <v-col cols="12" sm="12">
        <v-switch v-model="tiredness" class="ma-2" label="Tiredness"></v-switch>
      </v-col>
    </v-row>
    
    <v-row>
    <v-expansion-panels>
      <v-expansion-panel>
        <v-expansion-panel-header><h2>Uncommon symptoms</h2></v-expansion-panel-header>
        <v-expansion-panel-content>
          <v-row >
            <v-col cols="12" sm="12">
              <v-switch v-model="aches" class="ma-2" label="Aches or pains"></v-switch>
            </v-col>
          </v-row>

          <v-row >
            <v-col cols="12" sm="12">
              <v-switch v-model="soreThroat" class="ma-2" label="Sore throat"></v-switch>
            </v-col>
          </v-row>

          <v-row >
            <v-col cols="12" sm="12">
              <v-switch v-model="diarrhoea" class="ma-2" label="Diarrhoea"></v-switch>
            </v-col>
          </v-row>

          <v-row >
            <v-col cols="12" sm="12">
              <v-switch v-model="conjuctivits" class="ma-2" label="Conjuctivitis (eye infection)"></v-switch>
            </v-col>
          </v-row>

          <v-row >
            <v-col cols="12" sm="12">
              <v-switch v-model="headache" class="ma-2" label="Headache"></v-switch>
            </v-col>
          </v-row>

          <v-row >
            <v-col cols="12" sm="12">
              <v-switch v-model="lossOfTasteOrSmell" class="ma-2" label="Loss of taste or smell"></v-switch>
            </v-col>
          </v-row>

          <v-row >
            <v-col cols="12" sm="12">
              <v-switch v-model="rashDiscolouration" class="ma-2" label="Rashes or discolouration on skin, fingers or toes"></v-switch>
            </v-col>
          </v-row>
        </v-expansion-panel-content>
        
      </v-expansion-panel>
    </v-expansion-panels>
    </v-row>

    <v-row justify="center">
      <v-btn color="#FFFFFF" class="mt-10 mr-2" @click="submitForm()">Submit</v-btn>
    </v-row>

    </div>
    
    

  </v-container>


</template>

<script lang="js">

  import { submitOnlineForm } from '../axiosService.js'

  export default  {
    name: 'online-help-page',
    props: [],
    mounted () {

    },
    data () {
      return {
        age: "",
        riskGroup: false,
        travelled: false,
        inContact: false,

        fever: false,
        dryCough: false,
        tiredness: false,

        aches: false,
        soreThroat: false,
        diarrhoea: false,
        conjuctivits: false,
        headache: false,
        lossOfTasteOrSmell: false,
        rashDiscolouration: false,

        difficultyBreathing: false,
        chestPains: false,
        lossOfSpeachOrMovement: false
      }
    },
    methods: {
      submitForm() {
        submitOnlineForm({
          age: parseInt(this.age),
          riskGroup: this.riskGroup,
          travelled: this.travelled,
          inContact: this.inContact,

          fever: this.fever,
          dryCough: this.dryCough,
          tiredness: this.tiredness,

          aches: this.aches,
          soreThroat: this.soreThroat,
          diarrhoea: this.diarrhoea,
          conjuctivits: this.conjuctivits,
          headache: this.headache,
          lossOfTasteOrSmell: this.lossOfTasteOrSmell,
          rashDiscolouration: this.rashDiscolouration,

          difficultyBreathing: this.difficultyBreathing,
          chestPains: this.chestPains,
          lossOfSpeachOrMovement: this.lossOfSpeachOrMovement

        }).then(response => {
          alert(response.data.message);
        })
      }
    },
    computed: {
    }
}

</script>

<style scoped lang="scss">
  .online-help-page {

  }

</style>
