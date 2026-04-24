# 2026-numeros-complejos

# Clase Complejo - Ejercicio

## Descripción

## Se pide crear una clase llamada `Complejo` que represente un número complejo.

## Requisitos

1. **Atributos privados**: La clase debe tener dos atributos privados:
##    - `reale`: parte real del número complejo
##    - `imaginario`: parte imaginaria del número complejo

2. **Método para mostrar**: Implementar una función que retorne el número complejo en formato:
##    ```
##    (real, imaginario)
##    ```

## 3. **Ejemplo de uso**

## ```python
## c = Complejo(3, 4)
## print(c.mostrar())  # Salida: (3, 4)
## ```     

package org.example

class App {
    private var a: String = "Hola" //declaramos una variable de tipo String, si la dejamos es val este valor va a ser inmutable y no va a poder cambiar si la reedefinimos, al dejarlo en var podemos reescribir la variable a
    fun ponerValor(a:String){
       this.a = a //asignamos el valor de la variable a con el valor que se le pasa a la función ponerValor, si la variable a es de solo lectura (val) no se puede cambiar su valor, aunque si la cambiamos a var, se puede reedefinir el valor de a.
    }
    fun obtenerValor(): String{ //declaramos una función que devuelve un String, esta función va a retornar el valor de la variable a
        return a
    }
}

fun main() {
    val app:App //declaramos una variable de tipo App
    app = App() //asi podemos crear un objeto de la clase App
    println(app.obtenerValor()) //imprimimos el valor de la variable a
    app.ponerValor("Mundo") //esto no se puede hacer porque la variable a es de solo lectura (val), aunque su lo cambiamos a var, se puede reedefinir el valor de a.
    println(app.obtenerValor()) //imprimimos el nuevo valor de la variable a si es que definimos la variable como (var)
}