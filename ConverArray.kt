// 형변환 예제
fun main() {
    var a: Int = 54321

    var b: Long = a.toLong()
    println(b)

    var intArr = arrayOf(1, 2, 3, 4, 5)

    var nullArr = arrayOfNulls<Int>(5) // 배열에 null값 할당

    intArr[2] = 8

    println(intArr[4])
    println(intArr[2])
}
