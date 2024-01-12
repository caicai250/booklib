<template>
  <div class="login_bg">
    <div class="login_out">
      <div class="login_content">
        <div class="login_form">
          <el-form :model="form" label-width="60px">
            <el-form-item label="用户名">
              <el-input v-model="form.username"/>
            </el-form-item>
            <el-form-item label="密码">
              <el-input v-model="form.password"/>
            </el-form-item>
            <!--    <el-form-item label="验证码">-->
            <!--      <el-input v-model="form.verifycode" />-->
            <!--    </el-form-item>-->
            <el-form-item style="align-items: center">
              <el-button type="primary" @click="onSubmit">登录</el-button>
              <el-button>注册</el-button>
            </el-form-item>
          </el-form>
        </div>
      </div>
    </div>
  </div>
</template>

<script setup>
import {reactive} from 'vue'
// do not use same name with ref
const form = reactive({
  username: '',
  password: '',
  verifycode: ''
})

const onSubmit = () => {
  console.log('submit!')
}
</script>
