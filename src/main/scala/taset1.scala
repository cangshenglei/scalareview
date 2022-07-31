object taset1 {
  def main(args: Array[String]): Unit = {
    def sumxy1(x :Int):Int => Int=x+_
    val a=sumxy1(2)
    println(a)
  }
}
