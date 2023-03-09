<template>
  <div class="container">
    <div class="filter-container">
      <el-input
        placeholder="用户名"
        v-model="pagination.username"
        style="width: 200px"
        class="filter-item"
      ></el-input>
      <el-input
        placeholder="密码"
        v-model="pagination.password"
        style="width: 200px"
        class="filter-item"
      ></el-input>
      <el-button @click="getAll()" class="dalfBut">查询</el-button>
      <el-button type="primary" class="butT" @click="handleCreate()"
        >新建</el-button
      >
    </div>

    <div class="table">
      <el-table :data="dataList" stripe>
        <el-table-column label="序号" prop="id" />
        <el-table-column label="部门" prop="department_id" />
        <el-table-column label="教师用户名" prop="username" />
        <el-table-column label="教师名" prop="name" />
        <el-table-column label="密码" prop="password" />
        <el-table-column label="操作" align="center">
          <template slot-scope="scope">
            <el-button
              type="primary"
              size="mini"
              @click="handleUpdate(scope.row)"
              >编辑</el-button
            >
            <el-button
              type="danger"
              size="mini"
              @click="handleDelete(scope.row)"
              >删除</el-button
            >
          </template>
        </el-table-column>
      </el-table>
    </div>
    <div class="add-form">
      <el-dialog title="新增用户" :visible.sync="dialogFormVisible">
        <el-form
          ref="dataAddForm"
          :model="formData"
          :rules="rules"
          label-width="100px"
        >
          <el-row>
            <!-- <el-col :span="12">
              <el-form-item label="序号" prop="id">
                <el-input v-model="formData.id"></el-input>
              </el-form-item>
            </el-col> -->
            <el-col :span="12">
              <el-form-item label="部门号" prop="department_id">
                <el-input v-model="formData.department_id"></el-input>
              </el-form-item>
            </el-col>
            <el-col :span="12">
              <el-form-item label="用户名" prop="username">
                <el-input v-model="formData.username"></el-input>
              </el-form-item>
            </el-col>

            <el-col :span="12">
              <el-form-item label="用户名" prop="name">
                <el-input v-model="formData.name"></el-input>
              </el-form-item>
            </el-col>

            <el-col :span="12">
              <el-form-item label="密码" prop="password">
                <el-input v-model="formData.password"></el-input>
              </el-form-item>
            </el-col>
          </el-row>
        </el-form>
        <div slot="footer" class="dialog-footer">
          <el-button @click="cancel()">取消</el-button>
          <el-button type="primary" @click="handleAdd()">确定</el-button>
        </div>
      </el-dialog>
    </div>
    <div class="add-form">
      <el-dialog title="编辑检查项" :visible.sync="dialogFormVisible4Edit">
        <el-form
          ref="dataEditForm"
          :model="formData"
          :rules="rules"
          label-position="right"
          label-width="100px"
        >
          <el-row>
            <el-col :span="12">
              <el-form-item label="部门号" prop="department_id">
                <el-input v-model="formData.username" />
              </el-form-item>
            </el-col>

            <el-col :span="12">
              <el-form-item label="用户名" prop="username">
                <el-input v-model="formData.username" />
              </el-form-item>
            </el-col>

            <el-col :span="12">
              <el-form-item label="用户名" prop="name">
                <el-input v-model="formData.name" />
              </el-form-item>
            </el-col>

            <el-col :span="12">
              <el-form-item label="密码" prop="password">
                <el-input v-model="formData.password" />
              </el-form-item>
            </el-col>
          </el-row>
        </el-form>

        <div slot="footer" class="dialog-footer">
          <el-button @click="cancel()">取消</el-button>
          <el-button type="primary" @click="handleEdit()">确定</el-button>
        </div>
      </el-dialog>
    </div>
  </div>
</template>
<script>
import api from "@/api";
export default {
  name: "AdminList",
  data() {
    return {
      dataList: [],
      formData: {},
      dialogFormVisible: false, //添加表单是否可见
      dialogFormVisible4Edit: false, //编辑表单是否可见
      pagination: {
        //分页相关模型数据
        currentPage: 2, //当前页码
        pageSize: 5, //每页显示的记录数
        total: 0, //总记录数
        name: "",
        description: "",
      },
    };
  },
  created() {
    //调用查询全部数据的操作
    this.getAll();
  },
  methods: {
    created() {
      //调用查询全部数据的操作
      this.getAll();
    },

    getAll() {
      //发送异步请求
      //   axios.get("http://localhost/admin/list").then((res) => {
      //     // console.log(res.data);
      //     this.dataList = res.data.data;
      //   });
      api.getAdminList().then((res) => {
        let resp = res.data;
        this.dataList = resp.data;
      });
    },

    //切换页码
    handleCurrentChange(currentPage) {
      //修改页码值为当前选中的页码值
      this.pagination.currentPage = currentPage;
      //执行查询
      this.getAll();
    },

    //弹出添加窗口
    handleCreate() {
      this.dialogFormVisible = true;
      this.resetForm();
    },

    //重置表单
    resetForm() {
      this.formData = {};
    },
    //添加
    handleAdd() {
      /*axios
        .post("http://localhost/admin", this.formData)
        .then((res) => {
          //判断当前操作是否成功
          if (res.data.flag) {
            //1.关闭弹层
            this.dialogFormVisible = false;
            this.$message.success(res.data.msg);
          } else {
            this.$message.error(res.data.msg);
          }
        })
        .finally(() => {
          //2.重新加载数据
          this.getAll();
        });*/
      let data = this.formData;
      api.addAdmin(data).then((res) => {
        //判断当前操作是否成功
        if (res.data.flag) {
          //1.关闭弹层
          this.dialogFormVisible = false;
          this.$message.success(res.data.msg);
          this.getAll();
        } else {
          this.$message.error(res.data.msg);
        }
      });
    },

    //取消
    cancel() {
      this.dialogFormVisible = false;
      this.dialogFormVisible4Edit = false;
      this.$message.info("当前操作取消");
    },
    // 删除
    handleDelete(row) {
      // console.log(row);
      this.$confirm("此操作永久删除当前信息，是否继续？", "提示", {
        type: "info",
      })
        .then(() => {
          api
            .deleteAdmin(row.id)
            .then((res) => {
              if (res.data.flag) {
                this.$message.success("删除成功");
              } else {
                this.$message.error("数据同步失败，自动刷新");
              }
            })
            .finally(() => {
              //2.重新加载数据
              this.getAll();
            });
        })
        .catch(() => {
          this.$message.info("取消操作");
        });
    },

    //弹出编辑窗口
    handleUpdate(row) {
      api
        .getAdminInfo(row.id)
        .then((res) => {
          if (res.data.flag && res.data.data != null) {
            this.dialogFormVisible4Edit = true;
            this.formData = res.data.data;
          } else {
            this.$message.error("数据同步失败，自动刷新");
          }
        })
        .finally(() => {
          //2.重新加载数据
          this.getAll();
        });
    },

    //修改
    handleEdit() {
      let data = this.formData;
      api
        .updateAdmin(data)
        .then((res) => {
          //判断当前操作是否成功
          if (res.data.flag) {
            //1.关闭弹层
            this.dialogFormVisible4Edit = false;
            this.$message.success("修改成功");
          } else {
            this.$message.error("修改失败");
          }
        })
        .finally(() => {
          //2.重新加载数据
          this.getAll();
        });
    },
  },
};
</script>

<style>
.container {
  height: 1200px;
}
</style>
