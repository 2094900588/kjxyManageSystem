<template>
  <div class="vm">
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
            <router-link to="/teacher" id="admin" style="color: #ffffff"
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
  name: "HOmeName",
  methods: {
    letin() {
      this.$route.push("/admin");
    },
  },
  beforeCreate() {
    const urlPah = require("../images/kj.jpg");
    document
      .querySelector("body")
      .setAttribute(
        "style",
        'background-repeat:no-repeat;background-size:100%; background-image:url("' +
          urlPah +
          '") '
      );
  },
  // 销毁前清除
  beforeDestroy() {
    document.querySelector("body").removeAttribute("style");
  },
};
</script>

<style src="../css/style.css" scoped>
</style>

