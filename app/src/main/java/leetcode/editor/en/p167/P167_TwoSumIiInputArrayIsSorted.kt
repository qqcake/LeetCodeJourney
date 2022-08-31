package leetcode.editor.en.p167

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        var (l, r) = Pair(0, numbers.size - 1)
        var sum: Int
        while (l <= r) {
            sum = numbers[l] + numbers[r]
            when {
                sum == target -> return intArrayOf(l.inc(), r.inc())
                sum > target -> r--
                sum < target -> l++
            }
        }
        return intArrayOf()
    }
}
//leetcode submit region end(Prohibit modification and deletion)
