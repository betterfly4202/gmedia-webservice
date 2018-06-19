<template>
  <div id="page-wrapper">
    <router-view></router-view>
    <!-- <footer class="footer text-center"> 2017 &copy; Ample Admin brought to you by themedesigner.in </footer> -->
  </div>
</template>

<script>
export default {
  name: 'ContentWrap',
  created () {
  }
}
</script>

<style scoped>
.page-enter-active, .page-leave-active {
  transition: opacity 0.5s, transform 0.5s;
}
.page-enter, .page-leave-to {
  opacity: 0;
}
</style>