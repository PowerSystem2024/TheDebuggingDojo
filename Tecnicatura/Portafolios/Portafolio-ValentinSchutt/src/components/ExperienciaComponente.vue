<script setup>
import icono1 from '/src/assets/development.svg';
import icono2 from '/src/assets/testing.svg';
import icono3 from '/src/assets/security.svg';
import icono4 from '/src/assets/management.svg';
import icono5 from '/src/assets/innovation.svg';

import { ref } from 'vue';
const titulo = 'Técnico Universitario en Programación';
const fecha = 'Desde Enero 2023 / Noviembre 2024';
const experiencias = ref([
    { id: 1, src: icono1, titulo: 'Desarrollo de Aplicaciones Web y Móviles', parrafo: 'Creación de aplicaciones front-end y back-end, optimizadas para usabilidad y rendimiento. Utilizamos tecnologías modernas para construir interfaces intuitivas y sistemas robustos que satisfacen las necesidades de los usuarios.'},
    { id: 2, src: icono2, titulo: 'Testing Manual y Automatizado', parrafo: 'Implementación de pruebas de calidad, tanto manuales como automatizadas, para garantizar el correcto funcionamiento y la experiencia de usuario en cada proyecto. Nos aseguramos de que nuestras aplicaciones sean fiables y de alto rendimiento.'},
    { id: 3, src: icono3, titulo: 'Ciberseguridad y Protección de Datos', parrafo: 'Aplicación de estrategias y prácticas de ciberseguridad para proteger la integridad de nuestros sistemas. Contamos con un especialista en ciberseguridad que asegura que nuestros desarrollos cumplan con los más altos estándares de seguridad.'},
    { id: 4, src: icono4, titulo: 'Gestión de Proyectos y Metodologías Ágiles', parrafo: 'Organización de proyectos en entornos colaborativos mediante metodologías ágiles como Scrum y Kanban. Este enfoque nos permite adaptarnos rápidamente a los cambios y optimizar el flujo de trabajo para entregas eficientes.'},
    { id: 5, src: icono5, titulo: 'Innovación y Soluciones Personalizadas', parrafo: 'Nos enfocamos en ofrecer soluciones tecnológicas personalizadas que se adapten a las necesidades específicas de cada cliente. Nuestro proceso incluye investigación y adopción de tecnologías emergentes para mantenernos a la vanguardia del desarrollo de software.'},
]);
</script>

<template>
    <div class="card">
        <h3 class="titulo">{{ titulo.toLocaleUpperCase() }}</h3>
        <p class="fecha">{{ fecha }}</p>
        <ul class="listado">
            <li class="item" v-for="experencia in experiencias" :key="experencia.id">
                <img class="imagen-svg" :src="experencia.src" width="55rem" :alt="experencia.titulo">
                <p> {{ experencia.parrafo }}</p>
            </li>
        </ul>
    </div>
</template>

<style scoped>
.card {
    display: flex;
    flex-direction: column;
    padding: 2rem;
    background-color: rgb(28, 41, 52);
    border-radius: 15px;
}

.titulo {
    font-size: 1.5rem;
    color: coral;
}

.fecha {
    font-size: 1rem;
    color: burlywood;
    margin-bottom: 1rem;
}

.listado {
    display: flex;
    flex-direction: column;
}

.item {
    align-items: center;
    display: flex;
    padding: 1rem;
    gap: 1.5rem;
}

@media only screen and (max-width: 600px){

    .card {
    display: flex;
    flex-direction: column;
    padding: 10px;
    background-color: rgb(28, 41, 52);
    border-radius: 15px;
}

.titulo {
    font-size: 16px;
    color: coral;
}

.fecha {
    font-size: 1rem;
    color: burlywood;
    margin-bottom: 1rem;
}

.listado {
    display: flex;
    flex-direction: column;
}

.item {
    align-items: center;
    display: grid;
    padding: 10px 36px 10px 0px;
    margin: 0 auto;
    gap: 1.5rem;
}



}

</style>