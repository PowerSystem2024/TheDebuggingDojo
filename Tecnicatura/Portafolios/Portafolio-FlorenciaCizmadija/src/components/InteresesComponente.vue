<script setup>
import { ref } from 'vue';
import FondoLava from './FondoLava.vue';

// Actualizando los intereses para reflejar la transición hacia el desarrollo de software
const intereses = ref([
    'Desarrollo de Software: Me entusiasma aprender nuevas tecnologías y lenguajes. Actualmente, me encuentro en el proceso de ampliar mis conocimientos en automatización y desarrollo frontend.',
    'Calidad de Software (QA): Aunque mi camino hacia el desarrollo de software está en curso, actualmente me enfoco en QA para comprender mejor los procesos de pruebas, detección de errores y mejora continua.',
    'Automatización de Pruebas: Estoy aprendiendo sobre herramientas como Selenium, para crear pruebas automatizadas que mejoren la calidad y la eficiencia en el desarrollo de software.',
    'Tecnología Emergente: Mi interés por la inteligencia artificial y el aprendizaje automático me lleva a explorar cómo estas tecnologías pueden ser aplicadas para mejorar la calidad y la automatización en el software.',
    'Desarrollo Web y Mobile: Mi objetivo futuro es diseñar y desarrollar aplicaciones móviles y web, combinando mi conocimiento de pruebas con la creación de software robusto y bien diseñado.',
    'Crecimiento Personal: Busco un balance entre trabajo y vida personal, disfrutando de actividades, lo que me ayuda a mantener la creatividad y la productividad.'
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
