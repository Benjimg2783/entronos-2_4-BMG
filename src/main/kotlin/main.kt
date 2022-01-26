fun aprobados(nota:Int){
    if ((nota>=0)&&(nota<5)) println("suspenso")
    else if ((nota>=5)&&(nota<7)) println("aprobado")
    else if ((nota>=7)&&(nota<9)) println("notable")
    else if ((nota>=9)&&(nota<=10)) println("sobresaliente")
    else println("El valor introducido no es correcto")
}
fun main(){
    aprobados(1)
    aprobados(5)
    aprobados(7)
    aprobados(9)
    aprobados(-2)
    aprobados(11)
}


