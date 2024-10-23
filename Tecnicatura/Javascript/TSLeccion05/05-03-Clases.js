//let persona3 = new Persona('Carla', 'Ponce')

class Persona{ //clase padre

    static contadorPersonas = 0; //atributo estatico
    //email = 'Valor default email'; //atributo no estatico

    static get MAX_OBJ(){ //este metodo simula una constante
        return 5;
    }

    constructor(nombre, apellido, edad){
        this._nombre = nombre;
        this._apellido = apellido;
        if(Persona.contadorPersonas < Persona.MAX_OBJ){
            this.idPersona = ++Persona.contadorPersonas;
        }
        else{
            console.log('Se ha superado el maximo de objetos permitidos');
        }
        
        this._edad = edad;
        //Persona.contadorPersonas++;
        //this.idPersona = ++Persona.contadorPersonas;
        //console.log('Se incrementa contador: ' + Persona.contadorPersonas);
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

    nombreCompleto(){
        return this.idPersona+' '+ this._nombre + ' ' + this._apellido;
    }

    //sobreescribiendo el metodo de la clase padre (Object)
    toString(){ //regresa un String
        //se aplica el polimorfismo que significa = multiples formas de tiempo de ejecucion
        //el metodo que se ejecuta depende si la referencia es de tipo padre o hija
        return this.nombreCompleto();
    }

    static saludar(){
        console.log("saludos desde metodo static");
    }

    static saludar2(persona){
        console.log('Hola ' + persona.nombre + ' '+ persona.apellido);
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

    //sobreescritura
    nombreCompleto(){
        return super.nombreCompleto() + ', ' + this._departamento;
    }
}

let empleado1 = new Empleado("Pedro", "Lopez", 35, "Ventas");
console.log(empleado1);
console.log(empleado1.nombreCompleto());

//Object.prototype.toString -- esta es la manera de acceder a atributos y metodos de manera dinámica
console.log(empleado1.toString());
console.log(persona1.toString());

//persona1.saludar(); --no se utiliza desde el objeto
Persona.saludar();
Persona.saludar2(persona1);

Empleado.saludar();

//console,log(persona1.contadorObjetosPersonas); --hay que acceder desde la clase y no desde el objeto
console.log(Persona.contadorPersonas);
console.log(Empleado.contadorPersonas); //las clases hijas tambien heredan los metodos estaticos

//console.log(persona1.email);
//console.log(empleado1.email);
//console.log(Persona.email); -- No se puede acceder desde la clase pero si desde el objeto

console.log(persona1.toString());
console.log(persona2.toString());
console.log(empleado1.toString());
console.log(Persona.contadorPersonas);

let persona3 = new Persona('Carla', 'Ponce');
console.log(persona3.toString());
console.log(Persona.contadorPersonas);

console.log(Persona.MAX_OBJ);
//Persona.MAX_OBJ = 10; --- no se puede modificar, ni alterar
console.log(Persona.MAX_OBJ);

let persona4 = new Persona('Franco', 'Diaz');
console.log(persona4.toString());
let persona5 = new Persona('Liliana', 'Paz');
console.log(persona5.toString());

