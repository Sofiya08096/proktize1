fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

//задача1
fun main(args: Array<String>)
    val exercises: Int=13
    var excercisesSolver: Int=0
    excercisesSolver += 1




//задача2
fun main(args: Array<String>)
    val myAge:Int=18;
    exercisesSolved++;



//задача3
fun main(args: Array<String>)
    var srAge:Double=18.0;
    srAge=(srAge+30)/2;
    exercisesSolved++;



//задача4
fun main(args: Array<String>)
    val testNumber:Int=5;
    val  evenOdd:Int=testNumber%2;
    exercisesSolved++;



//задача5
fun main(args: Array<String>)
    var answer:Int=0;
    answer=(((answer+1)+10)*10)shr 3;
    exercisesSolved++;
    println(answer);




//задача6
fun main(args: Array<String>)
    var age: Int  // здесь var, не val
    age = 16
    print (age)
    age = 30
    print(age)
    exercisesSolved++;


//задача7
fun main(args: Array<String>)
    val a: Int = 46
    val b: Int = 10
    val answer1: Int = (a * 100) + b
    val answer2: Int = (a * 100) + (b * 100)
    val answer3: Int = (a * 100) + (b / 10)

//задача8
fun main(args: Array<String>)
    (5 * 3) - ((4 / 2) * 2)
    exercisesSolved++;


//задача9
fun main(args: Array<String>)
    val x: Double = 7.5
    val y: Double = 5.0
    val average: Double = (x + y) / 2
    exercisesSolved++;


//задача10
fun main(args: Array<String>)
    val fahrenheit: Double = 121.0
    val celcius: Double = (fahrenheit - 32) / 1.8
    exercisesSolved++;


//задача11
fun main(args: Array<String>)
    val position: Int = 54
    val row: Int = position / 8
    val column: Int = position % 8
    exercisesSolved++;




import kotlin.math.*
//задача12
fun main(args: Array<String>)
    val degrees: Double = 360.0
    val radians: Double = (degrees / 180) * PI
    exercisesSolved++;


import kotlin.math.*
//задача13
fun main(args: Array<String>) {
    val x1: Double = 1.0
    val y1: Double = 1.0
    val x2: Double = 3.0
    val y2: Double = 3.0
    val distance:Double=Math.sqrt(Math.pow((x2-x1),2.0)+Math.pow((y2-y1),2.0));
    exercisesSolved++;
    println(exercisesSolved);
}