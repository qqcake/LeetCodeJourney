package leetcode.editor.en.p1

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = mutableMapOf<Int, Int>()
        var value: Int
        nums.forEachIndexed { i, e ->
            value = target - e
            map[value]?.let {
                return intArrayOf(it, i)
            } ?: run {
                map.put(e, i)
            }
        }
        return intArrayOf()
    }
}
//leetcode submit region end(Prohibit modification and deletion)
