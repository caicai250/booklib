const routes = [
    {
        path: '/',
        name: 'login',
        title: '登录',
        component: () => import(/*webpackChunkName:'Login'*/ '@/views/login/Login.vue') //.vue不能省略
    }
]
export default routes
