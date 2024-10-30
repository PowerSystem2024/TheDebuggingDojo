<script setup>

import linkedin from '../assets/linkedin-logo.png';
import github from '../assets/github-logo.png'
import fotoPerfil from '../assets/foto-perfil.png'

const descripcion = 'Frontend Developer';
const presentacion = 'Hola, Bienvenido a mi portafolio de proyectos. Soy un desarrollador web con experiencia en el desarrollo de aplicaciones web y móviles.';
const redesSociales = [
  { id: 1, name: 'linkedin', src: linkedin, url: 'https://www.linkedin.com/in/correa-pabloc/' },
  { id: 2, name: 'github', src: github, url: 'https://github.com/pablocorrea23', },
];
</script>

<template>
  <section class="datos-personales">
    <div class="card">
      <h2>{{ descripcion }}</h2>
      <p>{{ presentacion }}</p>
      <ul class="container-lista">
        <li v-for="red in redesSociales" :key="red.id">
          <a :href="red.url"><img class="icon-redsocial" :src="red.src" width="45rem" :alt="red.name"></a>
        </li>
      </ul>
    </div>

    <div class="foto-perfil">
      <img v-bind:src="fotoPerfil" alt="foto perfil" class="foto">
    </div>
  </section>
</template>

<style scoped>
.datos-personales{
  margin-top: 10rem;
  display: flex;
  flex-direction: row;
  justify-content: center;
  align-items: center;
}

h2 {
  font-size: 3rem;
}

p {
  font-size: 1.5rem;
  font-weight: 600;
  margin-bottom: 1rem;
}

.card {
  background-color: rgb(0, 0, 0);
  border-radius: 10px;
  padding: 10px;
  margin: 10px;
  text-align: center;
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
  background-color: black;
  border-radius: 50%;
  padding: 5px;
  margin: 10px;
  box-shadow: 0 0 5px rgba(95, 124, 205, 0.934);
}

.icon-redsocial:hover {
  background-color: rgb(28, 41, 52);
  box-shadow: 0 0 5px rgba(251, 249, 249, 0.934);
}

h3 {
  font-size: 1.2rem;
  font-weight: 600;
}


.foto{
  width: 400px;
  border-radius: 50%;
}
</style>