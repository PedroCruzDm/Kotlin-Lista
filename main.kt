
  class filme(nome:String,ano:Int,genero:String){
var nome:String= nome 
var ano: Int = ano
var genero: String= genero
  }
fun main() {
    val p2 =filme("Scott Pilgrim contra o Mundo",2010,"comedia ação romance fantasia")
    println(p2)
    


var p1=filme(nome="Scott Pilgrim contra o Mundo",ano=2010,genero="ação")

  println("${p1.nome} é o nome do filme")
  println("${p1.ano} lançado este ano")
  println("${p1.genero} esse são os generos do filme")
print("${p2.ano} e ${p2.genero} são a data e genero do filme")
}