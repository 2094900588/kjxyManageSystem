<template>
  <div class="row">
    <!-- <router-link class="list-group-item" active-class="active" to="/admin"
        >管理端</router-link
      >
      <router-link class="list-group-item" active-class="active" to="/student"
        >学生端</router-link
      >
      <router-link class="list-group-item" active-class="active" to="/teachr"
        >教师端</router-link
      > -->

    <!-- 指定组件的呈现位置 -->
    <!-- <router-link to="/admin" id="nonee">管理员登录</router-link> -->

    <router-view> </router-view>
  </div>
</template>

<script>
export default {
  name: "App",
};
</script>

<style>
.list-group {
  margin: 0 auto;
}
.list-group-item {
  width: 100px;
  margin-top: 200px;
  margin-left: 200px;
  background-color: skyblue;
}
.nav {
  width: 400px;
  position: absolute;
}
.row {
  height: 1600px;
  position: relative;
}
.login {
  width: 600px;
  height: 700px;
  transform: translate(900px);
  margin-top: 100px;
}
</style>