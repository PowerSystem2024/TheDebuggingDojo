<script setup>
import { ref } from 'vue';
import FondoLava from './FondoLava.vue';
//Este es un arreglo con ref para que se pueda reactivar el cambio de los intereses
const intereses = ref([
    'Innovación en el Desarrollo de Software: Mi objetivo es crear soluciones innovadoras dentro del campo del desarrollo de software, abarcando tanto aplicaciones web como móviles. Me motiva explorar y aplicar nuevas tecnologías, herramientas y metodologías que no solo aumenten la eficiencia, sino que también optimicen la experiencia del usuario final.',
'Inteligencia Artificial y Aprendizaje Automático: Con un fuerte interés por el futuro de la tecnología, investigo el potencial de la inteligencia artificial para resolver desafíos complejos. Dedico tiempo a aprender y poner en práctica técnicas de aprendizaje automático, buscando desarrollar proyectos que automaticen procesos y proporcionen análisis de datos inteligentes',
'Inteligencia Artificial y Aprendizaje Automático: Con un fuerte interés por el futuro de la tecnología, investigo el potencial de la inteligencia artificial para resolver desafíos complejos. Dedico tiempo a aprender y poner en práctica técnicas de aprendizaje automático, buscando desarrollar proyectos que automaticen procesos y proporcionen análisis de datos inteligentes',
'Contribución a la Comunidad Tecnológica: Además de mi desarrollo profesional, me esfuerzo por contribuir activamente a la comunidad tecnológica. Me interesa compartir mis conocimientos mediante talleres, participar en eventos y colaborar en proyectos de código abierto, con el fin de fomentar un ecosistema inclusivo y colaborativo.'

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


@media only screen and (max-width: 600px){ 

    .intereses-contenedor {
    display: flex;
    position: relative;
    margin: 0 auto;
    max-width: 85%;
    max-height: 2700px;
    padding: 0rem;
}

.contenedor-lista {
    list-style-type: none;
        padding: 18px;
        margin-bottom: 2.5rem;
        color: var(--vt-c-white-soft);
        font-size: 16px;
        text-shadow: 3px 3px 6px rgba(0, 0, 0, 1);
}

.item {
    margin-bottom: 1rem;
}
}
</style>