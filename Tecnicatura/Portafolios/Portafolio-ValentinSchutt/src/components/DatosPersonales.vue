<script setup>
const title = 'Schutt Valentin';
const description = 'Técnico en Programación';
const presentation1 = 'Soy estudiante de la carrera de Técnico en Programación, apasionado por el desarrollo y la creación de soluciones tecnológicas. Durante mi formación, he adquirido conocimientos en varios lenguajes y herramientas que me permiten diseñar y desarrollar aplicaciones eficientes y funcionales. Me enfoco en proyectos que no solo cumplen con los requerimientos técnicos, sino que también ofrecen una excelente experiencia de usuario.'
const presentation2 = 'A lo largo de mi aprendizaje, he trabajado en proyectos que van desde el desarrollo de interfaces atractivas hasta la implementación de lógica de programación robusta. Mi objetivo es seguir creciendo en el mundo de la tecnología, perfeccionando mis habilidades y explorando nuevas herramientas para innovar en cada proyecto.'
const presentation3 = 'Comprometido con mantenerme al día en el campo de la programación, busco mejorar y aprender de cada desafío. Con una visión orientada al futuro, quiero contribuir al desarrollo de soluciones tecnológicas que realmente hagan una diferencia en la vida de las personas.'

const socialnetworks = [
    {id: 1, name: 'Linkedin', src: 'src/assets/linkedin_icon.svg', url: 'https://www.linkedin.com' },
    {id: 2, name: 'Instagram', src: 'src/assets/instagram_icon.svg', url: 'https://www.instagram.com'},
    {id: 3, name: 'GitHub', src: 'src/assets/github_icon.svg', url: 'https://github.com/PowerSystem2024/TheDebuggingDojo' },
    {id: 4, name: 'Curriculum Vitae', src: 'src/assets/cv_resume_icon.svg', url: '' }
];
const residence = 'Argentina';
</script>

<template>
    <section class="datos-personales">
        <div class="card">
            <h1>{{ title }}</h1>
            <h2>{{ description }}</h2>
            <p>{{ presentation1 }}</p>
            <p>{{ presentation2 }}</p>
            <p>{{ presentation3 }}</p>
            <ul class="conteiner-lista">
                <li v-for="red in socialnetworks" :key="red.id">
                    <a :href="red.url"><img class="icon-redsocial" :src="red.src" width="35rem" :alt="red.name"></a>
                </li>
            </ul>
            <h4>{{ residence }}</h4>
        </div>
    </section>
</template>

<style scoped>
h1 {
    font-size: 2.5rem;
}
p {
    font-size: 1.2rem;
    font-weight: 600;
    margin-bottom: 1rem;
}
.card {
    background-color: rgb(28, 41, 52);
    border-radius: 10px;
    padding: 10px;
    margin: 10px;
    text-align: center;
}
.conteiner-lista {
    display: flex;
    justify-content: center;
    list-style: none;
    padding: 0;
    margin: 0;
    text-align: center;
}
.icon-redsocial {
    align-items: center;
    background-color: rgb(62, 80, 95);
    border-radius: 10%;
    padding: 2px;
    margin: 5px;
    box-shadow: 0 0 5px rgba(86, 100, 112, 0.934)
}
h3 {
    font-size: 1.2rem;
    font-weight: 600;
}

/* Integrantes */
.member-lista {
    list-style-type: none;
    padding: 0;
    margin: 0;
    font-family: Arial, sans-serif;
    margin-bottom: 20px; /* Ajusta el valor según el espaciado deseado */
}

.member-lista > p {
    font-weight: bold;
    color: #ddd; /* Color ajustado para coincidir con el tema de la card */
    margin-bottom: 10px;
    font-size: 1.2rem;
}

.member-lista li {
    padding: 8px 12px;
    border-bottom: 1px solid rgba(86, 100, 112, 0.7); /* Color ajustado al tono */
    transition: background-color 0.3s;
    color: #eee; /* Color claro para destacar sobre el fondo oscuro */
}

.member-lista li:hover {
    background-color: rgba(62, 80, 95, 0.8); /* Fondo oscuro al pasar el ratón */
}

.member-lista h4 {
    margin: 0;
    font-size: 1rem;
    color: #ddd; /* Color armonizado */
    font-weight: normal;
}


</style>