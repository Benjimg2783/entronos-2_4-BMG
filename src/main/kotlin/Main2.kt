import kotlin.random.Random

fun randomArray():Array<Int?>{
    var array= arrayOfNulls<Int?>(20)
    for (i in array.indices){
        array[i]= Random.nextInt(0,100)
    }
    return array
}
fun main() {
    val array = randomArray()
    for (i in array.indices){
        if (array[i]!!%2==0) println(array[i])
    }
    repeat(20){ print('*') };println()
    array.sort()
    println(array.first())
    println(array.last())
    repeat(20){ print('*') };println()
    for (i in array.indices){
        if (array[i]!!%2!=0) array[i]= null
    }
    println(array.joinToString())
}