<template lang="html">

  <v-container>
    <v-row justify="center">
      <h1>Patient</h1>
    </v-row>
    <div class="container">

    
    <v-row>
    <v-expansion-panels>
      <v-expansion-panel>
        <v-expansion-panel-header><h2>Personal information</h2></v-expansion-panel-header>
        <v-expansion-panel-content>
          
          <v-row>
            <v-col cols="12" sm="6" md="1">
              <v-text justify="center">Name: </v-text>
            </v-col>
            <v-col cols="12" sm="6" md="3">
              <v-text-field readonly v-model="patient.name" single-line outlined></v-text-field>
            </v-col>
          </v-row>

          <v-row>
            <v-col cols="12" sm="6" md="1">
              <v-text justify="center">Last Name: </v-text>
            </v-col>
            <v-col cols="12" sm="6" md="3">
              <v-text-field readonly v-model="patient.lastName" single-line outlined></v-text-field>
            </v-col>
          </v-row>

          <v-row>
            <v-col cols="12" sm="6" md="1">
              <v-text justify="center">Recovery Location: </v-text>
            </v-col>
            <v-col cols="12" sm="6" md="3">
              <v-text-field readonly v-model="patient.recoveryLocation" single-line outlined></v-text-field>
            </v-col>
          </v-row>

          <v-row>
            <v-col cols="12" sm="6" md="1">
              <v-text justify="center">Age: </v-text>
            </v-col>
            <v-col cols="12" sm="6" md="1">
              <v-text-field readonly v-model="patient.anamneses.age" single-line outlined></v-text-field>
            </v-col>
          </v-row>
          
          <v-row >
            <v-col cols="12" sm="12">
              <v-switch  readonly v-model="patient.anamneses.travelled" class="ma-2" label="Travelled outside the country"></v-switch>
            </v-col>
          </v-row>
          
          <v-row >
            <v-col cols="12" sm="12">
              <v-switch  readonly v-model="patient.anamneses.inContact" class="ma-2" label="Been in contact with anyone tested positive to COVID-19"></v-switch>
            </v-col>
          </v-row>

          <v-row>
            <v-col cols="12" sm="6" md="1">
              <v-text justify="center">Height: </v-text>
            </v-col>
            <v-col cols="12" sm="6" md="1">
              <v-text-field readonly v-model="patient.anamneses.height" single-line outlined></v-text-field>
            </v-col>
          </v-row>
          
          <v-row>
            <v-col cols="12" sm="6" md="1">
              <v-text justify="center">Weight: </v-text>
            </v-col>
            <v-col cols="12" sm="6" md="1">
              <v-text-field readonly v-model="patient.anamneses.weight" single-line outlined></v-text-field>
            </v-col>
          </v-row>
        </v-expansion-panel-content>
      </v-expansion-panel>

      
      <v-expansion-panel>
        <v-expansion-panel-header><h2>Underlying conditions</h2></v-expansion-panel-header>
        <v-expansion-panel-content>
          <v-row >
            <v-col cols="12" sm="12">
              <v-switch  readonly v-model="patient.anamneses.asthma" class="ma-2" label="Asthma"></v-switch>
            </v-col>
          </v-row>
          <v-row >
            <v-col cols="12" sm="12">
              <v-switch  readonly v-model="patient.anamneses.chronicLung" class="ma-2" label="Chronic lung disease"></v-switch>
            </v-col>
          </v-row>
          <v-row >
            <v-col cols="12" sm="12">
              <v-switch  readonly v-model="patient.anamneses.diabetes" class="ma-2" label="Diabetes"></v-switch>
            </v-col>
          </v-row>
          <v-row >
            <v-col cols="12" sm="12">
              <v-switch  readonly v-model="patient.anamneses.hemoglobinDisorder" class="ma-2" label="Hemoglobin disorder"></v-switch>
            </v-col>
          </v-row>
          <v-row >
            <v-col cols="12" sm="12">
              <v-switch  readonly v-model="patient.anamneses.immunocompromised" class="ma-2" label="Immunocompromized"></v-switch>
            </v-col>
          </v-row>
          <v-row >
            <v-col cols="12" sm="12">
              <v-switch  readonly v-model="patient.anamneses.liverDisease" class="ma-2" label="Liver disease"></v-switch>
            </v-col>
          </v-row>
          <v-row >
            <v-col cols="12" sm="12">
              <v-switch  readonly v-model="patient.anamneses.heartConditions" class="ma-2" label="Heart conditions"></v-switch>
            </v-col>
          </v-row>

        </v-expansion-panel-content>
      </v-expansion-panel>
      
      <v-expansion-panel>
        <v-expansion-panel-header><h2>Severe symptoms</h2></v-expansion-panel-header>
        <v-expansion-panel-content>
          <v-row >
            <v-col cols="12" sm="12">
              <v-switch  readonly v-model="patient.anamneses.difficultyBreathing" class="ma-2" label="Difficulty breathing"></v-switch>
            </v-col>
          </v-row>
          
          <v-row >
            <v-col cols="12" sm="12">
              <v-switch  readonly v-model="patient.anamneses.chestPains" class="ma-2" label="Chest pains"></v-switch>
            </v-col>
          </v-row>
          
          <v-row >
            <v-col cols="12" sm="12">
              <v-switch  readonly v-model="patient.anamneses.lossOfSpeachOrMovement" class="ma-2" label="Loss of speach or movement"></v-switch>
            </v-col>
          </v-row>
        </v-expansion-panel-content>
      </v-expansion-panel>
      
      <v-expansion-panel>
        <v-expansion-panel-header><h2>Common symptoms</h2></v-expansion-panel-header>
        <v-expansion-panel-content>
          <v-row >
            <v-col cols="12" sm="12">
              <v-switch  readonly v-model="patient.anamneses.fever" class="ma-2" label="Fever"></v-switch>
            </v-col>
          </v-row>
          
          <v-row >
            <v-col cols="12" sm="12">
              <v-switch  readonly v-model="patient.anamneses.dryCough" class="ma-2" label="Dry cough"></v-switch>
            </v-col>
          </v-row>
          
          <v-row >
            <v-col cols="12" sm="12">
              <v-switch  readonly v-model="patient.anamneses.tiredness" class="ma-2" label="Tiredness"></v-switch>
            </v-col>
          </v-row>
        </v-expansion-panel-content>
      </v-expansion-panel>

      <v-expansion-panel>
        <v-expansion-panel-header><h2>Uncommon symptoms</h2></v-expansion-panel-header>
        <v-expansion-panel-content>
          <v-row >
            <v-col cols="12" sm="12">
              <v-switch  readonly v-model="patient.anamneses.aches" class="ma-2" label="Aches or pains"></v-switch>
            </v-col>
          </v-row>

          <v-row >
            <v-col cols="12" sm="12">
              <v-switch  readonly v-model="patient.anamneses.soreThroat" class="ma-2" label="Sore throat"></v-switch>
            </v-col>
          </v-row>

          <v-row >
            <v-col cols="12" sm="12">
              <v-switch  readonly v-model="patient.anamneses.diarrhoea" class="ma-2" label="Diarrhoea"></v-switch>
            </v-col>
          </v-row>

          <v-row >
            <v-col cols="12" sm="12">
              <v-switch  readonly v-model="patient.anamneses.conjuctivits" class="ma-2" label="Conjuctivitis (eye infection)"></v-switch>
            </v-col>
          </v-row>

          <v-row >
            <v-col cols="12" sm="12">
              <v-switch  readonly v-model="patient.anamneses.headache" class="ma-2" label="Headache"></v-switch>
            </v-col>
          </v-row>

          <v-row >
            <v-col cols="12" sm="12">
              <v-switch  readonly v-model="patient.anamneses.lossOfTasteOrSmell" class="ma-2" label="Loss of taste or smell"></v-switch>
            </v-col>
          </v-row>

          <v-row >
            <v-col cols="12" sm="12">
              <v-switch  readonly v-model="patient.anamneses.rashDiscolouration" class="ma-2" label="Rashes or discolouration on skin, fingers or toes"></v-switch>
            </v-col>
          </v-row>
        </v-expansion-panel-content>
        
      </v-expansion-panel>

      <v-expansion-panel>
        <v-expansion-panel-header><h2>Tests</h2></v-expansion-panel-header>
        <v-expansion-panel-content>
          <v-row>
            <v-col cols="12" sm="12">
              <v-data-table
                :headers="testHeaders"
                :items="patient.tests"
                :items-per-page="15"
                class="elevation-1">

              </v-data-table>
            </v-col>
          </v-row>
        </v-expansion-panel-content>
      </v-expansion-panel>
    </v-expansion-panels>
    </v-row>

    <v-row>
      <h2>Patient is {{testStatus ? '' : 'not '}} ready to be discharged</h2>
    </v-row>
    
    <v-row justify="center">
      <v-btn color="#FFFFFF" class="mt-10 mr-2" @click="testDialog = true">Add test result</v-btn>
    </v-row>


    </div>

    <v-dialog v-model="testDialog" max-width="500">
      <v-card>
        <v-card-text>
          <br>
          <h1>Test result</h1>
        </v-card-text>
        <v-card-actions>
          <v-row>
            <v-btn text color="#000000" class="mt-10 mr-2" @click="addTestResult(true)">Positive</v-btn>
            <v-btn text color="#000000" class="mt-10 mr-2" @click="addTestResult(false)">Negative</v-btn>
          </v-row>
        </v-card-actions>
      </v-card>
    </v-dialog>
  </v-container>

