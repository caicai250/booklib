import { createApp } from 'vue'
import App from './App.vue'
import ElementPlus from 'element-plus'
import 'element-plus/dist/index.css'
import router from './router/index'
import zhCn from 'element-plus/es/locale/lang/zh-cn'

// 全局引入css
import '../style/back.css'
const app = createApp(App)
app.use(ElementPlus, {locale: zhCn})

app.use(router)
app.mount('#app')

//请求地址
import urls from '../api/api.js'
app.config.globalProperties.$urls = urls
//请求方法
import request from '../api/request'
app.config.globalProperties.$request = request
