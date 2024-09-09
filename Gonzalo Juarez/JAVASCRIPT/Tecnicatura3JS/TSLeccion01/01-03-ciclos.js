// WHILE
let contador = 0;
while (contador < 3) {
    console.log(contador);
    contador++;
}
console.log("Fin del ciclo while");

// DO WHILE
let conteo = 0;
do {
    console.log(conteo);
    conteo++;
} while (conteo < 3);
console.log("Fin del ciclo do while");

// FOR
for (let contando = 0; contando < 3; contando++) {
    console.log(contando);
}
console.log("Fin del ciclo for");

// Palabra reservada BREAK
for (let contando = 0; contando <= 10; contando++) {
    if (contando % 2 == 0) {
        console.log(contando); // Muestra todos los pares
        break;
        // en caso de no poner el break, se ejecuta todo el ciclo
        // 0 2 4 6 8 10
    }
}
console.log("Termina el ciclo al encontrar el primer número par");

// Palabra reservada CONTINUE 
for (let contando = 0; contando <= 10; contando++) {
    if (contando % 2 !== 0) {
        continue; // Ir a la siguiente iteración
        // de no poner el continue, mostraria todos los números
    }
    console.log(contando); // Muestra todos los pares
}   
console.log("Termina el ciclo");

// ETIQUETAS LABELS
// no es recomendable usas estas etiquetas //

inicio:
for (let contando = 0; contando <= 10; contando++) {
    if (contando % 2 !== 0) {
        continue inicio;
    }
    console.log(contando); // Muestra todos los impares
}

