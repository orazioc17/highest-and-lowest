/*
This time I don't create a MostVotedSolution.kt file because my solution already match with that most voted solution
*/

fun highAndLow(numbers: String): String {
    
    // I convert the string to an ordered numbers list, so i can return the first and the last
    val numbersList : List<Int> = numbers.split(" ").map { it.toInt() }.sorted()

    return "${numbersList.last()} ${numbersList.first()}"
}
