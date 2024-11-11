<script setup>
import icono1 from '/src/assets/ventas.svg';
import icono2 from '/src/assets/ecomerce.svg';
import icono3 from '/src/assets/configuracion.svg';
import icono4 from '/src/assets/uiux.svg';
import icono5 from '/src/assets/watch.svg';

import { ref } from 'vue';

// Cambio de título a QA
const titulo = 'QA - Aseguramiento de la Calidad';
const fecha = 'Desde Julio 2023 a la Actualidad';

const experiencias = ref([
    { id: 1, src: icono1, parrafo: 'Realicé pruebas de pre-producción y regresión para asegurar la estabilidad del software antes de cada actualización.' },
    { id: 2, src: icono2, parrafo: 'Pruebas de accesibilidad para garantizar que la plataforma sea usable por todas las personas, independientemente de sus capacidades.' },
    { id: 3, src: icono3, parrafo: 'Usé herramientas como JIRA para seguimiento de bugs y tareas, mejorando la eficiencia del equipo de desarrollo.' },
    { id: 4, src: icono4, parrafo: 'Ejecución de pruebas de regresión en aplicaciones web y móviles para garantizar su funcionamiento después de cada nueva versión.' },
    { id: 5, src: icono5, parrafo: 'Realicé pruebas de API utilizando Postman para asegurar que las integraciones funcionen correctamente entre servicios.' },
]);
</script>

<template>
    <div class="card">
        <h3 class="titulo">{{ titulo.toLocaleUpperCase() }}</h3>
        <p class="fecha">{{ fecha }}</p>
        <ul class="listado">
            <li class="item" v-for="experencia in experiencias" :key="experencia.id">
                <img class="imagen-svg" :src="experencia.src" width="45rem" :alt="experencia.parrafo">
                <p>{{ experencia.parrafo }}</p>
            </li>
        </ul>
    </div>
</template>

<style scoped>
.card {
    display: flex;
    flex-direction: column;
    padding: 2rem;
    background-color: #A7D8FF; /* Celeste pastel */
    border-radius: 15px;
}

.titulo {
    font-size: 1.5rem;
    color: #4B8CC4; /* Color de texto para el título */
}

.fecha {
    font-size: 1rem;
    color: #6A8EAA; /* Color del texto de la fecha */
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

.imagen-svg {
    border-radius: 10px;
    background-color: #F4F8FB; /* Fondo suave detrás de los iconos */
    padding: 0.5rem;
}
</style>
