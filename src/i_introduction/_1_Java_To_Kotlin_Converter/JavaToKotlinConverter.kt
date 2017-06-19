package i_introduction._1_Java_To_Kotlin_Converter

import util.TODO

fun todoTask1(collection: Collection<Int>): Nothing = TODO(
    """
        Task 1.
        Rewrite JavaCode1.task1 in Kotlin.
        In IntelliJ IDEA, you can just copy-paste the code and agree to automatically convert it to Kotlin,
        but only for this task!
    """,
    references = { JavaCode1().task1(collection) })


fun task1(collection: Collection<Int>): String {
    todoTask1(collection)
}

fun task1Answer(collection: Collection<Int>): String {

    val returnString: StringBuilder = StringBuilder("{") //start off with open braces
    val collectionIterator: Iterator<Int> = collection.iterator()

    while(collectionIterator.hasNext()) {
        returnString.append(collectionIterator.next())

        if(collectionIterator.hasNext()) {
            returnString.append(", ")
        }
    }

    returnString.append("}")

    return returnString.toString()
}

fun main(args: Array<String>) {
    val intCollection: Collection<Int> = listOf(1, 2, 3, 6, 4, 5)
    println(task1Answer(intCollection))
}