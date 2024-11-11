<script setup>
import linkedin from '/src/assets/linkedin_icon.svg';
import instagram from '/src/assets/instagram_icon.svg';
import github from '/src/assets/github_icon.svg';
import cv from '/src/assets/cv_resume_icon.svg';

const title = 'Florencia Cizmadija';
const descripcion = 'Estudiante - Tecnicatura Universitario en Programación UTN';
const residencia = 'Buenos Aires, Argentina';
const presentacion = 'Bienvenidos/as a mi portafolio personal. Soy estudiante de la Tecnicatura en Programación. Actualmente, me desempeño en el sector de QA (Aseguramiento de la Calidad), donde he adquirido experiencia en pruebas de software, identificación de errores y mejoras en la calidad de aplicaciones, esto me permitio fortalecer mis habilidades analíticas y de resolución de problemas. ¡Gracias por visitar mi portafolio!';
const redesSociales = [
  { id: 1, name: 'linkedin', src: linkedin, url: 'https://www.linkedin.com/in/florencia-cizmadija/' },
  { id: 2, name: 'Instagram', src: instagram, url: 'https://www.instagram.com/florcizm/' },
  { id: 3, name: 'github', src: github, url: '' },
  { id: 4, name: 'curriculum', src: cv, url: '' },
];
const telefono = '+54 9 1127898411';
</script>

<template>
  <section class="datos-personales">
    <div class="card">
      <h1>{{ title }}</h1>
      <h2>{{ descripcion }}</h2>
      <p>{{ presentacion }}</p>
      <ul class="container-lista">
        <li v-for="red in redesSociales" :key="red.id">
          <a :href="red.url"><img class="icon-redsocial" :src="red.src" width="35rem" :alt="red.name"></a>
        </li>
      </ul>
      <h3>☎ Mi Teléfono personal: {{ telefono }}</h3>
      <h4>{{ residencia }}</h4>
    </div>
  </section>
</template>

<style scoped>
h1 {
  font-size: 2.5rem;
  color: #6a4c9c; /* Violeta pastel claro */
}

h2 {
  font-size: 1.5rem;
  color: #7b6cbf; /* Violeta suave */
}

p {
  font-size: 1.2rem;
  font-weight: 600;
  margin-bottom: 1rem;
  color: #6a4c9c; /* Violeta pastel claro */
}

.card {
  background-color: #e3d9f5; /* Violeta pastel clarito */
  border-radius: 10px;
  padding: 20px;
  margin: 10px;
  text-align: center;
  box-shadow: 0 4px 8px rgba(100, 75, 150, 0.1); /* Sombra suave */
}

.container-lista {
  display: flex;
  justify-content: center;
  list-style: none;
  padding: 0;
  margin: 0;
  text-align: center;
}

.icon-redsocial {
  align-items: center;
  background-color: #f0e7ff; /* Fondo violeta pastel muy claro */
  border-radius: 50%;
  padding: 10px;
  margin: 5px;
  box-shadow: 0 0 5px rgba(95, 124, 205, 0.5);
}

.icon-redsocial:hover {
  background-color: #7b6cbf; /* Violeta suave al pasar el cursor */
  box-shadow: 0 0 8px rgba(251, 249, 249, 0.6);
}

h3 {
  font-size: 1.2rem;
  font-weight: 600;
  color: #6a4c9c; /* Violeta pastel claro */
}

h4 {
  color: #7b6cbf; /* Violeta suave */
}
</style>
