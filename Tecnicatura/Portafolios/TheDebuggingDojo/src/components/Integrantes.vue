<template>
    <div class="integrantes">
      <h2>Integrantes</h2>
      <div class="grid">
        <div v-for="(integrante, index) in integrantes" :key="index" class="integrante-card">
          <img :src="integrante.imagen" :alt="integrante.nombre" class="integrante-imagen" />
          <h3>{{ integrante.nombre }}</h3>
          <a :href="integrante.github" target="_blank">GitHub</a>
        </div>
      </div>
    </div>
  </template>
  
  <script>
  export default {
    name: 'Integrantes',
    data() {
      return {
        integrantes: [
          { nombre: 'Schutt Valentin', imagen: 'https://res.cloudinary.com/dewcgbpvp/image/upload/v1730905838/vschutt_fancvc.png', github: 'https://github.com/SchuttValentin' },
          { nombre: 'Nahuel Francia', imagen: 'https://res.cloudinary.com/dewcgbpvp/image/upload/v1730906162/Nahuel_Francias_ceywle.png', github: 'https://github.com/Nawe1337' },
          { nombre: 'Pablo Correa', imagen: 'https://res.cloudinary.com/dewcgbpvp/image/upload/v1730912356/Imagen_de_WhatsApp_2024-11-06_a_las_13.33.57_1f384ba8_m02btn.jpg', github: 'https://github.com/pablocorrea23' },
          { nombre: 'Cizmadija Paula', imagen: 'https://res.cloudinary.com/dewcgbpvp/image/upload/v1730912617/paula_bbkotj.jpg', github: 'https://github.com/Paucizmadija' },
          { nombre: 'Schutt Lazaro', imagen: 'https://res.cloudinary.com/dewcgbpvp/image/upload/c_crop,ar_1:1/v1730923345/lazaro_schutt_vi6znd.jpg', github: 'https://github.com/lazaroSchutt' },
          { nombre: 'Juarez Gonzalo', imagen: 'https://res.cloudinary.com/dewcgbpvp/image/upload/v1730914429/gonza_ywqepv.png', github: 'https://github.com/GonzaaJuarez' },
          { nombre: 'Cizmadija Florencia', imagen: 'https://res.cloudinary.com/dewcgbpvp/image/upload/v1730914519/flor_vsjpin.png', github: 'https://github.com/Florcizmadija' },
          { nombre: 'Cattai Leandro', imagen: 'https://res.cloudinary.com/dewcgbpvp/image/upload/v1730914519/Leandro_m8ypin.png', github: 'https://github.com/leancattai' },
          { nombre: 'Bruni Gabriel', imagen: 'https://res.cloudinary.com/dewcgbpvp/image/upload/v1730914402/gabiy_od5hn8.png', github: 'https://github.com/GabrielBruni' }
        ]
      };
    }
  };
  </script>
  
  <style>
  .integrantes {
    text-align: center;
    padding: 20px;
  }
  
  .integrantes h2 {
    font-size: 2em;
    margin-bottom: 20px;
  }
  
  .grid {
    display: grid;
    grid-template-columns: repeat(3, 1fr);
    gap: 20px;
    justify-items: center;
  }
  
  .integrante-card {
    text-align: center;
    border-radius: 8px;
    padding: 10px;
    width: 300px;
  }
  
  .integrante-imagen {
    width: 100%;
    height: auto;
    border-radius: 50%;
  }
  
  .integrante-card h3 {
    font-size: 1em;
    margin: 10px 0 5px;
  }
  
  .integrante-card a {
    color: #007bff;
    text-decoration: none;
  }
  
  .integrante-card a:hover {
    text-decoration: underline;
  }

  @media only screen and (max-width: 600px){

    .integrantes {
    text-align: center;
    padding: 20px;
  }
  
  .integrantes h2 {
    font-size: 2em;
    margin-bottom: 20px;
  }
  
  .grid {
    display: grid;
    grid-template-columns: none;
    gap: 20px;
    justify-items: center;
  }
  
  .integrante-card {
    text-align: center;
    border-radius: 8px;
    padding: 10px;
    width: 250px;
  }
  
  .integrante-imagen {
    width: 80%;
    height: auto;
    border-radius: 50%;
  }
  
  .integrante-card h3 {
    font-size: 1em;
    margin: 10px 0 5px;
  }
  
  .integrante-card a {
    color: #007bff;
    text-decoration: none;
  }
  
  .integrante-card a:hover {
    text-decoration: underline;
  }

  }
  </style>
  