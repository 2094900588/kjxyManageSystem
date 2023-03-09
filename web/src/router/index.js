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
            component: Home
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