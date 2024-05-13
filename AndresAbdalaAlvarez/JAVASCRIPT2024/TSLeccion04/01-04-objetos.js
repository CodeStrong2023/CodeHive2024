//EL tipo primitivo no contiene propiedades ni metodos
let x = 10; //Variable de tipo primitiva
console.log(x.lenght);

//Objecto
//Por eso se llama JSON = JavaScript Object Notation
let persona = {
    nombre: 'Carlos',
    apellido: 'Gil',
    email: 'cgil@gmail.com',
    edad: 30,
    nombreCompleto: function(){ //Aca tenemos un metodo o funcion de JavaScript
        return this.nombre + " " + this.apellido; //El this apunta al objeto que se esta ejecutando
    }

}

console.log(persona.nombre)
console.log(persona.apellido)
console.log(persona.email)
console.log(persona.edad)
console.log(persona)
console.log(persona.nombreCompleto())

let persona2 = new Object();
persona2.nombre = 'Juan'; //Cambiamos dinamicamente el valor de un objeto
persona2.direccion = 'Salada 14';
persona2.telefono = '5492624595873';
console.log(persona2.telefono)


// For in(para recorrer objectos)
for(propiedad in persona){
    console.log(propiedad);
    console.log(persona[propiedad]);
}

console.log(persona['apellido']); //Accedemos como si fuera un arreglo
persona.apellidos = 'Alvarez Bernardi';
console.log(persona);
delete persona.apellidos;


//Distintas formas de imprimir un objeto
//Numero 1 : La mas sensilla -> Concatenar cada valor de cada propiedad 
console.log(persona.nombre + " " + persona.apellido);

//Numero 2: A traves del ciclo for in
for(i in persona){
    console.log(persona[i]);
}

//Numero 3: la funcion Object.values()
let personaArray = Object.values(persona);
console.log(personaArray);

//Numero 4: Utilizamos el metodo JSON.stringify
let personaString = JSON.stringify(persona);
console.log(personaString);

