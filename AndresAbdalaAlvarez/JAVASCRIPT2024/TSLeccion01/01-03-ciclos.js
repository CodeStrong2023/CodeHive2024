//Ciclo While
let contador = 0;
while(contador < 3){
    console.log(contador);
    contador++;
}

console.log("Fin del Ciclo WHILE")

//Ciclo Do-While

let conteo = 0;
do{
    console.log(conteo);
    conteo++;
}while(conteo < 3);

console.log("Fin del Ciclo DO-WHILE")

//Ciclo FOR
for(let contando = 0; contando < 3; contando++){
    console.log(contando);
};

console.log("Fin ciclo FOR");

//Palabra reservada BREAK
for(let contando = 0; contando <= 10; contando++){
    if(contando % 2 == 0){
        console.log(contando); //Mostramos todos los pares
        break;
    }
};

console.log("Termina el ciclo al encontrar los pares")

//Palabra reservada CONTINUE
for(let contando = 0; contando <= 10; contando++){
    if(contando % 2 !== 0){
        continue; //Continua a la siguiente iteracion
    }else{
        console.log(contando); //Mostramos todos los pares
    }
};
console.log("Termina el ciclo")

//Etiquetas Labels
//El uso de etiquetas nos permite ir a partes del programa que nosotros queremos

inicio:
for(let contando = 0; contando <= 10; contando++){
    if(contando % 2 !== 0){
        break inicio; //Continua a la siguiente iteracion
    }else{
        console.log(contando); //Mostramos todos los pares
    }
};
console.log("Termina el ciclo")

//Las etiquetas Labels no se recomiendan, tenemos que saber de que se tratan pero no se usan













