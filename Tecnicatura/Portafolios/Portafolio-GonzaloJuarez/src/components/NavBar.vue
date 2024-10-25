<template>
    <nav class="navbar">
    <div class="navbar-menu">
      <ul>
        <a v-for="nav in navegacion" :key="nav.nombre" href="nav.enlace" class="nav-item">{{ nav.nombre }}</a>
      </ul>
    </div>
  </nav>
</template>

<script setup>
import { ref } from 'vue';
const navegacion = ref([
    {id: 1, nombre: 'Educacion', enlase: '#educacion'},
    {id: 2, nombre: 'Experiencia', enlase: '#experiencia'},
    {id: 3, nombre: 'Proyectos', enlase: '#proyectos'},
    {id: 4, nombre: 'Habilidades', enlase: '#habilidades'},
    {id: 5, nombre: 'Intereses', enlase: '#intereses'}

])
</script>

<style scoped>
.navbar {
  background-color: var(--vt-c-indigo);
  color: #fff;
  padding: 0.5rem, 1rem;
  align-items: center;
}
.navbar-menu {
  display: flex;
  justify-content: flex-end;
}
.navbar-item {
  color: #fff;
  text-decoration: none;
  margin-right: 1rem;
}
.nav-list {
  list-style: none;
}
a {
  border: 1px solid;
  border-color: hsla(160, 100%, 37% 0.2);
  border-radius: 5px;
  text-decoration: none;
  transition: 0.4s;
  padding: 5px;
}
a:hover {
background-color: hsla(160, 100%, 37%, 0.2);
}

@media (max-width: 768px) {
  .navbar-menu {
    display: flex;
    justify-content: flex-end;
    width: 100%;
  }
}
</style>