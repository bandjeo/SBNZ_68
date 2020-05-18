<template lang="html">

  <v-container>
    <v-row justify="center">
      <h1>Anamnesis</h1>
    </v-row>
    <div class="container">

    
    <v-row>
    <v-expansion-panels>
      <v-expansion-panel>
        <v-expansion-panel-header><h2>Personal information</h2></v-expansion-panel-header>
        <v-expansion-panel-content>
          
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
              <v-switch v-model="travelled" class="ma-2" label="Travelled outside the country"></v-switch>
            </v-col>
          </v-row>
          
          <v-row >
            <v-col cols="12" sm="12">
              <v-switch v-model="inContact" class="ma-2" label="Been in contact with anyone tested positive to COVID-19"></v-switch>
            </v-col>
          </v-row>

          <v-row>
            <v-col cols="12" sm="6" md="1">
              <v-text justify="center">Height: </v-text>
            </v-col>
            <v-col cols="12" sm="6" md="1">
              <v-text-field v-model="height" single-line outlined></v-text-field>
            </v-col>
          </v-row>
          
          <v-row>
            <v-col cols="12" sm="6" md="1">
              <v-text justify="center">Weight: </v-text>
            </v-col>
            <v-col cols="12" sm="6" md="1">
              <v-text-field v-model="weight" single-line outlined></v-text-field>
            </v-col>
          </v-row>
        </v-expansion-panel-content>
      </v-expansion-panel>

      
      <v-expansion-panel>
        <v-expansion-panel-header><h2>Underlying conditions</h2></v-expansion-panel-header>
        <v-expansion-panel-content>
          <v-row >
            <v-col cols="12" sm="12">
              <v-switch v-model="asthma" class="ma-2" label="Asthma"></v-switch>
            </v-col>
          </v-row>
          <v-row >
            <v-col cols="12" sm="12">
              <v-switch v-model="chronicLung" class="ma-2" label="Chronic lung disease"></v-switch>
            </v-col>
          </v-row>
          <v-row >
            <v-col cols="12" sm="12">
              <v-switch v-model="diabetes" class="ma-2" label="Diabetes"></v-switch>
            </v-col>
          </v-row>
          <v-row >
            <v-col cols="12" sm="12">
              <v-switch v-model="hemoglobinDisorder" class="ma-2" label="Hemoglobin disorder"></v-switch>
            </v-col>
          </v-row>
          <v-row >
            <v-col cols="12" sm="12">
              <v-switch v-model="immunocompromised" class="ma-2" label="Immunocompromized"></v-switch>
            </v-col>
          </v-row>
          <v-row >
            <v-col cols="12" sm="12">
              <v-switch v-model="liverDisease" class="ma-2" label="Liver disease"></v-switch>
            </v-col>
          </v-row>
          <v-row >
            <v-col cols="12" sm="12">
              <v-switch v-model="heartConditions" class="ma-2" label="Heart conditions"></v-switch>
            </v-col>
          </v-row>

        </v-expansion-panel-content>
      </v-expansion-panel>
      
      <v-expansion-panel>
        <v-expansion-panel-header><h2>Severe symptoms</h2></v-expansion-panel-header>
        <v-expansion-panel-content>
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
        </v-expansion-panel-content>
      </v-expansion-panel>
      
      <v-expansion-panel>
        <v-expansion-panel-header><h2>Common symptoms</h2></v-expansion-panel-header>
        <v-expansion-panel-content>
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
        </v-expansion-panel-content>
      </v-expansion-panel>

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
    
    
    <v-dialog v-model="dialog" max-width="500">
        <v-card>
          <v-card-text>
            <h2>Patient should{{ dialogTest ? '' : 'not '}} be tested</h2>
            <br>
            <h2>Patiend should{{ dialogTestMessage }}</h2>
          </v-card-text>
          <v-card-actions>
            <v-spacer></v-spacer>
            <v-brn text color="#FFFFFF" class="mt-10 mr-2" @click="dialog=false">Close</v-brn>
          </v-card-actions>
        </v-card>
    </v-dialog>
  </v-container>
</template>

<script lang="js">
import { submitAnamnesis } from '../axiosService.js'

  export default  {
    name: 'anamnesis-page',
    props: [],
    mounted () {

    },
    data () {
      return {
        age: "",
        riskGroup: false,
        travelled: false,
        inContact: false,
        height: 170,
        weight: 70,

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
        lossOfSpeachOrMovement: false,

        asthma: false,
        chronicKidney: false,
        chronicLung: false,
        diabetes: false,
        hemoglobinDisorder: false,
        immunocompromised: false,
        liverDisease: false,
        heartConditions: false,

        dialog: false,
        dialogTest: '',
        dialogLocationMessage: '',
      }
    },
    methods: {
      submitForm() {
        submitAnamnesis({
          age: parseInt(this.age),
          riskGroup: this.riskGroup,
          travelled: this.travelled,
          inContact: this.inContact,
          height: this.height,
          weight: this.weight,

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
          lossOfSpeachOrMovement: this.lossOfSpeachOrMovement,

          asthma: this.asthma,
          chronicKidney: this.chronicKidney,
          chronicLung: this.chronicLung,
          diabetes: this.diabetes,
          hemoglobinDisorder: this.hemoglobinDisorder,
          immunocompromised: this.immunocompromised,
          liverDisease: this.liverDisease,
          heartConditions: this.heartConditions,

        }).then(response => {
          this.dialogTest = response.data.shouldTest;
          switch(response.data.recoveryLocation) {
            case 'Home':
              this.dialogTestMessage = 'be sent home';
              break;
            case 'IsolatedCare':
              this.dialogTestMessage = 'be sent to isolated care';
              break;
            case 'HospitalCare':
              this.dialogTestMessage = 'be sent to hospital care';
              break;
            case 'IntensiveCare':
              this.dialogTestMessage = 'be sent to intesive care';
              break;
          }
          this.dialog = true;
        })
      }

    },
    computed: {

    }
}


</script>

<style scoped lang="scss">
  .anamnesis-page {

  }
</style>
