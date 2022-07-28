// A collection is a group of related items, like a list of words, or a set
// of employee records. The collection can have the items ordered or unordered,
// and the items can be unique or not. You've already learned about one type
// of collection, lists. Lists have an order to the items, but the items don't
// have to be unique.

fun main() {
    val numbers = listOf(0, 3, 8, 4, 0, 5, 5, 8, 9, 2)
    println("list:   ${numbers}")

    println("sorted: ${numbers.sorted()}")

    val setOfNumbers = numbers.toSet()
    println("set:    ${setOfNumbers}")


    //  set is a group of related items, but unlike a list, there can't be any
    // duplicates, and the order doesn't matter. An item can be in the set or not,
    // but if it's in the set, there is only one copy of it.
    val set1 = setOf(1,2,3)
    val set2 = setOf(3,2,1,0)

    // considered equal because they contain exactly the same set of items.
    println("$set1 == $set2: ${set1 == set2}")

    println("contains 7: ${setOfNumbers.contains(7)}")

    val set3 = setOf(1,2,3)
    val set4 = setOf(3,2,1,0)

    // intersect() or union()
    val set5 = set3.union(set4)
    println("set union:    ${set5}")
    

    val set6 = set3.intersect(set4)
    println("set intersect:    ${set6}")
    
    val peopleAges = mutableMapOf<String, Int>(
        "Fred" to 30,
        "Ann" to 23
    )
    println(peopleAges)

    peopleAges.put("Barbara", 42)
    peopleAges["Joe"] = 51
    println(peopleAges)
    peopleAges["Fred"] = 31
    println(peopleAges)

    peopleAges.forEach { print("${it.key} is ${it.value}, ") }
    println()

    // using .joinToString() will include character between each
    println(peopleAges.map { "${it.key} is ${it.value}" }.joinToString(", ") )
    println()

    // returns the items in a collection that match, based on an expressio
    val filteredNames = peopleAges.filter { it.key.length < 4 }
    println(filteredNames)

    // lambdas are function with no name that can immediately be used as an expression

    // function types, where you can define a specific type of function based on
    // its input parameters and return value. It appears in the following format:
    // Example Function Type: (Int) -> Int
    // { a: Int -> a * 3}
    // parameter -> function body

    val triple: (Int) -> Int = { a: Int -> a * 3 }
    println(triple(5))
    // special identifier it for the parameter of a lambda with a single parameter
    val tripleIt: (Int) -> Int = { it * 3 }
    println(tripleIt(5))


    // higher-order function means passing a function (in this case a lambda) to
    // another function, or returning a function from another function.

    peopleAges.filter { it.key.length < 4 }

    // sorted() sort a list of strings
    // sortedWith() sort the list by the length of the strings, you need to write
    // some code to get the length of two strings and compare them.

    val peopleNames = listOf("Fred", "Ann", "Barbara", "Joe")
    println(peopleNames)
    // sorted alphabetic 
    println(peopleNames.sorted())
    // stored by lenght
    // if str1 is shorter than str2, it will return a value less than 0. If str1
    // and str2 are the same length, it will return 0. If str1 is longer than str2,
    // it will return a value greater than 0. By doing a series of comparison between
    // two Strings at a time
    println(peopleNames.sortedWith { str1: String, str2: String -> str1.length - str2.length })
    val str1 = "banana"
    val str2 = "cherrrrrry"
    println(str1.length - str2.length)




}