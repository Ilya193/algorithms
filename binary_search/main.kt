data class Result(
    val index: Int,
    val count: Int
)

fun binarySearch(list: List<Int>, item: Int): Result? {
    var low = 0
    var high = list.size - 1

    var index = -1
    var count = 0

    while (low <= high) {
        var mid = (low + high) / 2
        var res = list[mid]

        count++

        if (res == item) {
            index = mid
            break
        }
        else if (res < item) low = mid + 1
        else high = mid - 1

    }

    if (index == -1) return null
    return Result(index, count)
}


fun main() {
    println(binarySearch(listOf(1, 2, 3, 4, 5), 1))
}