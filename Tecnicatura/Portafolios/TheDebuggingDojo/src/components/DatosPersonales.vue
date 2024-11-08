<script setup>
const title = 'The Debugging Dojo';
const description = 'Grupo de Programación';
const presentation1 = 'Somos un grupo de nueve apasionados estudiantes cursando la tecnicatura en programación, unidos por nuestro entusiasmo y dedicación hacia el desarrollo de software y la tecnología. Cada uno de nosotros aporta un conjunto único de habilidades y experiencias, lo que nos permite trabajar de manera colaborativa y efectiva en proyectos diversos e innovadores.'
const presentation2 = 'Como equipo, combinamos nuestras habilidades individuales para abordar una amplia variedad de proyectos, desde el desarrollo de aplicaciones web y móviles hasta la implementación de soluciones de inteligencia artificial y ciberseguridad. Estamos comprometidos con la excelencia y la innovación, siempre buscando aprender y mejorar en cada etapa de nuestro viaje profesional.'
const presentation3 = 'Nuestro objetivo es no solo crear soluciones tecnológicas de alta calidad, sino también contribuir positivamente a la comunidad tecnológica y seguir creciendo como profesionales en este dinámico campo.'

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