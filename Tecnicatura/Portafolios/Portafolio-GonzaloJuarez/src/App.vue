<script setup>
import NavBar from './components/NavBar.vue'
import DatosPersonales from './components/DatosPersonales.vue';
import EducacionComponente from './components/EducacionComponente.vue';
import ExperienciaComponente from './components/ExperienciaComponente.vue';
import ProyectosComponente from './components/ProyectosComponente.vue';
import HabilidadesComponente from './components/HabilidadesComponente.vue';
import InteresesComponente from './components/InteresesComponente.vue';
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
      <!--Componente Educación-->>
      <EducacionComponente />
    </section>
    <section id="experiencia"><h2>Experiencia</h2>
      <!--Componente Experiencia-->>
      <ExperienciaComponente />
    </section>
    <section id="proyectos"><h2>Proyectos</h2>
    <!--Componente Proyectos-->>
    <ProyectosComponente />
    </section>
    <section id="habilidades"><h2>Habilidades</h2>
    <!--Componente Habilidades-->>
    <HabilidadesComponente />
    </section>
    <section id="intereses"><h2>Intereses</h2>
    <!--Componente Proyectos-->>
    <InteresesComponente />
    </section>
  </main>
  <footer>
    <a href="#top">Inicio</a>
    <p>© 2024 Gonzalo Juarez</p>
  </footer>
</template>

<style scoped>
footer {
    display: flex;
    flex-direction: column;
    align-items: center;
    padding: 2rem;
    font-size: 1.3rem;
}
</style>
