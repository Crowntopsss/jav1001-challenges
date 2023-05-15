package challenges

/* Write a function that takes in an integer list as a parameter and returns a new list
 * of the same length with the squares of the original integers sorted in ascending order.
 * Verify your code by running SortedSquaresTester.run() in main. 
 *
 * Assumptions: The incoming list is sorted in ascending order and not empty.
 * Sample Input:  [2, 3, 5, 7, 9]
 * Sample Output: [4, 9, 25, 49, 81]
 */

fun sortedSquares(list: List<Int>): List<Int> {
    val n = list.size
    val result = MutableList(n) { 0 }
    var left = 0
    var right = n - 1
    var index = n - 1
    
    while (left <= right) {
        val leftSquare = list[left] * list[left]
        val rightSquare = list[right] * list[right]
        
        if (leftSquare > rightSquare) {
            result[index] = leftSquare
            left++
        } else {
            result[index] = rightSquare
            right--
        }
        
        index--
    }
    
    return result
}