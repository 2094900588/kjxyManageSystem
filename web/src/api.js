import Vue from 'vue'
// import store from '@/store'
import axios from 'axios'
// import store from "../store"

Vue.prototype.$http = axios
// axios.defaults.baseURL = '/api'
axios.defaults.baseURL = 'http://localhost/api/'

export default {
    // 管理员
    getAdminList(params, token) {
        return ajax('admin/list', 'get', {
            params
        }, token)
    },
    addAdmin(data) {
        return ajax("admin", "post", {
            data
        })
    },

    updateAdmin(data) {
        return ajax("admin", "put", {
            data
        })
    },
    getAdminInfo(params) {
        return ajax('admin/' + params, 'get', {
        })
    },
    deleteAdmin(params) {
        return ajax("admin/" + params, "delete", {

        })
    },

    // 学生
    getStudentList(params) {
        return ajax('student/list', 'get', {
            params
        })
    },
    addStudent(data) {
        return ajax("student", "post", {
            data
        })
    },

    updateStudent(data) {
        return ajax("student", "put", {
            data
        })
    },
    getStudentInfo(params) {
        return ajax('student/' + params, 'get', {
        })
    },
    deleteStudent(params) {
        return ajax("student/" + params, "delete", {

        })
    },
    // 教师
    getTeacherList(params) {
        return ajax('teacher/list', 'get', {
            params
        })
    },
    addTeacher(data) {
        return ajax("teacher", "post", {
            data
        })
    },

    updateTeacher(data) {
        return ajax("teacher", "put", {
            data
        })
    },
    getTeacherInfo(params) {
        return ajax('teacher/' + params, 'get', {
        })
    },
    deleteTeacher(params) {
        return ajax("teacher/" + params, "delete", {

        })
    },
}

/**
 * @param url
 * @param method get|post|put|delete...
 * @param params like queryString. if a url is index?a=1&b=2, params = {a: '1', b: '2'}
 * @param data post data, use for method put|post
 * @returns {Promise}
 */
function ajax(url, method, options, token) {
    if (options !== undefined) {
        var { params = {}, data = {} } = options
    } else {
        params = data = {}
    }
    var headers = {
        token: "eyJhbGciOiJIUzUxMiIsInppcCI6IkdaSVAifQ.H4sIAAAAAAAAAKtWKi5NUrJSiox099ANDXYNUtJRSq0oULIyNDO3MDUwNjS30FEqLU4t8kwBikGYIZUFqUBOLQD9U5f5PAAAAA.B2aniGJ8OiSVXPF7nIQNSYNhdiYzhtjQ7SSA8TDWonOVWObmneENKKxDsecikUIKW6G0WzynMy8JwcHBus48Vg"
    }
    // console.log(options)
    // console.log(params)
    // console.log(data)
    return new Promise((resolve, reject) => {
        axios({
            url,
            method,
            params,
            headers,
            data
        }).then(res => {
            resolve(res)
            // API正常返回(status=20x), 是否错误通过有无error判断
            /*if (res.data.error !== null) {
            //   Vue.prototype.$error(res.data.data)
              reject(res)
              // 若后端返回为登录，则为session失效，应退出当前登录用户
            //   if (res.data.data.startsWith('Please login')) {
            //     store.dispatch('changeModalStatus', {'mode': 'login', 'visible': true})
            //   }
            } else {
              resolve(res)
              // if (method !== 'get') {
              //   Vue.prototype.$success('Succeeded')
              // }
            }*/
        }, res => {
            // API请求异常，一般为Server error 或 network error
            if (res.code === "ERR_NETWORK") {
                this.$router.push("/admin")
            }

            console.log("用户未登录");
            reject(res)
            // Vue.prototype.$error(res.data.data)
        })
    })
}