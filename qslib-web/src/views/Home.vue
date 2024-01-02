<template>
  <div id="app">
    <el-container>
      <el-header>Header</el-header>

      <el-main><el-row :gutter="12">
        <el-col :span="8">
          <el-card shadow="hover" class="box-card"> <div class="text item">系统架构师</div>
            <template #footer>题目数量：100  完成率80%</template> </el-card>
        </el-col>
        <el-col :span="8">
          <el-card shadow="hover" class="box-card"> <div class="text item">系统架构师</div>
            <template #footer>题目数量：100  完成率80%</template> </el-card>
        </el-col>
        <el-col :span="8">
          <el-card shadow="hover" class="box-card"> <div class="text item">系统架构师</div>
            <template #footer>题目数量：100  完成率80%</template> </el-card>
        </el-col>
      </el-row></el-main>

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
.card-header {
  display: flex;
  justify-content: space-between;
  align-items: center;
}

.text {
  font-size: 14px;
}

.item {
  margin-bottom: 18px;
}

.box-card {
  border-radius: 22px;
}
</style>
