<template>
    <nav class="navbar">
    <div class="navbar-menu">
      <ul>
        <a v-for="nav in navegacion" :key="nav.nombre" :href="nav.enlace" class="nav-item">{{ nav.nombre }}</a>
      </ul>
    </div>
  </nav>
</template>

<script setup>
import { ref } from 'vue';
const navegacion = ref([
    {id: 1, nombre: 'Educacion', enlace: '#educacion'},
    {id: 2, nombre: 'Experiencia', enlace: '#experiencia'},
    {id: 3, nombre: 'Proyectos', enlace: '#proyectos'},
    {id: 4, nombre: 'Habilidades', enlace: '#habilidades'},
    {id: 5, nombre: 'Intereses', enlace: '#intereses'}
])
</script>

<style scoped>
/* Estilo general de la navbar */
.navbar {
  background-color: rgba(42, 30, 53, 0.9);
  padding: 1rem;
  font-family: Arial, sans-serif;
  display: flex;
  justify-content: center;
  align-items: center;
  border-radius: 12px;
}

/* Contenedor del menú */
.navbar-menu ul {
  display: flex;
  list-style-type: none;
  padding: 0;
  margin: 0;
}

/* Estilo de los enlaces */
.nav-item {
  color: #ffdd57;
  text-decoration: none;
  padding: 0.5rem 1rem;
  transition: background-color 0.4s ease, color 0.4s ease;
  font-size: 1rem;
  border-radius: 30px;
}

/* Hover y active para los enlaces */
.nav-item:hover {
  background-color: rgb(76, 72, 77);
  color: #ffdd57; /* Color de resaltado */
}

.nav-item:active {
  background-color: #444;
  color: #ffdd57; /* Otro color de resaltado para active */
}

/* Diseño responsivo para pantallas más pequeñas */
@media (max-width: 768px) {
  .navbar {
    padding: 0.5rem;
  }
  .navbar-menu ul {
    flex-direction: column;
  }
  .nav-item {
    padding: 0.75rem 1rem;
    text-align: center;
  }
}
</style>