// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import App from './App'
import router from './router'
import axios from 'axios'
require('es6-promise').polyfill();

// Vue.config.productionTip = false
axios.defaults.headers.common['AJAX'] = 'true';

// $http.interceptors.response.use(null, function (error) {
//   console.error(error)
//   if (error.status === 401) {
//     console.error('error 401')
//   }
//   return Promise.reject(error)
// })

/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  components: { App },
  template: '<App/>'
})
