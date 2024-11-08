<script setup>
import { ref } from 'vue';
import FondoLava from './FondoLava.vue';
//Este es un arreglo con ref para que se pueda reactivar el cambio de los intereses
const intereses = ref([
    'Innovación en el Desarrollo de Software: Estoy comprometido con la creación de soluciones innovadoras en el ámbito del desarrollo de software, abordando tanto aplicaciones web como móviles. Me apasiona explorar y aplicar nuevas tecnologías, técnicas y metodologías que no solo optimicen la eficiencia, sino que también mejoren la experiencia del usuario final.',
'Inteligencia Artificial y Aprendizaje Automático: Interesado en el futuro de la tecnología, exploro el potencial de la inteligencia artificial para resolver problemas complejos. Dedico tiempo a aprender y aplicar técnicas de aprendizaje automático, con el objetivo de desarrollar proyectos que automaticen procesos y ofrezcan análisis de datos inteligentes.',
'Ciberseguridad y Protección de Datos: Como desarrollador responsable, tengo un interés profundo en la ciberseguridad. Estoy comprometido con aprender e implementar prácticas de seguridad sólidas, protegiendo tanto los sistemas como los datos de los usuarios, y promoviendo la importancia de la seguridad en el desarrollo de software.',
'Contribución a la Comunidad Tecnológica: Además de mi crecimiento profesional, busco contribuir activamente a la comunidad tecnológica. Me interesa compartir mis conocimientos a través de talleres, participar en eventos y colaborar en proyectos de código abierto, ayudando a construir un ecosistema inclusivo y colaborativo.'

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