<script setup>
import { ref } from 'vue';
import FondoLava from './FondoLava.vue';
//Este es un arreglo con ref para que se pueda reactivar el cambio de los intereses
const intereses = ref([
    'Innovación en el Desarrollo de Software: Como equipo, están comprometidos con la creación de soluciones innovadoras en el ámbito del desarrollo de software, abarcando tanto aplicaciones web como móviles. Buscan explorar y aplicar nuevas tecnologías, técnicas y metodologías que mejoren la eficiencia y la experiencia del usuario final.',
    'Inteligencia Artificial y Aprendizaje Automático: Interesados en el futuro de la tecnología, exploran el potencial de la inteligencia artificial para resolver problemas complejos. Se dedican a entender y aplicar técnicas de aprendizaje automático, con el objetivo de desarrollar proyectos que automaticen procesos y ofrezcan análisis de datos inteligentes.',
    'Ciberseguridad y Protección de Datos: Como desarrolladores responsables, tienen un profundo interés en la ciberseguridad. Están comprometidos con aprender e implementar prácticas de seguridad robustas, protegiendo los sistemas y los datos de los usuarios, y promoviendo la importancia de la seguridad en el desarrollo de software.',
    'Contribución a la Comunidad Tecnológica: Buscan no solo desarrollarse como profesionales, sino también contribuir a la comunidad. Están interesados en compartir sus conocimientos a través de talleres, participación en eventos y colaboración en proyectos de código abierto, ayudando a construir un ecosistema tecnológico inclusivo y colaborativo.'
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