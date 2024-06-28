// let persona3 = new Persona('Carla', 'Ponce');

//Sintaxis para creacion de una clase
//Conviene que empieze con letra MAYUSCULA
class Persona{ //CLASE PADRE

    static contadorPersonas = 0; //Atributo statico
    // email = 'Valor default email'; //Atributo no estatico

    static get MAX_OBJ(){ //Este metodo simula una constante
        return 5;
    }

    //Si no se define un constructor JavaScript define uno automatico
    constructor(nombre, apellido){
        this._nombre = nombre;
        this._apellido = apellido;
        if(Persona.contadorPersonas < Persona.MAX_OBJ){
            this.idPersona = ++Persona.contadorPersonas;
        }else{
            console.log("Se ha Superado el maximo de objetos permitidos");
        }
        
        // console.log("Se incrementa el contador: "+Persona.contadorPersonas);
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
        return this.idPersona +' - '+this._nombre+' '+this._apellido;
    }

    //Sobreescribiendo el metodo de la clase padre (Object)
    toString(){
        //Se aplica polimorfismo que significa = multiples formas en tiempo de ejecucion
        //El metodo que se ejecuta depende si es una referencia de tipo padre o hija
        return this.nombreCompleto();
    }

    static saludar(){
        console.log("Saludos desde este metodo Static");
    }

    static saludar2(persona){
        console.log(persona.nombre+' '+persona.apellido)
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

//Metodo estatico pertenece a la clase y no a sus objetos. No se puede utilizar desde el objeto
// persona1.saludar(); //No Funciona

Persona.saludar();
Persona.saludar2(persona1);

Empleado.saludar();
Empleado.saludar2(empleado1);

//console.log(persona1.contadorObjetosPersona);
console.log(Persona.contadorObjetosPersona);
console.log(Empleado.contadorObjetosPersona);

console.log(persona1.email);
console.log(empleado1.email);
console.log(Persona.email); //Undefined

console.log(persona1.toString());
console.log(persona2.toString());
console.log(empleado1.toString());
console.log(Persona.contadorPersonas);

let persona3 = new Persona("Carla", "Pertosi");
console.log(persona3.toString());
console.log(Persona.contadorPersonas);

console.log(Persona.MAX_OBJ);
// Persona.MAX_OBJ = 10; //No pasa nada. No se puede modificar ni alterar

let persona4 = new Persona("Franco", "Diaz");
console.log(persona4.toString());

let persona5 = new Persona("Emiliano", "Poblete");
console.log(persona5.toString());

