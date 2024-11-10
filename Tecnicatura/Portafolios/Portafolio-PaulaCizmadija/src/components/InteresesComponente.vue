<script setup>
import { ref } from 'vue';
import FondoLava from './FondoLava.vue';

const intereses = ref([
    'Desarrollo de Software en Equipo: Participo en proyectos de código abierto en GitHub, donde colaboro con otros desarrolladores para mejorar herramientas y librerías que usamos todos. Me encanta trabajar en equipo y aprender de los demás en el proceso.',
    'Música: La música es parte de mi día a día. Escucho distintos géneros que me inspiran y me ayudan a concentrarme, tanto en el trabajo como en mis ratos libres.',
    'Tecnología y la Inteligencia Artificial: Me fascina explorar el mundo de la inteligencia artificial y las novedades tecnológicas. Siempre busco maneras de aplicar estas ideas a lo que desarrollo.',
    'Lectura: En mi tiempo libre, me gusta leer sobre tecnología, ciencia, y temas que me ayuden a mejorar. Es una forma de seguir aprendiendo y creciendo.'
]);
</script>

<template>
    <div class="intereses-contenedor">
        <FondoLava />
        <ul class="contenedor-lista">
            <li class="item" v-for="interes in intereses" :key="interes">
                {{ interes }}
            </li>
        </ul>
    </div>
    <!-- <div class="intereses-contenedor">
        <ul class="contenedor-lista">
            <li class="item">
                Desarrollo de Software en Equipo: Participo en proyectos de código abierto en GitHub, donde colaboro con otros desarrolladores para mejorar herramientas y librerías que usamos todos. Me encanta trabajar en equipo y aprender de los demás en el proceso.
            </li>
            <li class="item">
                Música: La música es parte de mi día a día. Escucho distintos géneros que me inspiran y me ayudan a concentrarme, tanto en el trabajo como en mis ratos libres.
            </li>
            <li class="item">
                Tecnología y la Inteligencia Artificial: Me fascina explorar el mundo de la inteligencia artificial y las novedades tecnológicas. Siempre busco maneras de aplicar estas ideas a lo que desarrollo.
            </li>
            <li class="item">
                Lectura: En mi tiempo libre, me gusta leer sobre tecnología, ciencia, y temas que me ayuden a mejorar. Es una forma de seguir aprendiendo y creciendo.
            </li>
        </ul>
    </div> -->
</template>

<style scoped>
.intereses-contenedor {
    display: flex;
    position: relative;
    margin: 0 auto;
    max-width: 85%;
    padding: 1rem;
}

.contenedor-lista {
    list-style-type: none;
    padding: 1rem;
    margin-bottom: .5rem;
    color: var(--vt-c-white-soft);
    font-size: 1.4rem;
    text-shadow: 3px 3px 6px rgba(0, 0, 0, 1);
}

.item {
    margin-bottom: 1rem;
}
</style>