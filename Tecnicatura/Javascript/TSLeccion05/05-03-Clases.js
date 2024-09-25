//let persona3 = new Persona('Carla', 'Ponce')

class Persona{ //clase padre
    constructor(nombre, apellido, edad){
        this._nombre = nombre;
        this._apellido = apellido;
        this._edad = edad;
    }

    get nombre(){
        return this._nombre;
    }

    set nombre(nombre){
        this._nombre = nombre;
    }

    get apellido(){
        return this._apellido;
    }

    set apellido(apellido){
        this._apellido = apellido;
    }

}

let persona1 = new Persona("Juan", "Perez", 25);
console.log(persona1.nombre);
persona1.nombre = "Juan Carlos";
console.log(persona1.nombre);
//console.log(persona1);
console.log(persona1.apellido)
persona1.apellido = "Perez Gomez";
console.log(persona1.apellido);

let persona2 = new Persona("Maria", "Gomez", 30);
console.log(persona2.nombre);
persona2.nombre = "Maria Isabel";
console.log(persona2.nombre);
//console.log(persona2);
console.log(persona2.apellido)
persona2.apellido = "Gomez Lopez";
console.log(persona2.apellido);


class Empleado extends Persona{ //clase hija
    constructor(nombre, apellido, edad, departamento){
        super(nombre, apellido, edad);
        this._departamento = departamento;
    }

    get departamento(){
        return this._departamento;
    }

    set departamento(departamento){
        this._departamento = departamento;
    }
}

let empleado1 = new Empleado("Pedro", "Lopez", 35, "Ventas");
console.log(empleado1);