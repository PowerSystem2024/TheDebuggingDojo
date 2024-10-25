<script setup>
import NavBar from './components/navbar.vue'
import DatosPersonales from './components/DatosPersonales.vue';
import Educacion from './components/Educacion.vue';
</script>

<template>
  <header>
    <!--Barra de navegación-->>
    <NavBar />
    <!--Datos Personales-->>
    <DatosPersonales />
  </header>
  <main>
    <section id="educacion"><h2>Educación y cursos</h2>
      <Educacion />
    </section>
    <section id="experiencia"><h2>Experiencia</h2></section>
    <section id="proyectos"><h2>Proyectos</h2></section>
    <section id="habilidades"><h2>Habilidades</h2></section>
    <section id="intereses"><h2>Intereses</h2></section>
  </main>
</template>

<style scoped>

</style>
