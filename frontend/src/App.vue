<template>
  <v-app>
    <v-content>
      <PageHeader></PageHeader>
      <div class="container">
        <router-view></router-view>
      </div>
    </v-content>
  </v-app>
</template>

<script>
import PageHeader from './components/PageHeader.vue';

export default {
  name: 'App',

  components: {
    PageHeader,
  },

  data: () => ({
    //
  }),
};
</script>

