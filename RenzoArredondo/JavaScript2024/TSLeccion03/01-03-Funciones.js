//Codigo reutilizable
miFuncion(6, 7);
//Hosting: podemos definir nuestra funcion en cualquier parte del programa y llamarla antes o despues.

function miFuncion(a, b){
    //console.log("Sumamos: "+(a + b)); //Se paramos para que no se tome como texto
    return a + b;
} 
//Llamamos a nuestra funcion
miFuncion(5, 4);

let resultado = miFuncion(3, 7)
console.log(resultado)

//FUnciones de tipo expresion: funciones anonimas o de tipo expresion
//declaramos la funcion de tipo expresion
let x = function(a, b){return a + b}; //Necesita cierra con punto y coma
resultado = x(14, 15);
console.log(resultado);

//Funciones de tipo self y invoking
(function(a, b){
    console.log("Ejecutando la funcion: "+(a + b));
})(9, 10); //No se puede reutilizar - Puede ser util a veces... 

//Tipo de funcion
console.log(typeof miFuncion)
function miFuncion2(a, b){
    console.log(arguments);
    console.log(arguments.length);
    //Para utilizar arguments debemos estar dentro de la funcion
} 

miFuncion2(5, 7, 4);//podemos poner mas argumentos............ 

//toString
var miFuncionTexto = miFuncion2.toString();
console.log(miFuncionTexto);


//arrow functions o funciones => flechas <=
//No se utiliza la palabra reservada function, no se utilizan las llaves y no se utiliza return
const sumarFuncionFlecha = (a, b) => a + b;

//resultado = sumarFuncionFlecha(3, 7); <<- asignamos el valor a una variable
console.log(sumarFuncionFlecha(8, 9));


//Cuando definimos una funcion function miFuncion(a, b) => el a y b son los parametros
// y cuando vamos a utilizar la funcion y agregamos numeros, esos van a ser los argumentos


//Funcion tipo expresion
let sumar = function(a = 4, b = 8){
    console.log(arguments[0]); //Muestra el parametro de a
    console.log(arguments[1]); //Muestra el parametro de b
    console.log(arguments[2]);
    return a + b;
}
//EN JAVASCRIPT NO ES NECESARIO QUE COINCIDAN EL NUMERO DE ARGUMENTOS CON EL NUMERO DE PARAMETROS
resultado = sumar(3);
console.log(resultado);

//HOISTING: llamar a la funcion antes de ser definida
let respuesta = sumarTodo(5, 4, 13, 10, 9);
console.log(respuesta);

//Sumar todos los argumentos
function sumarTodo(){
    let suma = 0;
    for(let i = 0;i < arguments.length; i++){
        suma += arguments[i]; //arguments es para arreglos
    }
    return suma
}

//Paso por valor <-----------------------------------------------------
//Tipos primitivos

let k = 10;
function cambiarValor(a){ //Paso por valor
    a = 20;
}

//EN EL PASO POR VALOR LA VARIABLE NO SUFRE NINGUN CAMBIO<-------------
cambiarValor(k);
console.log(k)

//Paso por referencia <-----------------------------------------------------
//Al parecer funciona con objectos**
const persona = {
    nombre: 'Juan',
    apellido: 'Lepez'
}

function cambiarValorObjeto(p1){
    p1.nombre = 'Ignacio';
    p1.apellido = 'Perez';

}

//Paso por referencia -->
console.log(persona)
cambiarValorObjeto(persona);
console.log(persona)




