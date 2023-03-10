<template>
  <div>
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
</style>