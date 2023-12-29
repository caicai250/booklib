<template>
  <div id="app">
    <el-container>
      <el-header>Header</el-header>
      <el-main>Main</el-main>
      <el-footer>Footer</el-footer>
    </el-container>
  </div>
</template>


<script>
import {defineComponent, reactive} from 'vue';
import {ElMessage, ElMessageBox, ElNotification} from 'element-plus'

export default defineComponent({
  setup() {  // setup钩子函数
    return {}
  }
})
</script>

<style>

</style>
