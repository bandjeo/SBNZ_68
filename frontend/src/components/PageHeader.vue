<template lang="html">

  <v-app-bar color="#34d0eb" :extended="true">
    <v-toolbar-title class="mt-11 ml-5 headline">COVID-19 Clinical Desicion Support</v-toolbar-title>
    <v-spacer></v-spacer>
    <div class="mr-9">
      <v-btn color="#FFFFFF" class="mt-10 mr-2" to="/onlineHelp">Online Help</v-btn>
      <v-btn color="#FFFFFF" class="mt-10 mr-2" to="/anamnesis"> New Anamnesis</v-btn>
      <v-btn color="#FFFFFF" class="mt-10 mr-2" to="/patients">Patients</v-btn>
    </div>
  </v-app-bar>

</template>

<script lang="js">

  export default  {
    name: 'page-header',
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

    }
}


</script>

<style scoped lang="scss">
  .page-header {

  }
</style>
