<script setup>

import { ref } from 'vue';
const titulo = 'Desarrollador Full Stack';
const fecha = 'Enero 2022 - Noviembre 2024';
const experiencias = ref([
    { id: 1, parrafo: 'Lideré un equipo de 5 desarrolladores en la creación de una plataforma de comercio electrónico que incrementó las ventas en un 35% durante el primer año.' },
    { id: 2, parrafo: 'Diseñé y desarrollé aplicaciones web utilizando Node.js, React y MongoDB, logrando reducir el tiempo de carga de las páginas en un 50%.' },
    { id: 3, parrafo: 'Implementé soluciones de autenticación y autorización, mejorando la seguridad del sitio web y reduciendo los intentos de acceso no autorizado en un 20%.' },
    { id: 4, parrafo: 'Colaboré con diseñadores de UX/UI para crear interfaces de usuario atractivas y fáciles de usar, aumentando la satisfacción del cliente en un 15%.' },
    { id: 5, parrafo: 'Automaticé procesos de despliegue continuo utilizando Jenkins y Docker, reduciendo los tiempos de despliegue en un 40%.' },
]);
</script>

<template>
    <div class="card">
        <h3 class="titulo">{{ titulo.toLocaleUpperCase() }}</h3>
        <p class="fecha">{{ fecha }}</p>
        <ul class="listado">
            <li class="item" v-for="experencia in experiencias" :key="experencia.id">
                <p>{{ experencia.parrafo }}</p>
            </li>
        </ul>
    </div>
</template>

<style scoped>

html{
    scroll-behavior: smooth;
}

.card {
    display: flex;
    flex-direction: column;
    padding: 2rem;
    border-radius: 15px;
    border: 2px solid #929090ee;
    font-family: 'poppins', 'Times New Roman', Times, serif;
}

.titulo {
    font-size: 1.5rem;
    color: var(--main-color);
}

.fecha {
    font-size: 1rem;
    color: var(--main-color);
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
</style>