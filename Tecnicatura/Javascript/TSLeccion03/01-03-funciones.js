miFuncion(8,2); //a esto s ele conoce como Hoisting

function miFuncion(a,b){
    //console.log('Sumamos: '+ (a+b));
    return a+b;
}

//llamamos a la funcion
miFuncion(2, 3);

let resultado = miFuncion(5, 6);
console.log(resultado);

//Declaramos una funcion del tipo expresion o anonima
let x = function(a, b){return a+b}; //necesita cierre con punto y coma
resultado = x(5, 6); //al llamarla se pone la variable y parentesis
console.log(resultado);

//Funciones del tipo self invoking
(function(a, b){
    console.log('Ejecutando la funcion: '+ (a+b));
})(9, 10);

console.log(typeof miFuncion)

function miFuncionDos(a, b){
    console.log(arguments.length);
}
miFuncionDos(5, 7, 10, 6);

//toString
var miFuncionTexto = miFuncionDos.toString();
console.log(miFuncionTexto);

//Funciones flecha
const sumarFuncionFlecha = (a, b) => a + b;
resultado = sumarFuncionFlecha(3, 7); //asignamos el valor de la variable
console.log(resultado);

//Funcion tipo expresion
let sumar = function(a= 4, b= 8){
    console.log(arguments[0]); //muetsra el parametro de: a
    console.log(arguments[1]);//muestra el parametro de: b
    console.log(arguments[2]);
    return a + b + arguments[2];
};
resultado = sumar(3, 2, 9);
console.log(resultado);



let respuesta = sumarTodo(5, 4, 13, 10, 9);
console.log(respuesta);

//sumar todos los argumentos
function sumarTodo(){
    let suma = 0;
    for(let i = 0; i < arguments.length; i++){
        suma += arguments[i]; //arguments es para arreglos
    }
    return suma;
}

//tipos primitivos
let k = 10;
function cambiarValor(a){ //paso por valor
    a = 20;
}

cambiarValor(k);
console.log(k);

//paso por referencia
const persona = { //es un objeto
    nombre: 'Juan',
    apellido: 'Perez'
}

function cambiarValorObjeto(p1){
    p1.nombre = 'Ignacio';
    p1.apellido = 'Perez';
}

cambiarValorObjeto(persona);
console.log(persona);