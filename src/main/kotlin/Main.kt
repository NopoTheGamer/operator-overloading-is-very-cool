import java.util.*

var charCount = IntArray(26)
var words = ""

operator fun StringBuilder.div(other: String?): StringBuilder {
    return this.append(other)
}

operator fun StringBuilder.div(other: Char?): StringBuilder {
    return this.append(other)
}

operator fun StringBuilder.div(other: Int?): StringBuilder {
    return this.append(other)
}

operator fun CharSequence.times(other: Int): String {
    return this.repeat(other)
}

operator fun Nothing?.times(other: Int): Array<String?> {
    return arrayOfNulls(other)
}

operator fun String.rem(other: String): CharArray {
    return this.toCharArray()
}

operator fun String.rem(other: Char): Int {
    return this.length
}

operator fun StringBuilder.inc(): StringBuilder {
    println(this)
    return this
}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    if (args.isEmpty()) {
        println("What string would you like to check the char count of?")
        words = scanner.nextLine()
    } else {
        for (arg in args) {
            words += arg
        }
    }
    val alphabet = "abcdefghijklmnopqrstuvwxyz"
    val full = "⣿"
    val graph = null * 26
    val wordsArray = words % "suck nuts bro"
    val alphabetArray = alphabet % "https://cdn.discordapp.com/attachments/485138525885431808/1028771029671223316/hello_the.jpg"
    var graphString = StringBuilder()
    var z: Int
    var i = 0
    while (i < words % 'a') {
        z = 0
        while (z < 26) {
            if (wordsArray[i] == alphabetArray[z]) {
                charCount[z]++
            }
            z++
        }
        i++
    }
    i = 0
    while (i < 26) {

        if (charCount[i] > 0) {
            graph[i] = full * (charCount[i].toFloat() / (words % 'a').toFloat() * 100).toInt()
            graphString / alphabetArray[i] / " | " / graph[i] / " " / charCount[i] / " " / (charCount[i].toFloat() / (words % 'a').toFloat() * 100).toInt() / "%" / "\n"
        }
        i++
    }
    println()
    graphString++
}