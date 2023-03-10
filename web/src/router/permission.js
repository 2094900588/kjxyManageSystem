import router from "./index";

router.beforeEach((to, from, next) => {
    if (to.meta.isLogin) {
        let token = false;
        if (token) {
            next();
        } else {
            next({
                name: "Home"
            })
        }
    } else {
        next();
    }
})