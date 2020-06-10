<template lang="html">

  <v-container>
    <v-row rows="20">
      <v-col cols="12" sm="12" md="12">
          <v-textarea
          name="rules.drl"
          label="rules.drl"
          v-model="drlText"
          rows="20"
        ></v-textarea>
      </v-col>
    </v-row>
    <v-row justify="center">
      <v-btn color="#FFFFFF" class="mt-10 mr-2" @click="submitDrl()">Submit</v-btn>
    </v-row>
  </v-container>

</template>

<script lang="js">
  import { getRules, postRules } from '../axiosService.js'

  export default  {
    name: 'rules-page',
    props: [],
    mounted () {
      this.loadDrl();
    },
    data () {
      return {
          drlText: ""
      }
    },
    methods: {
      loadDrl() {
        getRules().then(data => {
          this.drlText = data.data
          console.log(data);
        });
      },

      submitDrl() {
        postRules(this.drlText).then(() => {
          getRules();
        })
      }

    },
    computed: {

    }
}


</script>

<style scoped lang="scss">
  .rules-page {

  }
</style>
