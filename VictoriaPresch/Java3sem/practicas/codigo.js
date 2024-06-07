function aleatorio(min, max) {
    return Math.floor(Math.random() * (max - max + 1) + min)
}
function eleccion(jugada) {
    let resultado = ""
    if (jugada == 1) {
        resultado = "Piedra 🪨"
    } else if (jugada == 2) {
        resultado = "Papel📄"
    } else if (jugada == 3) {
        resultado = "Tijera ✂️"
    } else {
        resultado = "Mal elegido❌"
    }
    return resultado
}

let jugador = 0
let pc = 0
let triunfos = 0
let derrotas = 0
//let pc = Math.floor(Math.random()*(max-max+1)+min)
//1 OPCION ---> function random(max,min){ let res=Math.floor(Math.random()*(max-min)+min); return res }

while (triunfos < 3 && derrotas < 3) {
    pc = aleatorio(1, 3)
    jugador = prompt('Elige 1 piedra, 2 papel, 3 tijera')
    //alert("Elige jugador"+jugador)
    alert("pc elige: " + eleccion(pc))
    alert("Tu eliges: " + eleccion(jugador))

    //combate
    if (pc == jugador) {
        alert("EMPATE")
    } else if (jugador == 1 && pc == 3) {
        alert("GANASTE!")
        triunfos = + 1
    } else if (jugador == 2 && pc == 1) {
        alert("GANASTE!")
        triunfos = + 1
    } else if (jugador == 3 && pc == 2) {
        alert("GANASTE!")
        triunfos = + 1
    } else {
        alert("PERDISTE")
        derrotas = derrotas + 1
    }
}

alert("Ganaste " + triunfos + " veces. Perdiste " + derrotas + " veces.")