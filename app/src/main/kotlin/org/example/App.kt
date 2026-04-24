package org.example

/*
Trabajo practico 2026 - Ejercicio 1 - Clase Complejo (MIO)
class Complejo {
    private var real: Int = 3 //no me deja poner private "val" porque necesito modificarlo con el metodo poner_valor_real
    private var imaginario: Int = 4 
    fun poner_valor_real(real:Int){
       this.real = real 
    }
    fun obtener_valor_real(): Int{
        return real
    }
    fun poner_valor_imaginario(imaginario:Int){
       this.imaginario = imaginario
    }
    fun obtener_valor_imaginario(): Int{
        return imaginario
    }
    fun resultado(): String{
        return "($real, $imaginario)"
    }
}

fun main() {
    val complejo:Complejo
    complejo = Complejo()
    println(complejo.resultado())
}
*/

//Trabajo practico 2026 - Ejercicio 1 - Clase Complejo (PROFE)
class Complejo {
    private var real: Int = 0
    private var imaginario: Int = 0
    fun inicializar ( real: Int, imaginario: Int) {
        this.real = real
        this.imaginario = imaginario
    }
    fun enString(): String {
        return "(${this.real}, ${this.imaginario})"
    }
//    fun mostrar(){
//        println("(${this.real}, ${this.imaginario})") //en este caso si ponemos this.real o real solo va a ser lo mismo
//    }
}
/*
fun main() {
    var complejo: Complejo
    complejo = Complejo()
    complejo.inicializar(3, 4)
//    complejo.mostrar()
    println("Mi complejo: ${complejo.enString()}") //con esto andaria bien, pero abajo voy a hacer otro println con una pregunta del profe

}
*/
fun mainn() {
    var c1: Complejo = Complejo()
    var c2: Complejo = Complejo()
    c1.inicializar(1, 2)
    c2.inicializar(3, 4)
    var c3: Complejo
    // c3 = c1 + c2 ?  //esto lo dejo en las barras porque no tiene sintaxis
    println (c3.enString())
}

// 2026-numeros-complejos

// Clase Complejo - Ejercicio

// Descripción

// Se pide crear una clase llamada `Complejo` que represente un número complejo.

// Requisitos

//1. **Atributos privados**: La clase debe tener dos atributos privados:
//    - `real`: parte real del número complejo
//    - `imaginario`: parte imaginaria del número complejo

//2. **Método para mostrar**: Implementar una función que retorne el número complejo en formato:
//    ```
//    (real, imaginario)
//    ```

// 3. **Ejemplo de uso**

// ```python
// c = Complejo(3, 4)
// print(c.mostrar())  # Salida: (3, 4)
//```     