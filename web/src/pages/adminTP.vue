<template>
  <el-container class="home-container">
    <!-- titlebar -->
    <el-header>
      <div>
        <img src="" alt="" />
        <span>学生管理系统</span>
      </div>
      <el-button type="primary" @click="logout">退出登录</el-button>
    </el-header>

    <!-- 正文区域 -->
    <el-container>
      <!-- 侧边栏 -->
      <!-- 侧边栏 -->
      <!-- 侧边栏 -->
      <el-aside width="200px">
        <!-- 侧边栏菜单区域 -->
        <el-menu background-color="#64707d">
          <!-- 一级菜单 -->
          <el-submenu index="1">
            <template slot="title">
              <i class="el-icon-location"></i>
              <span>导航一</span>
            </template>
            <!-- 二级菜单 -->
            <el-menu-item index="1-1">
              <template slot="title">
                <i class="el-icon-location"></i>
                <router-link to="/adminTP/adminlist">管理员列表</router-link>
              </template>
              <template slot="title">
                <i class="el-icon-location"></i>
                <router-link to="/adminTP/studentList">学生列表</router-link>
              </template>
              <template slot="title">
                <i class="el-icon-location"></i>
                <router-link to="/adminTP/teacherList">教师列表</router-link>
              </template>
            </el-menu-item>
          </el-submenu>
        </el-menu>
      </el-aside>

      <!-- 正文区域 -->
      <el-main class="main">
        <!-- 路由占位符 -->
        <router-view></router-view>
      </el-main>
    </el-container>
  </el-container>
</template>

<script>
// import LeftMenu from "@/components/admin/common/LeftMenu.vue";
// import RightContent from "@/components/admin/common/RightContent.vue";
// import Header from "@/components/admin/common/Header.vue";

export default {
  name: "AdminLogin",
  data() {
    return {
      iconsObj: {
        125: "el-icon-s-custom",
        103: "el-icon-s-opportunity",
        101: "el-icon-s-cooperation",
        102: "el-icon-s-order",
        145: "el-icon-data-line",
      },
    };
  },
};
</script>
<style lang="less">
.home-container {
  height: 100%;
}

.el-header {
  background-color: #353d45;
}

.el-aside {
  background-color: #64707d;
}

.el-main {
  background-color: #dadee2;
}

.el-header {
  background-color: #353d45;
  display: flex; // 弹性布局
  justify-content: space-between; // 左右贴边
  padding-left: 0; // 左侧贴边
  align-items: center; // 上下居中，该属性依赖 display: flex
  color: #fff;
  font-size: 20px;
  div {
    display: flex;
    align-items: center;
    span {
      margin-left: 15px;
    }
  }
}
</style>

