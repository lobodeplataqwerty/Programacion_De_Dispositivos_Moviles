class Figuras(id:Int, dato_1:Double, dato_2:Double, dato_3:Double, dato_4:Double){

  var id : Int

  var pi : Double

  var base : Double
  var altura : Double
  var radio : Double
  var base_2 : Double
  var lado : Double

  var area : Double
  var perimetro : Double

  init{
    this.id = id
    this.base = dato_1
    this.altura = dato_2
    this.pi = 3.1416
    this.radio = dato_1
    this.base_2 = dato_3
    this.lado = dato_4

    this.area = 0.0
    this.perimetro = 0.0
  }

  fun calcular_area(){
    when(id){
      //circulo
      1 -> this.area = pi * (radio * radio)
      //triangulo equilatero
      2 -> this.area = (this.base * this.altura) / 2
      //cuadrado
      3 -> this.area = this.base * this.base
      //rectangulo
      4 -> this.area = this.base * this.altura
      //trapecio
      5 -> this.area = this.altura * ((this.base + this.base_2) / 2)
      //rombo
      6 -> this.area = (this.base * this.altura) / 2
      //default
      else -> this.area = 0.0
    }
  }

  fun calcular_perimetro(){
    when(id){
      //circulo
      1 -> this.perimetro = 2 * pi * radio
      //triangulo equilatero
      2 -> this.perimetro = this.base * 3
      //cuadrado
      3 -> this.perimetro = this.base * 4
      //rectangulo
      4 -> this.perimetro = 2 * (this.base + this.altura)
      //trapecio
      5 -> this.perimetro = this.base + this.altura + this.base_2 + this.lado
      //rombo
      6 -> this.perimetro = this.base * 4
      //default
      else -> this.perimetro = 0.0
    }
  }
}
fun main () {
  var op : Int
  var fig : Int

  var radio : Double
  var base : Double
  var altura : Double
  var lado : Double
  var base_2 : Double
  var D_may : Double
  var D_men : Double
  do{

    do{
      print("====================\n=Figuras geoetricas=\n====================\n\n Menú de opciones\n1)-Calcular áreas\n2)-Calcular perimetros\n3)-Salir\n\nOpción:")
      op = try {
          readLine()?.toInt() as Int
      }
      catch(_: NumberFormatException) {
          -1
      }
      if(op == -1 || op > 3 || op == 0){
        println("Error... Opción no existente vuelva a intentar\n")
      }
    }while(op > 3 || op == 0 || op == -1)

    if(op != 3){
      do{
        if (op == 1) {
          println("\n- Áreas - Menú -\n")
        }else{
          println("\n- Perimetros - Menú -\n")
        }
        print("1)-Circulo\n2)-Triangulo equilatero\n3)-Cuadrado\n4)-Rectangulo\n5)-Trapecio\n6)-Rombo\n\nOpción:")
        fig = try {
            readLine()?.toInt() as Int
        }
        catch(_: NumberFormatException) {
            -1
        }
        if(fig == -1 || fig > 6 || fig == 0){
          println("Error... Opción no existente vuelva a intentar\n")
        }
      }while(fig > 6 || fig == 0 || fig == -1)

      if (op == 1){ //Area
        if(fig == 1){ //Circulo
          print("\n\nÁrea de un Circulo.\nFormula: Área = PI * Radio^2\n\nRadio:")
          radio = try{
              readLine()?.toDouble() as Double
          }catch( e: NumberFormatException){
              0.0
          }
          var fa1 = Figuras(1,radio,0.0,0.0,0.0)
          fa1.calcular_area()
          println("\nRespuesta:" + fa1.area + "\n")
        }else if(fig == 2){ //Triangulo
          print("\n\nÁrea de un Triangulo equilatero.\nFormula: Área = (Base * Altura) / 2\n\nBase:")
          base = try{
              readLine()?.toDouble() as Double
          }catch( e: NumberFormatException){
              0.0
          }
          print("Altura:")
          altura = try{
              readLine()?.toDouble() as Double
          }catch( e: NumberFormatException){
              0.0
          }
          var fa2 = Figuras(2,base,altura,0.0,0.0)
          fa2.calcular_area()
          println("\nRespuesta:" + fa2.area + "\n")
        }else if(fig == 3){ //Cuadrado
          print("\n\nÁrea de un Cuadrado.\nFormula: Área = Lado^2\n\nLado:")
          lado = try{
              readLine()?.toDouble() as Double
          }catch( e: NumberFormatException){
              0.0
          }
          var f2 = Figuras(3,lado,0.0,0.0,0.0)
          f2.calcular_area()
          println("\nRespuesta:" + f2.area + "\n")
        }else if(fig == 4){ //Rectangulo
          print("\n\nÁrea de un Rectangulo.\nFormula: Área = Base * Altura\n\nBase:")
          base = try{
              readLine()?.toDouble() as Double
          }catch( e: NumberFormatException){
              0.0
          }
          print("Altura:")
          altura = try{
              readLine()?.toDouble() as Double
          }catch( e: NumberFormatException){
              0.0
          }
          var fa4 = Figuras(4,base,altura,0.0,0.0)
          fa4.calcular_area()
          println("\nRespuesta:"+fa4.area+"\n")
        }else if (fig == 5){ //Trapecio
          print("\n\nÁrea de un Trapecio.\nFormula: Área = ((Base_M + Base_m) / 2) * Altura\n\nBase mayor:")
          base = try{
              readLine()?.toDouble() as Double
          }catch( e: NumberFormatException){
              0.0
          }
          print("Base menor:")
          base_2 = try{
              readLine()?.toDouble() as Double
          }catch( e: NumberFormatException){
              0.0
          }
          print("Altura:")
          altura = try{
              readLine()?.toDouble() as Double
          }catch( e: NumberFormatException){
              0.0
          }
          var fa5 = Figuras(5,base,altura,base_2,0.0)
          fa5.calcular_area()
          println("\nRespuesta:"+fa5.area+"\n")
        }else{ // Rombo
          print("\n\nÁrea de un Rombo.\nFormula: Área = (Diagonal_mayor * Diagonal_menor) / 2\n\nDiagonal mayor:")
          D_may = try{
              readLine()?.toDouble() as Double
          }catch( e: NumberFormatException){
              0.0
          }
          print("\nDiagonal menor:")
          D_men = try{
              readLine()?.toDouble() as Double
          }catch( e: NumberFormatException){
              0.0
          }
          var fa6 = Figuras(6,D_may,D_men,0.0,0.0)
          fa6.calcular_area()
          println("\nRespuesta:"+fa6.area+"\n")
        }
      }else{ //Perimetro
        if(fig == 1){ //Circulo
          print("\n\nPerimetro de un Circulo.\nFormula: Perimetro = 2 * PI Radio\n\nRadio:")
          radio = try{
              readLine()?.toDouble() as Double
          }catch( e: NumberFormatException){
              0.0
          }
          var fp1 = Figuras(1,radio,0.0,0.0,0.0)
          fp1.calcular_perimetro()
          println("\nRespuesta:" + fp1.perimetro + "\n")
        }else if(fig == 2){ //Triangulo
          print("\n\nPerimetro de un Triangulo equilatero.\nFormula: Perimetro = Lado * 3\n\nLado:")
          lado = try{
              readLine()?.toDouble() as Double
          }catch( e: NumberFormatException){
              0.0
          }
          var fp2 = Figuras(2,lado,0.0,0.0,0.0)
          fp2.calcular_perimetro()
          println("\nRespuesta:" + fp2.perimetro + "\n")
        }else if(fig == 3){ //Cuadrado
          print("\n\n Perimetro de un Cuadrado.\nFormula: Perimetro = Lado * 4\n\nLado:")
          lado = try{
              readLine()?.toDouble() as Double
          }catch( e: NumberFormatException){
              0.0
          }
          var fp3 = Figuras(3,lado,0.0,0.0,0.0)
          fp3.calcular_perimetro()
          println("\nRespuesta:" + fp3.perimetro + "\n")
        }else if(fig == 4){ //Rectangulo
          print("\n\nPerimetro de un Rectangulo.\nFormula: Perimetro = 2 * (Base + Altura)\n\nBase:")
          base = try{
              readLine()?.toDouble() as Double
          }catch( e: NumberFormatException){
              0.0
          }
          print("Altura:")
          altura = try{
              readLine()?.toDouble() as Double
          }catch( e: NumberFormatException){
              0.0
          }
          var fp4 = Figuras(4,base,altura,0.0,0.0)
          fp4.calcular_perimetro()
          println("\nRespuesta:" + fp4.perimetro + "\n")
        }else if (fig == 5){ //Trapecio
          print("\n\nPerimetro de un Trapecio.\nFormula: Perimetro = Lado_a + Lado_b + Lado_c + Lado_d\n\nLado_a:")
          var lado_a : Double = try{
              readLine()?.toDouble() as Double
          }catch( e: NumberFormatException){
              0.0
          }
          print("Lado_b:")
          var lado_b : Double = try{
              readLine()?.toDouble() as Double
          }catch( e: NumberFormatException){
              0.0
          }
          print("Lado_c:")
          var lado_c : Double = try{
              readLine()?.toDouble() as Double
          }catch( e: NumberFormatException){
              0.0
          }
          print("Lado_d:")
          var lado_d : Double = try{
              readLine()?.toDouble() as Double
          }catch( e: NumberFormatException){
              0.0
          }
          var fp5 = Figuras(5,lado_a,lado_b,lado_c,lado_d)
          fp5.calcular_perimetro()
          println("\nRespuesta:" + fp5.perimetro + "\n")
        }else{ // Rombo
          print("\n\n Perimetro de un Rombo.\nFormula: Perimetro = Lado * 4\n\nLado:")
          lado = try{
              readLine()?.toDouble() as Double
          }catch( e: NumberFormatException){
              0.0
          }
          var fp6 = Figuras(6,lado,0.0,0.0,0.0)
          fp6.calcular_perimetro()
          println("\nRespuesta:" + fp6.perimetro + "\n")
        }
      }
    }else{
      println("\nGracias por usar este programa, adios... :)")
    }

    }while(op != 3)
}
