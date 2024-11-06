<script setup>
</script>

<template>
    <div class="main">
        <div class="circle">
        </div>
    </div>
</template>

<style scoped>
*{
  margin:0;
  padding:0;
  box-sizing:border-box;
}
.main{
  height:100vh;
  width:100vw;
  background-color:black;
  display:grid;
  place-items:center;
}
.circle{
  width:200px;
  height:200px;
  border-radius:50%;
  background: linear-gradient(to right, #f7db15, #E67E22, #FF6F61, #E67E22, #f7db15);
  position:relative;
  animation: rotate 0.8s linear infinite;
  display:grid;
  place-items:center;
}
h2{
  z-index:2;
  font-size:18px;
  color:white;
}
.circle:before{
  content:"";
  height:180px;
  width:180px;
  border-radius:50%;
  background:black;
  position:absolute;
  top:calc(0% + 10px);
  left:calc(0% + 10px);

}
@keyframes rotate {
  0%{
    transform:rotate(0deg);
  }
  50%{
    transform:rotate(180deg);
  }
  100%{
    transform:rotate(360deg);
  }
}
</style>
