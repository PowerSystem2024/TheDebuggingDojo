//Creacion de Arrays o Arreglos

//let autos = new Array('Ferrari', 'Renault', 'BMW'); esta sintaxis es vieja
const autos = ['Ferrari', 'Renault', 'BMW'];
console.log(autos);

//recorrer elementos
console.log(autos[0]);
console.log(autos[2]);

for (let i = 0; i < autos.length; i++) {
    console.log(i + ': ' + autos[i]);
}

//modificamos elementos del arreglo
autos[1] = 'Volvo';
console.log(autos[1]);

//agregar elementos
autos.push('Audi'); //agregamos el elemento al final del arreglo
console.log(autos);

//otras formas de agregar elementos al arreglo
autos[autos.length] = 'Porche';
console.log(autos);

//Tercer forma de agregar elementos - CUIDADO!!
autos[6] = 'Renault';
console.log(autos);

//preguntar si es un array - devuelve un booleano
console.log(Array.isArray(autos)); 

console.log(autos instanceof Array); //preguntamos si la variable es una instancia de la clase array