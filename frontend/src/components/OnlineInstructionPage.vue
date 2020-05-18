<template lang="html">

  <v-container>
    <div v-if="instruction == 'StayHome'">
      <v-row justify="center"> 
        <v-card max-width="500">
          <v-card-text>
            <h2>Stay at home</h2>
            <br>
            <p>Your health is at low risk.</p>
            <p>Avoid contact with people until your symptoms dissapear.</p>
            <p>Wash your hand frequently and avoid touching your face.</p>
            <p>Wear a mask in public.</p>
          </v-card-text>
        </v-card>
      </v-row>
    </div>
    
    <div v-else-if="instruction ==  'VisitHealthCenter'">
      <v-row justify="center"> 
        <v-card max-width="500">
          <v-card-text>
            <h2>Go to the nearest health center</h2>
            <br>
            <p>Your health is not at high risk.</p>
            <p>Seek professional medical help at the nearest health center.</p>
            <p>Avoid contact with people.</p>
            <p>Wash your hand frequently and avoid touching your face.</p>
            <p>Wear a mask in public.</p>
          </v-card-text>
        </v-card>
      </v-row>

    </div>
    
    <div v-else-if="instruction == 'VisitHospital'">
      <v-row justify="center"> 
        <v-card max-width="500">
          <v-card-text>
            <h2>Go to the nearset hospital</h2>
            <br>
            <p>You are at high risk of infection.</p>
            <p>Your health is at risk.</p>
            <p>Avoid contact with people.</p>
            <p>Wash your hand frequently and avoid touching your face.</p>
            <p>Wear a mask in public.</p>
          </v-card-text>
        </v-card>
      </v-row>

    </div>
    
    <div v-else-if="instruction == 'GoToEmergencyHospital'">
      <v-row justify="center"> 
        <v-card max-width="500">
          <v-card-text>
            <h2>Stay at home</h2>
            <br>
            <p>Your health is at SEVERE risk.</p>
            <p>Immediately go to the nearest emergency hospital.</p>
            <p>Call the emergency line if neccessary.</p>
          </v-card-text>
        </v-card>
      </v-row>

    </div>
  </v-container>

</template>

<script lang="js">

  export default  {
    name: 'online-instruction-page',
    props: [],
    mounted () {

    },
    data () {
      return {

      }
    },
    methods: {

    },
    computed: {
      instruction() {
        return this.$route.params.instruction;
      }

    }
}


</script>

<style scoped lang="scss">
  .online-instruction-page {

  }
</style>
