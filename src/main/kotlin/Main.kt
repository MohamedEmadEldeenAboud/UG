import java.lang.Integer.min
import java.util.*
import kotlin.math.abs
import kotlin.math.max
import kotlin.math.sqrt

// var input = Scanner(System.`in`)

fun main(){

    val input = Scanner(System.`in`)
    var n = input.nextInt()
    val s = input.next()

    println(abs(s.count { it == '1' }-s.count { it == '0' }))
}

/*

1 1
2 2
3 3
4 4
5 5
6 6
  7
  8
  9
  10
  11
  12

 */