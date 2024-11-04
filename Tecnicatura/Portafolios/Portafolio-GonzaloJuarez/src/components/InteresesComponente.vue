<script setup>
import { ref } from 'vue';
import PureBackground from './PureBackground.vue';

const intereses = ref([
    'Desarrollo de Software de Código Abierto: Me apasiona contribuir a proyectos de código abierto, ya que me permite colaborar con una comunidad global, aprender nuevas tecnologías y mejorar continuamente mis habilidades de programación.',
    'Inteligencia Artificial y Aprendizaje Automático: Estoy fascinado por el potencial de la inteligencia artificial para resolver problemas complejos y mejorar la toma de decisiones. Exploro técnicas de machine learning y busco aplicarlas en proyectos prácticos.',
    'Optimización de Rendimiento de Código: Disfruto encontrar maneras de mejorar la eficiencia del código, reducir el tiempo de ejecución y optimizar el uso de recursos, para construir aplicaciones rápidas y sostenibles.',
    'Desarrollo de Aplicaciones Web: Me interesa crear experiencias web interactivas y amigables para el usuario. Me mantengo al tanto de las últimas tendencias y tecnologías front-end y back-end para mejorar mis habilidades en este campo.'
]);
</script>

<template>
    <div class="intereses-contenedor">
        <PureBackground class="fondo-animado" />
        <ul class="contenedor-lista">
            <li class="item" v-for="interes in intereses" :key="interes">
                {{ interes }}
            </li>
        </ul>
    </div>
</template>

<style scoped>
/* Contenedor principal */
.intereses-contenedor {
    position: relative;
    padding: 2rem;
    color: #d9b8dd;
    font-family: Arial, sans-serif;
    text-align: left;
    overflow: hidden;
}

/* Fondo animado */
.fondo-animado {
    position: absolute;
    top: 0;
    left: 0;
    right: 0;
    bottom: 0;
    z-index: -1; /* Coloca el fondo detrás del texto */
    border-radius: 8px;
}

/* Lista de intereses */
.contenedor-lista {
    list-style: none;
    padding: 0;
    margin: 0;
    z-index: 1; /* Asegura que el texto esté encima del fondo */
}

/* Elemento individual de la lista */
.item {
    font-size: 1.1rem;
    margin-bottom: 1.5rem;
    padding: 1.2rem;
    border-left: 4px solid #6d4c8e;
    border-radius: 8px;
    transition: transform 0.3s ease, background-color 0.3s ease;
    background-color: rgba(25, 4, 27, 0.8);
}

/* Hover en cada item */
.item:hover {
    color:rgb(255, 255, 255);
    transform: translateX(10px);
    background-color: rgba(255, 255, 255, 0.1);
}

/* Adaptación para pantallas pequeñas */
@media (max-width: 768px) {
    .item {
        font-size: 1rem;
        padding: 1rem;
    }
}
</style>
