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

//Metodos Get y set
console.log("-----------METODO GET Y SET-----------")
console.log("Metodo GET")

let persona3 = {
    nombre: 'Carlos',
    apellido: 'Gil',
    email: 'cgil@gmail.com',
    edad: 28,
    idioma: 'ES', //Los idiomas generalmente van con mayusculas
    get lang(){
        return this.idioma.toUpperCase();
    },
    set lang(lang){
        this.idioma = lang.toUpperCase();//El toUpperCase convierte las minisculas en MAYUSCULAS
    },
    nombreCompleto: function(){ //Aca tenemos un metodo o funcion de JavaScript
        return this.nombre + " " + this.apellido; //El this apunta al objeto que se esta ejecutando
    },
    get nombreEdad(){
        return "El nombre es: "+this.nombre +" y la Edad es: "+ this.edad;
    },
    

}

console.log(persona3.nombreEdad)
console.log(persona3.lang)
persona3.lang = "en";
console.log(persona3.lang)

//No es necesario crear clases para trabajar con objetos
//Funciona similar a un constructor
function Persona4(nombre = 'Luis', apellido, email){//CONSTRUCTOR
    this.nombre = nombre;
    this.apellido = apellido;
    this.email = email;

    this.nombreCompleto = function(){
        return this.nombre+' '+this.apellido;
    }
}

let padre = new Persona4('Leo', 'Lopez', 'llopez@gmail.com');
padre.nombre = 'Luis'; //Modificamos el nombre
console.log(padre);

let madre = new Persona4('Laura', 'Contreras', 'lcontretas@gmail.com');
console.log(madre);

console.log(padre.nombreCompleto());
console.log(madre.nombreCompleto());


//DIstintas formas de crear objetos

//Caso objeto N°1
let miObjeto = new Object(); //Esta es una opcion formal
//Caso objeto N°2
let miObjeto2 = {};//Esta opcion es breve y recomendada

//Caso String N°1
let miCadena1 = new String('Hola');//Sintaxis Formal
//caso String N°2
let miCadena2 = 'Hola';//Esta es la sintaxis simplificada y recomendada

//Caso con numeros N°1
let miNumero = new Number(1); //Es formal no recomendable
//Caso con numeros N°2
let miNumero2 = 1; //Sintaxis recomendada

//Caso con booleanos N°1
let miBoolean = new Boolean(false); //Formal
//Caso con Bolleanos N°2
let miBoolean2 = false; //Sintaxis Recomendada

//Caso arreglos 1
let miArreglo = new Array();
//Caso arreglos 2
let miArreglo2 = [];

//caso funciones 1
let miFuncion = new function(){}; //Todo despues de new es objeto
//caso funciones 2
let miFuncion2 = function(){};

console.log("USO DE PROTOTYPE")
//Uso de Prototype

//Creamos una nueva propiedad
padre.telefono = '5492624157268';
console.log(padre.telefono);
console.log(madre.telefono);


//Uso de Prototype -->Agremaos telefono a todos los objetos de persona4
Persona4.prototype.telefono = '5492682479';
console.log(padre.telefono);
console.log(madre.telefono);


console.log("USO DE CALL")
//Uso de call
let persona5 = {
    nombre: 'Juan',
    apellido: 'Perez',
    nombreCompleto2: function(titulo, telefono){
        return titulo +': '+this.nombre +' '+this.apellido+' '+telefono;
    },

}

let persona6 = {
    nombre: 'Carlos',
    apellido: 'Lara',
}

console.log(persona5.nombreCompleto2('Licenciado', '2625587931'));
console.log(persona6);
console.log(persona5.nombreCompleto2.call(persona6, 'Ingeniero', '2604575921'));

console.log("USO DE APPLY")
//Uso de metodo APPLY

let persona7 = {
    nombre: 'Juan',
    apellido: 'Perez',
    nombreCompleto2: function(titulo, telefono){
        // return this.nombre +' '+ this.apellido
        return titulo +': '+this.nombre +' '+this.apellido+' '+telefono;
    },

}

console.log(persona7.nombreCompleto2('LIC.', '262458597547'));
let arreglo = ['Ingeniero', '25242582976321'];
console.log(persona7.nombreCompleto2.apply(persona6, arreglo));
//Existe una diferencia entre el call y apply: a call se le pasan los argumentos y a apply se le pueden pasar con un array.




















