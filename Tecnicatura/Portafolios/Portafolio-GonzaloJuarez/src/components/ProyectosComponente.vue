<script setup>
import proyecto1 from '/src/assets/gestionCursos.png';
import proyecto2 from '/src/assets/comercio.png';
import proyecto3 from '/src/assets/pelis.jpg';
import proyecto4 from '/src/assets/habitos.png';

// Este componente muestra una galería de proyectos con información sobre cada proyecto
import { ref } from 'vue';
//.ref es una función que se utiliza para crear una referencia reactiva en Vue 3
var misProyectos = ref([]);
//.value es una propiedad que se utiliza para acceder al valor de una referencia reactiva en Vue 3
misProyectos.value = ([
    //esto es un array de objetos que contiene información sobre los proyectos
    {
        id: 1,
        src: proyecto1,
        titulo: "Sistema de Gestión de Cursos para Institución Educativa (2023)",
        descripcion: "Desarrollo de una aplicación para gestionar horarios de clases, asignación de profesores y materias en una institución educativa.",
        projectoLink: "https://campus.frsr.utn.edu.ar/",
        githubLink: "https://github.com/GonzaaJuarez"
    },
    {
        id: 2,
        src: proyecto2,
        titulo: "Simulador de Presupuestos para Comercio Electrónico (2022)",
        descripcion: "Construcción de una herramienta web interactiva que permite a pequeños comerciantes estimar los costos y ganancias en una plataforma de e-commerce.",
        projectoLink: "https://campus.frsr.utn.edu.ar/",
        githubLink: "https://github.com/GonzaaJuarez"
    },
    {
        id: 3,
        src: proyecto3,
        titulo: "API para Recomendación de Películas (2022)",
        descripcion: "Desarrollé una API en Python con Flask que recomienda películas basadas en los gustos de los usuarios. ",
        projectoLink: "https://campus.frsr.utn.edu.ar/",
        githubLink: "https://github.com/GonzaaJuarez"
    },
    {
        id: 4,
        src: proyecto4,
        titulo: "Aplicación de Seguimiento de Hábitos (2023)",
        descripcion: "Diseñé una aplicación en React y Node.js que permite a los usuarios crear y seguir sus objetivos diarios.",
        projectoLink: "https://campus.frsr.utn.edu.ar/",
        githubLink: "https://github.com/GonzaaJuarez"
    },
])

</script>

<template>
    <!-- Aquí va el código HTML de la galería de proyectos -->
    <div class="galeria">
        <!-- Itera sobre cada proyecto en la lista de misProyectos -->
        <!--key es una propiedad especial que se utiliza para identificar de forma única cada elemento en una lista de Vue.js-->
        <li class="proyecto" v-for="proyecto in misProyectos" :key="proyecto.id">
            <!-- Muestra la imagen del proyecto utilizando : que es una directiva de enlace de atributo en Vue.js -->
            <img :src="proyecto.src" :alt="proyecto.titlulo">
            <div class="proyecto-info">
                <!-- Muestra el título y la descripción del proyecto utilizando la interpolación de Vue.js -->
                <h3>{{ proyecto.titulo }}</h3>
                <p>{{ proyecto.descripcion }}</p>
                <div class="proyecto-links">
                    <a :href="proyecto.projectoLink" class="btn-ver-mas" target="_blank" rel="noopener noreferrer">Ver
                        Proyecto</a>
                    <a :href="proyecto.githubLink" class="github-link" target="_blank" rel="noopener noreferrer">Ver
                        Código en GitHub</a>
                </div>
            </div>
        </li>
    </div>
</template>

<style scoped>
/* Contenedor principal de la galería */
.galeria {
    display: grid;
    grid-template-columns: repeat(auto-fill, minmax(250px, 1fr));
    border-radius: 12px;
    gap: 1.5rem;
    padding: 2rem;
    background-color: rgb(55, 34, 59);
}

/* Estilos de cada tarjeta de proyecto */
.proyecto {
    list-style: none;
    background: rgb(202 160 211);
    border-radius: 8px;
    overflow: hidden;
    box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
    transition: transform 0.3s ease;
}

.proyecto:hover {
    transform: translateY(-5px);
}

/* Imagen del proyecto */
.proyecto img {
    width: 90%;
    height: auto;
    object-fit: cover;
    border: 4px solid rgb(55, 34, 59);
    border-radius: 40px;
    margin: 18px;
}

/* Información del proyecto */
.proyecto-info {
    padding: 1rem;
}

.proyecto-info h3 {
    font-size: 1.2rem;
    margin: 0.5rem 0;
    color: #333;
}

.proyecto-info p {
    font-size: 0.9rem;
    color: #666;
    margin-bottom: 1rem;
}

/* Enlaces de proyecto */
.proyecto-links {
    display: flex;
    justify-content: space-between;
}

.proyecto-links a {
    text-decoration: none;
    font-size: 0.9rem;
    font-weight: 600;
    color: rgb(255 255 255);
    padding: 0.5rem 1rem;
    border-radius: 5px;
    transition: background-color 0.3s ease;
}

.btn-ver-mas {
    background-color: rgb(55, 34, 59);
}

.btn-ver-mas:hover {
    background-color: rgb(135, 82, 145);
}

.github-link {
    background-color: #000000;
}

.github-link:hover {
    background-color: rgb(135, 82, 145);
}
</style>
