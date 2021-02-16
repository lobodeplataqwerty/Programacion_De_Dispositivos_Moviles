class Operaciones(x: Int, y:Int){

    var x : Int
    var y : Int
    var sum: Int
    var res: Int

    //constructor
    init{
        this.x = x
        this.y = y
        this.sum = 0
        this.res = 0
    }

    fun suma(){
        this.sum = this.x + this.y
    }
    fun resta(){
        this.res = this.x - this.y
    }

}

fun main () {
    println("Hola mundo\nIngresa dos valores numéricos:")
    print("x: ")
    var x = try {
        readLine()?.toInt() as Int
    }
    catch(_: NumberFormatException) {
        10
    }

    print("y: ")
    var y = try{
        readLine()?.toInt() as Int
    }catch( e: NumberFormatException){
        5
    }

    var op = Operaciones(x,y)
    op.suma()
    op.resta()
    println("Suma: "+op.sum)
    println("Resta: "+op.res)
}
