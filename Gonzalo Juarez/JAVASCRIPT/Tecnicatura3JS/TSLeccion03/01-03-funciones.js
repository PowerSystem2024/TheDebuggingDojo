// Llamar la función antes de definirla
miFuncion(2,5); // a esto se le llama HOSTING


function miFuncion(a,b){
    // console.log('Sumamos '+ ( a + b )); // muestra directamente los resultados
    return a + b; // para guardar los resultados en una variable
}

// LLAMAR A LA FUNCIÓN
miFuncion(5,4);

let resultado = miFuncion(7,4);
console.log(resultado);

// FUNCIÓN DE TIPO EXPRESIÓN O ANÓNIMA
let x = function(a,b){return a+b};
resutlado = x(3,6);
console.log(resultado);

// FUNCIÓN DE TIPO SELF Y INVOKING (que se llama a sí misma)
(function(a,b){
    console.log("Ejecutando la función: "+ (a+b));
})(3,5); // no se puede reutilizar, es decir, volver a llamarla

// tipo de dato
console.log(typeof miFuncion);

function miFuncionDos(a,b){
    console.log(arguments);
    console.log(arguments.length); // indica cantidad de elementos
}
miFuncionDos(5,7);

// TOSTRING
// convierte la función a texto
var miFuncionTexto = miFuncionDos.toString();
console.log(miFuncionTexto)

// FUNCIÓN FLECHA
const sumarFuncionFlecha = (a,b) => a + b;
resultado = sumarFuncionFlecha(7,9);
console.log(resultado);

/* 
    Los valores dentro de los parentesis al definir la función se denominan PARÁMETROS
    y los valores de los parentesis en el momento en que es llamada la función son ARGUMENTOS
*/

// FUNCIÓN TIPO EXPRECIÓN
let sumar = function(a = 4,b = 8){ // valores default para a y b
    console.log(arguments[0]); // muestra el primer argumento (a)
    console.log(arguments[1]); // muestra el segundo argumento (b)
    console.log(arguments[2]);
    return a + b + arguments[2];
}
resultado = sumar(1,7,9); // si esto queda vacio la función utiliza los valores default
console.log(resultado);

// SUMAR TODOS LOS ARGUMENTOS
let respuesta = sumarTodo(5, 4, 13, 10, 9);
console.log(respuesta);
function sumarTodo(){
    let suma = 0;
    for(let i = 0; i <arguments.length; i++){
        suma += arguments[i];
    }
    return suma;
}

// TIPOS PRIMITIVOS
// PASO POR VALOR
let k = 10;
function cambiarValor(a){ 
    // paso por valor
    a = 20;
}
cambiarValor(k);
console.log(k); // la variable no cambia


// PASO POR REFERENCIA
// se requiere un objeto
const persona = {
    nombre:'Ignacio',
    apellido:'Lopez'
}
console.log(persona);

function cambiarValorObjeto(p1){
    p1.nombre = 'Gonzalo';
    p1.apellido = 'Juarez';
}
cambiarValorObjeto(persona);
console.log(persona);

