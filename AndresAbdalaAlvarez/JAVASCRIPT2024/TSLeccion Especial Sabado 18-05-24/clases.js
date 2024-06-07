class Persona{
    constructor(nombre, apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }

}


let persona1 = new Persona('Globo', 'Arredondo');
console.log(persona1);


//HOISTING = Llamar una variable antes de declararla

class Empleado extends Persona{
    constructor(nombre, apellido){
        super(nombre, apellido);
        this.nombre = nombre;
        this.apellido;
    }

    get obtenerNombre(){
        return this.nombre;
    }

    set cambiarNombre(nombre){
        this.nombre = nombre;

    }
}


let empleado1 = new Empleado('Pampa', 'TuMacho')
console.log(empleado1)
//empleado1.cambiarNombre('Rey')
//console.log(empleado1)

let a = 10;
let b = 20;

console.log("El resultado da: "+ (a + b))









