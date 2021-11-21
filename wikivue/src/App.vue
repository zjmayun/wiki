<template>
  <div id="nav">
    <a-layout>
      <the-header></the-header>
      <router-view/>
      <the-footer></the-footer>
    </a-layout>
  </div>
</template>

<script lang="ts">
import { defineComponent } from 'vue';
import TheHeader from '@/components/the-header.vue';
import TheFooter from "@/components/the-footer.vue";

export default defineComponent({
  name: 'app',
  components: {
    TheFooter,
    TheHeader
  }
});
</script>

<style lang="scss">
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}

#nav {
  padding: 30px;

  a {
    font-weight: bold;
    color: #2c3e50;

    &.router-link-exact-active {
      color: #42b983;
    }
  }
}
</style>
