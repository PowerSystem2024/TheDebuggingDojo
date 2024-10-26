<script setup>
import { ref } from 'vue';
import FondoLava from './FondoLava.vue';
//Este es un arreglo con ref para que se pueda reactivar el cambio de los intereses
const intereses = ref([
    'Desarrollo de Software de Código Abierto: Me apasiona contribuir a proyectos de código abierto, ya que me permite colaborar con una comunidad global, aprender nuevas tecnologías y mejorar continuamente mis habilidades de programación.',
    'Inteligencia Artificial y Aprendizaje Automático: Estoy fascinado por el potencial de la inteligencia artificial para resolver problemas complejos y mejorar la toma de decisiones. Exploro técnicas de machine learning y busco aplicarlas en proyectos prácticos.',
    'Optimización de Rendimiento de Código: Disfruto encontrar maneras de mejorar la eficiencia del código, reducir el tiempo de ejecución y optimizar el uso de recursos, para construir aplicaciones rápidas y sostenibles.',
    'Desarrollo de Aplicaciones Web: Me interesa crear experiencias web interactivas y amigables para el usuario. Me mantengo al tanto de las últimas tendencias y tecnologías front-end y back-end para mejorar mis habilidades en este campo.'
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