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
    <!--Barra de navegación-->
    <NavBar />
    <!--Datos Personales-->
    <DatosPersonales />
  </header>
  <main>
    <section id="educacion2"><h2>Educación y cursos</h2>
      <!--Componente Educación-->
      <EducacionComponente />
    </section>
    <section id="experiencia"><h2>Experiencia</h2>
      <!--Componente Experiencia-->
      <ExperienciaComponente />
    </section>
    <section id="proyectos"><h2>Proyectos</h2>
    <!--Componente Proyectos-->
    <ProyectosComponente />
    </section>
    <section id="habilidades"><h2>Habilidades</h2>
    <!--Componente Habilidades-->
    <HabilidadesComponente />
    </section>
    <section id="intereses"><h2>Intereses</h2>
    <!--Componente Proyectos-->
    <InteresesComponente />
    </section>
  </main>
  <footer>
    <a href="#top" class="footer-link">Inicio</a>
    <p>© 2024 Gonzalo Juarez</p> 
</footer>
</template>

<style scoped>
h2 {
    font-size: 3rem; /* Tamaño de fuente */
    color: #ffdd57;  /* Color dorado */
    text-align: center;
    margin-top: -4rem;
    margin-bottom: 1rem;
    font-weight: bold; /* Grosor del texto */
    text-transform: uppercase; /* Mayúsculas */
    font-family: cursive;
}
footer {
    display: flex;
    flex-direction: column;
    align-items: center;
    padding: 2rem;
    font-size: 1.3rem;
    background-color: rgba(42, 30, 53, 0.9); /* Fondo oscuro con transparencia */
    border-top: 1px solid rgba(255, 255, 255, 0.2); /* Borde superior sutil */
    color: #ffffff;
    gap: 0.5rem;
    border-radius: 12px;
    /*margin: 30px;*/
}

.footer-link {
    color: #f7c25d; /* Color amarillo para el enlace */
    text-decoration: none;
    font-weight: bold;
    transition: color 0.3s ease;
}

.footer-link:hover {
    color: #ffffff; /* Cambia a blanco en hover */
}

footer p {
    margin: 0;
    font-size: 1rem;
    color: #d3d3d3; /* Texto en gris claro */
}
</style>