import scala.collection.parallel.immutable

object liuchengkongzhi {
  def main(args: Array[String]): Unit = {
    /*  分支控制if-else
    让程序有选择的的执行，分支控制有三种：单分支、双分支、多分支*/

    /// Scala中if else表达式其实是有返回值的，具体返回值取决于满足条件的代码体的最后一行内容。


    //需求3：Scala中返回值类型不一致，取它们共同的祖先类型
    //需求4：Java中的三元运算符可以用if else实现
    //如果大括号{}内的逻辑代码只有一行，大括号可以省略。如果省略大括号，if只对最近的一行逻辑代码起作用


    /*    Switch分支结构
    在Scala中没有Switch，而是使用模式匹配来处理。
    模式匹配涉及到的知识点较为综合，因此我们放在后面讲解。*/


    //   For循环控制
    //   Scala也为for循环这一常见的控制结构提供了非常多的特性，这些for循环的特性被称为for推导式或for表达式。


    // scala中的for循环基础语法
    for (i <- 0 to 5) {
      println(i)
    }

    for (i <- 0 until 5) {
      println(i)
    }

    // for循环的本质
    // to是整数的方法  返回结果是一个集合
    // 使用变量i 循环遍历一遍 后面集合的内容
    val inclusive: Range.Inclusive = 0.to(5)

    // 增强for循环
    for (i <- Array(1, 2, 3, 4)) {
      println(i)


    }

   /* 补充语法有：
    （1）循环守卫
    （2）循环步长
    （3）嵌套循环
    （4）引入变量
    （5）循环返回值
    （6）倒序打印*/

    // 循环守卫
    for (i <- 0 to 10) {
      if (i > 5) {
        println(i)
      }
    }

    for (i <- 0 to 10 if i > 5) {
      println(i)
    }

    // 循环步长
    for (i <- 0 to 10 by 2) {
      println(i)
    }

    for (i <- 0.0 to 10 by 0.1) {
      println(i)
    }

    for (i <- 10 to 0 by -1) {
      println(i)
    }

    // 嵌套循环
    for (i <- 0 to 4) {
      for (j <- 0 to 3) {
        print(s"$i : $j \t")
      }
      println()
    }


    for (i <- 0 to 4; j <- 0 to 3) {
      print(s"$i : $j \t")
      if (j == 3) {
        println()
      }
    }

    // 引入变量
    for (i <- 0 to 4) {
      val j = i * 2 + 18
      println(j)
    }


    for (i <- 0 to 4; j = i * 2 + 18) {
      println(j)
    }

    for {i <- 0 to 4
         j = i * 2 + 18} {
      println(j)
    }

 /*   // 循环返回值
    val ints: immutable.IndexedSeq[Int] = for (i <- 0 to 3) yield {
      10
    }*/

    // 倒序打印
    for (i <- 0 to 10 reverse){
      println(i)
    }

   /* While和do..While循环控制
    While和do..While的使用和Java语言中用法相同。
    4.5.1 While循环控制
      1）基本语法
    循环变量初始化
    while (循环条件) {
      循环体(语句)
      循环变量迭代
    }
    说明：
    （1）循环条件是返回一个布尔值的表达式
    （2）while循环是先判断再执行语句
    （3）与for语句不同，while语句没有返回值，即整个while语句的结果是Unit类型()
    （4）因为while中没有返回值，所以当要用该语句来计算并返回结果时，就不可避免的使用变量，而变量需要声明在while循环的外部，那么就等同于循环的内部对外部的变量造成了影响，所以不推荐使用，而是推荐使用for循环。
*/

/*    do..while循环控制
    1）基本语法
    循环变量初始化;
    do{
      循环体(语句)
      循环变量迭代
    } while(循环条件)
    说明
    （1）循环条件是返回一个布尔值的表达式
    （2）do..while循环是先执行，再判断*/


   /* 循环中断
    1）基本说明
    Scala内置控制结构特地去掉了break和continue，是为了更好的适应函数式编程，推荐使用函数式的风格解决break和continue的功能，而不是一个关键字。Scala中使用breakable控制结构来实现break和continue功能。
    */


   /* 需求1：采用异常的方式退出循环
    def main(args: Array[String]): Unit = {

      try {
        for (elem <- 1 to 10) {
          println(elem)
          if (elem == 5) throw new RuntimeException
        }
      }catch {
        case e =>
      }

      println("正常结束循环")
    }
    需求2：采用Scala自带的函数，退出循环
    import scala.util.control.Breaks

    def main(args: Array[String]): Unit = {

      Breaks.breakable(
        for (elem <- 1 to 10) {
          println(elem)
          if (elem == 5) Breaks.break()
        }
      )

      println("正常结束循环")
    }
    需求3：对break进行省略
    import scala.util.control.Breaks._

    object TestBreak {

      def main(args: Array[String]): Unit = {

        breakable {
          for (elem <- 1 to 10) {
            println(elem)
            if (elem == 5) break
          }
        }

        println("正常结束循环")
      }
    }
*/


















  }
}
