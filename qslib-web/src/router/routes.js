const routes = [
    {
        path: '/main',
        name: 'main',
        title: '首页',
        component: () => import('../views/Home.vue'), //.vue不能省略
    },
    {
        path: '/login',
        name: 'login',
        title: '登录',
        component: () => import('../views/Login.vue'),
    }
]
export default routes
