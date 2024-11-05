<script setup>
import Navbar from './components/Navbar.vue';
import DatosPersonales from './components/DatosPersonales.vue';
import Educacion from './components/Educacion.vue';
import Experiencia from './components/Experiencia.vue'
import ProyectosComponente from './components/ProyectosComponente.vue'
import Habilidades from './components/Habilidades.vue'

</script>

<template>
  <header>
    <!-- Barra de Navegacion -->
    <Navbar />

    <!-- Datos Personales -->
    <DatosPersonales />
  </header>

  <main class="content">
    <section id="educacion">
      <h2>Educación - Cursos</h2>
      <Educacion />
    </section>
    <section id="experiencia">
      <h2>Experiencia</h2>
      <Experiencia />
    </section>
    <section id="proyectos">
      <h2>Proyectos</h2>
      <ProyectosComponente />
    </section>
    <section id="habilidades">
      <h2>Habilidades</h2>
      <Habilidades />
    </section>
  </main>

  <footer>
    <p>Pablo Correa - 2024 - Portafolio Web</p>
    <a href="#top" class="inicio">Inicio</a>
  </footer>
</template>

<style scoped>
html{
    scroll-behavior: smooth;
}

.content {
  margin-top: 60px; 
  padding: 20px;
}

footer {
  display: flex;
  flex-direction: row;
  align-items: center;
  justify-content: center;
  padding: 2rem;
  font-size: 1.3rem;
}
.inicio{
  padding-left: 100px;
}

h2{
  font-family: 'poppins', 'Times New Roman', Times, serif;
  font-size: 2rem;
  display: flex;
  justify-content: center;
  margin-top: 4rem;
  margin-bottom: 0.5rem;
  
}
</style>