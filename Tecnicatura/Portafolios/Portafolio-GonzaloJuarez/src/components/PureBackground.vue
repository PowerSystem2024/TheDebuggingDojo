<script>
/* Background Gradients From -- https://uigradients.com */
</script>
<template>
    <div class="area">
        <ul class="circles">
            <li></li>
            <li></li>
            <li></li>
            <li></li>
            <li></li>
            <li></li>
            <li></li>
            <li></li>
            <li></li>
            <li></li>
        </ul>
    </div>
</template>

<style scoped>
.area {
    background: #2a1e35;
    background: -webkit-linear-gradient(to left, #4b3069, #2a1e35);
    width: 100%;
    height: 100vh;
    overflow: hidden; /* Oculta cualquier desbordamiento */
}

.circles {
    position: absolute;
    top: 0;
    left: 0;
    width: 100%;
    height: 100%;
    overflow: hidden;
    z-index: -1; /* Asegura que el fondo esté detrás del contenido */
}

.circles li {
    position: absolute;
    display: block;
    list-style: none;
    width: 20px;
    height: 20px;
    background: #a353c9;
    opacity: 0.7;
    animation: animate 25s linear infinite;
    bottom: -150px;
}

/* Controla el tamaño y la visibilidad en pantallas pequeñas */
@media (max-width: 768px) {
    .area {
        height: auto; /* Ajusta la altura automáticamente */
        padding-bottom: 2rem; /* Agrega un espacio al final */
    }

    .circles li {
        width: 15px; /* Reduce el tamaño de los elementos */
        height: 15px;
        animation-duration: 30s; /* Cambia la duración para animaciones más lentas */
    }
}

/* Resto de los estilos para los elementos de animación */
.circles li:nth-child(odd) {
    background: #a353c9;
}

.circles li:nth-child(even) {
    background: #735d9d;
}

.circles li:nth-child(1) {
    left: 25%;
    width: 80px;
    height: 80px;
    animation-delay: 0s;
}

.circles li:nth-child(2) {
    left: 10%;
    width: 20px;
    height: 20px;
    animation-delay: 2s;
    animation-duration: 12s;
}

.circles li:nth-child(3) {
    left: 70%;
    width: 20px;
    height: 20px;
    animation-delay: 4s;
}

.circles li:nth-child(4) {
    left: 40%;
    width: 60px;
    height: 60px;
    animation-delay: 0s;
    animation-duration: 18s;
}

/* Resto de elementos */
.circles li:nth-child(5) { left: 65%; width: 20px; height: 20px; animation-delay: 0s; }
.circles li:nth-child(6) { left: 75%; width: 110px; height: 110px; animation-delay: 3s; }
.circles li:nth-child(7) { left: 35%; width: 150px; height: 150px; animation-delay: 7s; }
.circles li:nth-child(8) { left: 50%; width: 25px; height: 25px; animation-delay: 15s; animation-duration: 45s; }
.circles li:nth-child(9) { left: 20%; width: 15px; height: 15px; animation-delay: 2s; animation-duration: 35s; }
.circles li:nth-child(10) { left: 85%; width: 150px; height: 150px; animation-delay: 0s; animation-duration: 11s; }

@keyframes animate {
    0% {
        transform: translateY(0) rotate(0deg);
        opacity: 1;
        border-radius: 0;
    }
    100% {
        transform: translateY(-1000px) rotate(720deg);
        opacity: 0;
        border-radius: 50%;
    }
}
</style>
