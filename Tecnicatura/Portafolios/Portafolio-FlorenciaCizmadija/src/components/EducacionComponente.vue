<script setup>
import { ref } from 'vue';

const fechaColor = ref([]);
fechaColor.value = [
  {color: '#D1A7E0'},  // Violeta pastel claro
  {color: '#E6D6F1'},  // Lavanda suave
  {color: '#F2C1D1'},  // Rosa pastel
  {color: '#A2D2FF'},  // Azul claro
  {color: '#F9E6D8'}   // Beige cálido
];

const educacion = ref([
  {fecha: '2024', title: 'Tecnicatura en Programación', descripcion: 'Me encuentro aprendiendo las siguientes herramientas y lenguajes: Java, JavaScript, Python y Bases de datos como MySQL, entre otras.', enlace:'https://www.youtube.com/'},
  {fecha: '2023', title: 'Testing QA Automatizado', descripcion: 'Procesos de calidad en desarrollo de Software, automatizando pruebas con herramientas como Selenium y ResAssured.', enlace:'http:www.direccion.com'},
  {fecha: '2022', title: 'Diseño UX/UI', descripcion: 'Aprendí y apliqué principios de diseño centrado en el usuario, creando interfaces amigables y funcionales.'},
  {fecha: '2021', title: 'Professional Developer', descripcion: 'Me encuentro aprendiendo y trabajando en proyectos reales, adquiriendo habilidades de desarrollo full stack.',}
]);
</script>

<template>
    <ul>
        <li v-for="(item, index) in educacion" :key="index" :style="{ '--fecha-color': fechaColor[index].color}">
        <div class="fecha">{{ item.fecha }}</div>
        <h3 class="title">{{ item.title }}</h3>
        <div class="descripcion">{{ item.descripcion }}</div>
        
        <a class="enlace" :href="item.enlace" target="_blank">Saber más</a>
    </li>
    </ul>
</template>

<style scoped>
@import url("https://fonts.googleapis.com/css2?family=Poppins:wght@300;500;700&display=swap");

*,
*::before,
*::after {
  margin: 0; 
  padding: 0; 
  box-sizing: border-box; 
}

body {
  --color: #5C4B8B;  /* Violeta suave para el texto */
  --bgColor: #F6F4F9;  /* Fondo color lavanda suave */
  background: var(--bgColor);
  color: var(--color);
  min-height: 100vh; 
  display: grid; 
  align-content: center; 
  gap: 2rem; 
  padding: 2rem; 
  font-family: "Poppins", sans-serif;
}

ul {
  margin-top: 2rem;
  --col-gap: 2rem; 
  --row-gap: 2rem; 
  --line-w: 0.25rem; 
  display: grid; 
  grid-template-columns: var(--line-w) 1fr; 
  grid-auto-columns: max-content; 
  column-gap: var(--col-gap); 
  list-style: none; 
  width: min(60rem, 90%); 
  margin-inline: auto; 
}

ul::before {
  content: ""; 
  grid-column: 1; 
  grid-row: 1 / span 20; 
  background: rgb(225, 225, 225); 
  border-radius: calc(var(--line-w) / 2); 
}

ul li:not(:last-child) {
  margin-bottom: var(--row-gap); 
}

ul li {
  grid-column: 2; 
  --inlineP: 1.5rem; 
  margin-inline: var(--inlineP); 
  grid-row: span 2; 
  display: grid; 
  grid-template-rows: min-content min-content min-content; 
}

ul li .fecha {
  --dateH: 3rem; 
  height: var(--dateH); 
  margin-inline: calc(var(--inlineP) * -1); 
  text-align: center; 
  background-color: var(--fecha-color); 
  color: white; 
  font-size: 1.25rem; 
  font-weight: 700; 
  display: grid; 
  place-content: center; 
  position: relative; 
  border-radius: calc(var(--dateH) / 2) 0 0 calc(var(--dateH) / 2);
}

ul li .fecha::before {
  content: ""; 
  width: var(--inlineP); 
  aspect-ratio: 1; 
  background: var(--fecha-color); 
  background-image: linear-gradient(rgba(0, 0, 0, 0.2) 100%, transparent); 
  position: absolute; 
  top: 100%;
  clip-path: polygon(0 0, 100% 0, 0 100%); 
}

ul li .fecha::after {
  content: "";
  position: absolute;
  width: 1rem; 
  aspect-ratio: 1; 
  background: var(--bgColor); 
  border: 0.3rem solid var(--fecha-color); 
  border-radius: 50%; 
  top: 50%; 
  transform: translate(50%, -50%); 
  right: calc(100% + var(--col-gap) + var(--line-w) / 2); 
}

ul li .title {
  color: #222222; /* Gris oscuro para mejorar el contraste */
  background: var(--bgColor);
  padding-inline: 1.5rem;
  padding-block-start: 1.5rem;
  padding-block-end: 1rem;
  font-weight: 700; /* Título en negrita */
  font-size: 1.75rem; /* Aumento de tamaño */
}

ul li .descripcion {
  color: #7F6A94; /* Violeta oscuro para la descripción */
  background: var(--bgColor);
  padding-inline: 1.5rem;
  padding-block-end: 1.5rem;
  font-weight: 300;
}

/* ELIMINACIÓN DE LAS LÍNEAS */
ul li .title::before,
ul li .descripcion::before {
  content: none; /* Eliminamos los pseudo-elementos */
}

ul li .enlace {
  color: #A2D2FF; /* Azul claro para los enlaces */
  text-decoration: none;
}

ul li .enlace:hover {
  color: #F2C1D1; /* Rosa pastel para hover en enlaces */
}

@media (min-width: 40rem) {
  ul {
    grid-template-columns: 1fr var(--line-w) 1fr; 
  }
  ul::before {
    grid-column: 2; 
  }
  ul li:nth-child(odd) {
    grid-column: 1; 
  }
  ul li:nth-child(even) {
    grid-column: 3; 
  }

  ul li:nth-child(2) {
    grid-row: 2/4; 
  }

  ul li:nth-child(odd) .fecha::before {
    clip-path: polygon(0 0, 100% 0, 100% 100%); 
    left: 0; 
  }

  ul li:nth-child(odd) .fecha::after {
    transform: translate(-50%, -50%); 
    left: calc(100% + var(--col-gap) + var(--line-w) / 2); 
  }

  ul li:nth-child(odd) .fecha {
    border-radius: 0 calc(var(--dateH) / 2) calc(var(--dateH) / 2) 0; 
  }
}

.credits {
  margin-top: 1rem; 
  text-align: right; 
}

.credits a {
  color: var(--color); 
}
</style>
