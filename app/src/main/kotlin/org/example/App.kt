package org.example

//constructor: clase especial que se ejecuta al crear un objeto de la clase
class Complejo(
    private var real: Double=0.0,
    private var imag: Double=0.0){
    //hacemos un constructor por defecto, para poder crear objetos sin pasar parametros
    fun inicializar(real:Double,imag:Double){
        this.real=real
        this.imag=imag
    }
    fun mostrar(){
        println(this.toString())// abrir y cerrar parentesis se usa para llamar una funcion
    }
    override fun toString():String{ //override: se sobrescribe con el mismo nombre, se puede usar para mostrar el numero complejo de una forma mas bonita
        return "(${real},${imag})"
    }
    fun sumar(otro: Complejo): Complejo {
        return Complejo(
            real + otro.real,
            imag + otro.imag
        )
    }
    fun restar(otros: Complejo): Complejo {
        return Complejo(
            real - otros.real,
            imag - otros.imag
        )
    }

    fun multiplicacion(otros: Complejo): Complejo {
        return Complejo(
            //(a·c - b·d , a·d + b·c)
            real * otros.real - imag * otros.imag,
            real * otros.imag + imag * otros.real
        )
    }

 fun division(otros: Complejo): Complejo {
    return Complejo(
        //( (a·c + b·d)/(c²+d²) , (b·c - a·d)/(c²+d²) )
        (real * otros.real + imag * otros.imag) / (otros.real * otros.real + otros.imag * otros.imag) , (imag*otros.real - real * otros.imag) / (otros.real * otros.real + otros.imag * otros.imag)) }

}

fun main() {
    var complejo: Complejo
    complejo= Complejo()
    complejo.inicializar(3.0,4.0)
    println("mi número complejo es ${complejo.toString()}")
    var c2:Complejo= Complejo(1.0,2.0) //gracias al constructor por defecto, podemos crear un objeto sin pasar parametros
    var c3: Complejo
    c3=complejo.sumar(c2)
    c3.mostrar()
    var c4: Complejo
    c4=complejo.restar(c2)
    c4.mostrar()
    var c5: Complejo
    c5=complejo.multiplicacion(c2)
    c5.mostrar()
    var c6: Complejo
    c6=complejo.division(c2)
    c6.mostrar()
}

