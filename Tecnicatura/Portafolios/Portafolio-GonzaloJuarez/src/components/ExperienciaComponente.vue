<script setup>
import icono1 from '/src/assets/interfazGrafica.svg';
import icono2 from '/src/assets/datos.svg';
import icono3 from '/src/assets/web.svg';
import icono4 from '/src/assets/python.svg';
import icono5 from '/src/assets/tasks.svg';

import { ref } from 'vue';
const titulo = 'Técnico Universitario en Programación';
const fecha = 'Desde Enero 2023 / Noviembre 2024';
const experiencias = ref([
    { id: 1, src: icono1, titulo: 'Desarrollo de Aplicaciones con Interfaz Gráfica', parrafo: 'Creación de una aplicación con interfaz gráfica en Java para simplificar la gestión de inventarios en una pequeña empresa. Trabajé en la estructura y el diseño de la interfaz, además de implementar funciones de actualización de inventario y generación de reportes.' },
    { id: 2, src: icono2, titulo: 'Optimización de Consultas SQL en Proyectos de Datos', parrafo: 'Colaboré en un proyecto de análisis de datos donde optimicé consultas SQL complejas para mejorar la velocidad de respuesta en un 40%, permitiendo al equipo trabajar de manera más eficiente y acceder a la información en menor tiempo.' },
    { id: 3, src: icono3, titulo: 'Integración de API Externas en Aplicaciones Web', parrafo: 'Realicé la integración de APIs de terceros para agregar funciones de localización y procesamiento de pagos a una aplicación de comercio electrónico. Me aseguré de que las llamadas a la API fueran eficientes y seguras para mejorar la experiencia del usuario final.' },
    { id: 4, src: icono4, titulo: 'Desarrollo y Pruebas de Scripts en Python', parrafo: 'Trabajé en un equipo de desarrollo donde diseñé y ejecuté scripts en Python para la automatización de tareas administrativas. Esto redujo significativamente el tiempo empleado en procesos repetitivos, mejorando la eficiencia general del flujo de trabajo.' },
    { id: 5, src: icono5, titulo: 'Mantenimiento y Mejora de un Sistema de Gestión de Tareas', parrafo: 'Participé en la optimización de un sistema de gestión de tareas, asegurando la integridad de datos y el rendimiento en una plataforma colaborativa. Implementé mejoras de seguridad y realicé pruebas exhaustivas para asegurar su estabilidad y confiabilidad.' },
]);
</script>

<template>
    <div class="card">
        <h3 class="titulo">{{ titulo }}</h3>
        <p class="fecha">{{ fecha }}</p>
        <ul class="listado">
            <li class="item" v-for="experiencia in experiencias" :key="experiencia.id">
                <img class="imagen-svg" :src="experiencia.src" width="45" :alt="experiencia.titulo">
                <div class="info">
                    <h4 class="item-titulo">{{ experiencia.titulo }}</h4>
                    <p class="item-parrafo">{{ experiencia.parrafo }}</p>
                </div>
            </li>
        </ul>
    </div>
</template>

<style scoped>
/* Estilos para el contenedor principal */
.card {
    display: flex;
    flex-direction: column;
    padding: 2rem;
    background-color: rgb(55, 34, 59);
    border-radius: 12px;
    box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
    max-width: 800px;
    margin: auto;
}

/* Estilo del título */
.titulo {
    font-size: 1.75rem;
    color: #FF7043;
    font-weight: 600;
    text-align: center;
    margin-bottom: 0.5rem;
}

/* Estilo de la fecha */
.fecha {
    font-size: 1rem;
    color: #BDB76B;
    text-align: center;
    margin-bottom: 1.5rem;
}

/* Listado de experiencias */
.listado {
    display: flex;
    flex-direction: column;
    gap: 1.5rem;
}

/* Elemento de cada experiencia */
.item {
    display: flex;
    align-items: flex-start;
    padding: 1.25rem;
    background-color: rgb(27 11 29);
    border-radius: 8px;
    transition: background 0.3s;
    gap: 1rem;
}

.item:hover {
    background-color: rgb(103 70 109);
}

/* Imagen dentro de cada experiencia */
.imagen-svg {
    width: 75px;
    height: 75px;
}

/* Información dentro de cada experiencia */
.info {
    display: flex;
    flex-direction: column;
}

/* Título de cada experiencia */
.item-titulo {
    font-size: 1.25rem;
    color: #13b4a2;
    font-weight: 500;
    margin-bottom: 0.5rem;
}

/* Descripción de cada experiencia */
.item-parrafo {
    font-size: 0.95rem;
    color: #E1E8EB;
    line-height: 1.5;
    text-align: justify;
}

</style>
