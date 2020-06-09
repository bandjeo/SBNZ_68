<template lang="html">


  <v-container>
    <v-row>
      <h1>Patients</h1>
    </v-row>
    <v-row>
      <v-col cols="12" sm="12">
        <v-data-table
          :headers="headers"
          :items="patients"
          :items-per-page="15"
          class="elevation-1"
          @click:row="rowClicked">

        </v-data-table>
      </v-col>
      
    </v-row>



  </v-container>
  

</template>

<script lang="js">

  import { getAllPatients } from '../axiosService.js'

  export default  {
    name: 'patients-page',
    props: [],
    mounted () {
      this.loadPatients();
    },
    data () {
      return {
        patients: [],

        // data table
        headers: [
          {
            name: 'Name',
            align: 'start',
            sortable: false,
            value: 'name'
          },
          {
            name: 'Last Name',
            align: 'start',
            sortable: false,
            value: 'lastName'
          },
          {
            name: 'Recovery Location',
            align: 'start',
            sortable: false,
            value: 'recoveryLocation'
          },
        ]
      }
    },
    methods: {
      loadPatients() {
        getAllPatients().then(data => this.patients = data.data);
      },

      rowClicked(event) {
        this.$router.push({path: `/patient/${event.id}`})
      },

    },
    computed: {

    }
}


</script>

<style scoped lang="scss">
  .patients-page {

  }
</style>
