import Vue from "vue"
import App from "./App.vue"
import VueRouter from 'vue-router'
//引入路由器
import router from './router'
import ElementUI from "element-ui";
// 引入ElementUI全部样式
import 'element-ui/lib/theme-chalk/index.css';

import { Menu, Submenu, MenuItem } from 'element-ui'
import jquery from "jquery";

Vue.prototype.$ = jquery;

Vue.use(Menu)
Vue.use(Submenu)
Vue.use(MenuItem)


Vue.config.productionTip = false
Vue.use(ElementUI);

Vue.use(VueRouter)

new Vue({
    el: '#app',
    render: h => h(App),
    router: router
})