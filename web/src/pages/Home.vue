<template>
  <div>
    <div class="snow-container">
      <div class="snow foreground"></div>
      <div class="snow foreground layered"></div>
      <div class="snow middleground"></div>
      <div class="snow middleground layered"></div>
      <div class="snow background"></div>
      <div class="snow background layered"></div>
    </div>

    <div class="top-buttons-agileinfo"></div>
    <div class="main-agileits">
      <!--form-stars-here-->
      <div class="form-w3-agile">
        <form action="#" method="post">
          <div class="submit-w3l">
            <router-link to="/admin" id="admin" style="color: #ffffff"
              >管理员登录</router-link
            >
          </div>
        </form>
      </div>

      <div class="form-w3-agile">
        <form action="#" method="post">
          <div class="submit-w3l">
            <router-link to="/student" id="admin" style="color: #ffffff"
              >学生登录</router-link
            >
          </div>
        </form>
      </div>

      <div class="form-w3-agile">
        <form action="#" method="post">
          <div class="submit-w3l">
            <router-link to="/admin" id="admin" style="color: #ffffff"
              >教师登录</router-link
            >
          </div>
        </form>
      </div>
    </div>
  </div>
</template>

<script >
import $ from "jquery";
export default {
  methods: {
    letin() {
      this.$route.push("/admin");
    },
  },
};
</script>

<style src="../css/style.css" >
</style>

<style src="../css/snow.css" >
.tp {
  display: block;
}
</style>