//----------------------------------------------------------------------------Arreglos o Arrays----------------------------------------------------------------------------
let autos_ejemplo = new Array('Ferrari', 'Ranault', 'BMW'); //Sintaxis vieja o antigua
//Un arreglo puede guardar distintos tipos

//Forma nueva o actual
const autos = ['Ferrari', 'Ranault', 'BMW']; //por const nos referimos al espacio en memoria donde creamos el arreglo
console.log(autos)

//Recorremos los elementos de un arreglo
//Los arrays comienzan desde 0
console.log(autos[0]);
console.log(autos[2])

for(let i = 0; i < autos.length; i++){
    console.log(i + "->" + autos[i]);
}

//Modificar los elementos del arreglo
autos[1] = 'Volvo'; //Cambiamos la posicion 1 renaul por volvo
console.log(autos)

//agregamos nuevos valores al arreglo
autos.push('Audi'); //El push nos agrega el elemento al final
console.log(autos)

//Otras formas de agregar elementos al arreglo
autos[autos.length] = 'Porche';
console.log(autos)


//Otra forma **(Tener cuidado)**
autos[6] = 'Renault';
console.log(autos)
//Cuidado con el lugar vacio o undefined


//Como preguntar si es un array o arreglo
console.log(Array.isArray(autos)) //Devuelve un booleano


//Otra manera para saber si es un array
console.log(autos instanceof Array) //Preguntamos si la variable es una instancia de la clase Array
















