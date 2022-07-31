object test {
  def main(args: Array[String]): Unit = {

    // 将int值130强转为byte  值为多少
    // 0000 0000 ..16.. 1000 0010   => 表示int的130
    val i4 = 130

    // 1000 0010
    println(i4.toByte)
  }
}