</template>

<script lang="js">
  import { getSinglePatient, submitTest, patientTestStatus } from '../axiosService.js'

  export default  {
    name: 'single-patient-page',
    props: [],
    mounted () {
        this.loadPatient()
    },
    data () {
      return {
        testStatus: false,

        testDialog: false,
        testHeaders: [
          {
            name: 'Date',
            align: 'start',
            sortable: false,
            value: 'timestamp'
          },
          {
            name: 'Result',
            align: 'end',
            sortable: false,
            value: 'result'
          }
        ],
        patient: {
          name: '',
          lastName: '',
          recoveryLocation: '',
          tests: [],
          anamneses: {
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
          } 
        }
      }
    },
    methods: {
      loadPatient() {
        getSinglePatient(this.$route.params.id).then( data => { 
          this.patient = data.data;
        })
      },

      addTestResult(result) {
        submitTest({result, timestamp: new Date()}, this.$route.params.id).then((result) => {
          this.loadPatient()
          console.log(result);
          this.testStatus = result.data
        })
      },

      getPatientTestStatus() {
        patientTestStatus(this.$route.params.id).then(data => {
          this.testStatus = data.data;
        })
      }
    },
    computed: {

    }
}


</script>

<style scoped lang="scss">
  .single-patient-page {

  }
</style>
