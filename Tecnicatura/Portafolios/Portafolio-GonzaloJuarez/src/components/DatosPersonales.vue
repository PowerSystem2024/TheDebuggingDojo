<script setup>
const title = 'Gonzalo Juarez';
const description = 'Técnico Universitario en Programación';
const presentation = 'Bienvenidos a mi portafolio personal. Soy estudiante de la carrera Tecnicatura en Programación en la Universidad Tecnológica Nacional, Facultad Regional de San Rafael (UTN-FRSR), Argentina. Aunque estoy cursando la carrera, mi pasión por la programación y mi deseo de aprender constantemente me motivan a seguir mejorando. Actualmente, estoy adquiriendo conocimientos en lenguajes como Java, Python y JavaScript, y herramientas como GitHub, HTML y CSS'
const socialnetworks = [
    {id: 1, name: 'Linkedin', src: 'src/assets/linkedin_icon.svg', url: 'https://www.linkedin.com/in/gonzalo-ariel-juarez-4b876a264' },
    {id: 2, name: 'Instagram', src: 'src/assets/instagram_icon.svg', url: 'https://www.instagram.com/gonzaa_juarez/' },
    {id: 3, name: 'GitHub', src: 'src/assets/github_icon.svg', url: 'https://github.com/GonzaaJuarez' },
    {id: 4, name: 'Email', src: 'src/assets/email_icon.svg', url: 'mailto:GonzaloArielJuarez@gmail.com' },
    {id: 4, name: 'Curriculum Vitae', src: 'src/assets/cv_resume_icon.svg', url: '' }
];
const phone = '+54 9 2625402555';
const residence = 'San Rafael, Mendoza, Argentina';
</script>

<template>
    <section class="datos-personales">
        <div class="card">
            <h1>{{ title }}</h1>
            <h2>{{ description }}</h2>
            <p>{{ presentation }}</p>
            <ul class="conteiner-lista">
                <li v-for="red in socialnetworks" :key="red.id">
                    <a :href="red.url"><img class="icon-redsocial" :src="red.src" width="35rem" :alt="red.name"></a>
                </li>
            </ul>
            <h3>Mi telefono personal es: {{ phone }}</h3>
            <h4>{{ residence }}</h4>
        </div>
    </section>
</template>

<style scoped>
/* Estilo del contenedor principal */
.datos-personales {
    display: flex;
    justify-content: center;
    padding: 2rem;
    font-family: Arial, sans-serif;
}

/* Tarjeta de presentación */
.card {
    background-color: rgb(55, 34, 59);
    border-radius: 15px;
    padding: 2rem;
    max-width: 1000px;
    color: #fff;
    text-align: center;
    box-shadow: 0 4px 12px rgba(0, 0, 0, 0.15);
    transition: transform 0.2s ease;
}

/* Títulos y descripción */
h1 {
    font-size: 2.5rem;
    margin-bottom: 0.5rem;
    color: #ffdd57; /* Color resaltado */
}

h2 {
    font-size: 1.5rem;
    color: #c4c4c4;
    margin-bottom: 1rem;
}

p {
    font-size: 1.1rem;
    font-weight: 400;
    margin-bottom: 1.5rem;
    line-height: 1.6;
    color: #d1d5db;
}

/* Redes sociales */
.conteiner-lista {
    display: flex;
    justify-content: center;
    list-style: none;
    padding: 0;
    margin: 1.5rem 0;
}

.icon-redsocial {
    align-items: center;
    background-color: rgb(62, 80, 95);
    border-radius: 50%;
    padding: 8px;
    margin: 0 8px;
    width: 50px;
    height: 50px;
    transition: background-color 0.3s ease, transform 0.3s ease;
}

.icon-redsocial:hover {
    background-color: #ffdd57; /* Color de hover */
    transform: scale(1.1);
}

/* Información de contacto */
h3 {
    font-size: 1.2rem;
    font-weight: 600;
    margin-top: 1rem;
    color: #c4c4c4;
}

h4 {
    font-size: 1rem;
    font-weight: 400;
    color: #c4c4c4;
}
</style>