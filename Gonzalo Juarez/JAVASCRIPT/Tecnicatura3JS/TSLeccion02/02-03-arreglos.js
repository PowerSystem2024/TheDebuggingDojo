// CREACION DE ARREGLOS O ARRAY
// sintaxis antigua
//let autos = new Array('Ferrari','Renault','BMW');

const autos = ['Ferrari','Renault','BMW'];
console.log(autos);

// MOSTRAR UN ELEMENTO DEL ARREGLO
console.log(autos[0]);
console.log(autos[1]);
console.log(autos[2]);

// RECORRER LOS ELEMENTOS DEL ARREGLO
for(let i = 0; i < autos.length; i++){
    console.log(i + ' : ' + autos[i])
}

// MODIFICAMOS LOS ELEMENTOS DEL ARREGLO
autos[1] = 'Volvo';
console.log(autos[1]);

// AGREGAR UN ELEMENTO
autos.push('Audi');
console.log(autos);

// OTRAS FORMAS DE AGREGAR ELEMENTOS
autos[autos.length] = 'Porche';
console.log(autos);

// OTRA FORMA CUIDADO
autos[6] = 'Nissan'; // el arreglo tiene hasta 4, por lo que al agregar un 6, queda un espacio en blanco.
console.log(autos);

// PREGUNTAR SI ES UN ARREGLO
console.log(Array.isArray(autos)); //boolean (True)

console.log(autos instanceof Array); //boolean (True)
