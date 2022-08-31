fun main() {
    val people = "Людям"
    val man = "Человеку"
    var like = 0
    fun printLikes(): String {
        if (like % 10 != 1 || like % 100 == 11) return people else return man
    }
    while (true) {
        like += 1
        Thread.sleep(100)
        println("Понравилось " + like + " " + printLikes())
    }
}