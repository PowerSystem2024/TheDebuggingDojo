<template>
    <header class="header">

        <nav class="navbar">
            <a href="#top" class="logo">PABLO CORREA
            </a>
            <div class="navbar-menu">
                <ul>
                    <a v-for="nav in navegacion" :key="nav.nombre" :href="nav.enlace" class="nav-item">{{ nav.nombre
                        }}</a>
                </ul>
            </div>
        </nav>
    </header>
</template>

<script setup>
import { ref } from 'vue';
const navegacion = ref([
    { id: 1, nombre: 'Educación', enlace: '#educacion' },
    { id: 2, nombre: 'Experiencia', enlace: '#experiencia' },
    { id: 3, nombre: 'Proyectos', enlace: '#proyectos' },
    { id: 4, nombre: 'Habilidades', enlace: '#habilidades' }
])
</script>

<style scoped>
html{
    scroll-behavior: smooth;
}

.navbar {
    background-color: var(--vt-c-black);
    color: #fff;
    padding: 0.5rem 1rem;
    align-items: center;
    display: flex;
    flex-direction: row;
    justify-content: space-around;
    width: 100%;
}

.navbar-menu {
    display: flex;
    justify-content: flex-end;

}

.nav-list {
    list-style: none;
}

.navbar a {
    font-size: 1.5rem;
    color: var(--text-color);
    margin-left: 4rem;
    font-weight: 500;
    transition: 0.3s ease;
    border-bottom: 3px solid transparent;

}

.nav-item:hover{
    color: var(--main-color);
    border-bottom: 3px solid var(--main-color);
    transform: scale(1.1);
}

/* empiezan estilos de yt */
.header {
    position: fixed;
    top: 0;
    left: 0;
    width: 100%;
    height: 60px;
    color: white;
    display: flex;
    align-items: center;
    z-index: 1000;
}

.navbar .logo {
    font-size: 2rem;
    color: #34e0cc;
    font-weight: 800;
    cursor: pointer;
    transition: 0.3 ease;
}

.logo:hover {
    transform: scale(1.1);

}

.logo .span {
    text-shadow: 0 0 25px var(--main-color);
}

@media (max-width: 768px) {
    .navbar-menu {
        display: flex;
        justify-content: flex-end;
        width: 100%;
    }
}
</style>