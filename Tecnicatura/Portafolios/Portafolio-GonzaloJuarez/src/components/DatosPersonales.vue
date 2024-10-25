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
]
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
</style>