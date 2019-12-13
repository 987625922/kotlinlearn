package learn

/**
 *  ?号 表示该变量可以为空
 *  !! 表示如果为空就不调用
 */
class Learn {

    var presenter: String? = null

    companion object {
        private fun newIntent(sum: Int): Int? {
            return sum
        }

        fun intentTo(sum: Int) {
        }
    }

}