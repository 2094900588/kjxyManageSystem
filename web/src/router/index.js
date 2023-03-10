import VueRouter from "vue-router"
import Admin from "../pages/admin"
import Student from "../pages/student"
import Teacher from "../pages/teacher"
import AdminTP from "../pages/adminTP"
import AdminList from "../pages/AdminList"
import Home from "../pages/Home"
import StudentList from "../pages/studentList"
import TeacherList from "../pages/teacherList"

export default new VueRouter({
    routes: [
        {
            path: "/",
            component: Home,

        },

        {
            path: "/admin",
            component: Admin,

        },
        {
            path: "/student",
            component: Student
        },
        {
            path: "/teacher",
            component: Teacher
        },
        {
            path: "/adminTP",
            component: AdminTP,
            // redirect: "/adminlist",
            children: [
                {
                    path: "adminlist",
                    component: AdminList
                },
                {
                    path: "studentList",
                    component: StudentList
                },
                {
                    path: "teacherList",
                    component: TeacherList
                }
            ],
        },
    ]

})


// 导航守卫
// 使用 router.beforeEach 注册一个全局前置守卫，判断用户是否登陆
// router.beforeEach((to, from, next) => {
//     if (to.path === '/admin') {
//         next();
//     } else {
//         let token = localStorage.getItem('Authorization');

//         if (token === 'null' || token === '') {
//             next('/admin');
//         } else {
//             next();
//         }
//     }
// });
// axios.interceptors.request.use(
//     config => {
//         if (localStorage.getItem('Authorization')) {
//             config.headers.Authorization = localStorage.getItem('Authorization');
//         }

//         return config;
//     },
//     error => {
//         return Promise.reject(error);
//     });

// localStorage.removeItem('Authorization');
// this.$router.push('/admin');
