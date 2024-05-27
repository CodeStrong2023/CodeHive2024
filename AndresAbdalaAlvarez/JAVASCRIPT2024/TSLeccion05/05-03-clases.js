// let persona3 = new Persona('Carla', 'Ponce');

//Sintaxis para creacion de una clase
//Conviene que empieze con letra MAYUSCULA
class Persona{ //CLASE PADRE
    //Si no se define un constructor JavaScript define uno automatico
    constructor(nombre, apellido){
        this._nombre = nombre;
        this._apellido = apellido;
    }

    //AGREGAMOS LOS METODOS GET Y SET
    //se le crea un guion bajo para las propiedades
    get nombre(){
        return this._nombre;
    }

    get apellido(){
        return this._apellido;
    }

    set nombre(nombre){
        this._nombre = nombre;
    }

    set apellido(apellido){
        this._apellido = apellido;
    }

    nombreCompleto(){
        return this._nombre+' '+this._apellido;
    }

    //Sobreescribiendo el metodo de la clase padre (Object)
    toString(){
        //Se aplica polimorfismo que significa = multiples formas en tiempo de ejecucion
        //El metodo que se ejecuta depende si es una referencia de tipo padre o hija
        return this.nombreCompleto();
    }

}

class Empleado extends Persona{ //Clase hija
    constructor(nombre, apellido, departamento){ // tenemos que llamar a los atributos del contructor de la clase padre
        super(nombre, apellido);
        this._departamento = departamento;
    }

    get departamento(){
        return this._departamento;
    }

    set departamento(departamento){
        this._nombre = departamento;
    }

    //Sobreescritura: modificar un comportamiento definido en la clase padre
    nombreCompleto(){
        return super.nombreCompleto() +', '+this._departamento;
    }

}




let persona1 = new Persona('Martin', 'Perez');
console.log(persona1.nombre)
persona1.nombre = 'Juan Carlos';
console.log(persona1.nombre)
let persona2 = new Persona('Carlos', 'Lara')
console.log(persona2.nombre)
persona2.nombre = 'Maria Laura';
console.log(persona2)

//Cuando estamos trabajando con clases no se aplica el consepto de Hoisting

let empleado1 = new Empleado('Maria','Gimenez','Sistemas');
console.log(empleado1);
console.log(empleado1.nombre);
console.log(empleado1.nombreCompleto());

// Object.prototype.toString  //Esta es la manera de acceder a atributos y metodos de manera dinamica

console.log(empleado1.toString());
console.log(persona1.toString());

