let x = 10; //variable tipo primitiva
console.log(x.length);

//Objeto 
let persona = {
    nombre: 'Juan',
    apellido: 'Perez',
    email: 'juanperez@gmail.com',
    edad: 28,
    idioma: 'ES',
    get lang() {
        return this.idioma.toUpperCase(); //convertir a mayusculas
    },
    set lang(lang) {
        this.idioma = lang.toUpperCase();
    },
    nombreCompleto: function () { //método
        return this.nombre + ' ' + this.apellido;
    },
    get nombreEdad() {
        return this.nombre + ' Edad: ' + this.edad
    },
}

console.log(persona.nombre, persona.email);
console.log(persona);
console.log(persona.nombreCompleto());

let persona2 = new Object(); //crea un nuevo objeto en memoria
persona2.nombre = 'Carlos';
persona2.direccion = 'Saturno 15';
persona2.telefono = '5544332211';
console.log(persona2.telefono);

console.log(persona['apellido']);//Accedemos como si fuera un arreglo

//for in pra acceder al obejeto como si fue un arreglo
for (propiedad in persona) {
    console.log(propiedad);
    console.log(persona[propiedad]);
}

persona.apellido = 'Correa'; //cambiamos dinamicamente le valor de un objeto
console.log(persona);

persona.apellida = 'Martin';
console.log(persona); //agregamos un nuevo atributo al objeto
delete persona.apellida; //eliminamos el atributo
console.log(persona);


//Distintas formas de imprimir un objeto
//Número 1: la forma mas sencilla: concatenar cada valor de cada propiedad
console.log('Distintas formas de imprimir un objeto: forma 1')
console.log(persona.nombre + ' ' + persona.apellido);

//Número 2: a traves del ciclo for in
console.log('Distintas formas de imprimir un objeto: forma 2')
for (nombrePropiedad in persona) {
    console.log(persona[nombrePropiedad]);
}

//Numero 3: la funcion Object.values()
console.log('Distintas formas de imprimir un objeto: forma 3')
let personaArray = Object.values(persona);
console.log(personaArray);

//Numero 4: utilizamos el metodo JSON.stringify
console.log('Distintas formas de imprimir un objeto: forma 4')
let personaString = JSON.stringify(persona);
console.log(personaString);

console.log('comenzamos a utilizar el metodo get')
console.log(persona.nombreEdad);

console.log('comenzamos con el metodo get y un set para idiomas')
persona.lang = 'en';
console.log(persona.lang);

function Persona3(nombre, apellido, email) { //constructor
    this.nombre = nombre;
    this.apellido = apellido;
    this.email = email;
    this.nombreCompleto = function () {
        return this.nombre + ' ' + this.apellido;
    }
}
let padre = new Persona3('Juan', 'Perez', 'lopezperez@gmail.com');
padre.nombre = 'Pablo'; //modificamos el nombre
padre.telefono = '55443322';

console.log(padre);
console.log(padre.nombreCompleto());//utilizamos la funcion

let madre = new Persona3('Laura', 'Quintero', 'jabdcs@gmail.com');
console.log(madre);

//Diferentes formas de crear objetos
//caso objeto 1
let miObjeto = new Object(); //esta es una opcion formal

//caso objeto 2
let miObjeto2 = {};//esta opcion es breve y recomendada

//caso string 1
let miCadena = new String('Hola');//sintaxis formal

//caso string 2
let miCadena2 = 'Hola'; //sintaxis simplificada y recomendada

//caso con numeros 1
let miNumero = new Number(1); //es dormal no recomendable

//caso conn numeros 2
let miNumero2 = 1; //sintaxis recomendada

//caso boolean 1
let miBoolean = new Boolean(false);//formal

//caso boolean 2
let miBoolean2 = false;//sintaxis recomendada

//caso arreglos 1
let miArreglo = new Array();//formal

//caso arreglos 2
let miArreglo2 = [];//sintaxis recomendada

//caso funcion 1
let miFuncion = new Function(); //todo despues de new es considerado objeto

//caso funcion 2
let miFuncion2 = function(){ };//notacion simplificada y recomendada

//Uso de prototype
Persona3.prototype.telefono = '123456789';
console.log(padre);

console.log(madre.telefono);
madre.telefono = '987654321';
console.log(madre.telefono)

//Uso del metodo call
let persona4 = {
    nombre: 'Juan',
    apellido: 'Perez',
    nombreCompleto2: function (titulo, telefono) {
        return titulo+ ': '+ this.nombre + ' ' + this.apellido + ' ' + telefono;
        //return this.nombre + ' ' + this.apellido;
    }
}

let persona5 = {
    nombre: 'Carlos',
    apellido: 'Lopez'
}
console.log(persona4.nombreCompleto2('Lic.', 'i7528532'));
console.log(persona4.nombreCompleto2.call(persona5, 'Ing.', '76347815874'))

//Metodo Apply
let arreglo = ['Ing.', '55443322'];
console.log(persona4.nombreCompleto2.apply(persona5, arreglo))

