class shujuleixing {
def main (args:Array[String]) :Unit= {
  var a: Int = 10
  val b: Int = 20
  /*注意：能用常量的地方不用变量。
  2）案例实操
  （1）声明变量时，类型可以省略，编译器自动推导，即类型推导。
  （2）类型确定后，就不能修改，说明Scala是强数据类型语言。
  （3）变量声明时，必须要有初始值。
  （4）在声明/定义一个变量时，可以使用var或者val来修饰，var修饰的变量可改变，val修饰的变量不可改。
  （5）var修饰的对象引用可以改变，val修饰的对象则不可改变，但对象的状态（值）却是可以改变的。（比如：自定义对象、数组、集合等等）。
  */
  val c = 20;
  //    （1）声明变量时，类型可以省略，编译器自动推导，即类型推导
  //    （2）类型确定后，就不能修改，说明Scala是强数据类型语言。
  //    b = "30"
  //    （4）var修饰的对象引用可以改变，val修饰的对象则不可改变，
  //    但对象的状态（值）却是可以改变的。（比如：自定义对象、数组、集合等等）


  // 引用数据类型的常量和变量能否替换成别的对象
  // var 可以修改引用数据类型的地址值  val不行
  // 引用数据类型中的属性值能否发生变化  取决于内部的属性在定义的时候是var还是val
  // scala中类的属性 如果是var变量也能使用默认值  但是必须要有等号


  /*  标识符的命名规范
  Scala对各种变量、方法、函数等命名时使用的字符序列称为标识符。即：凡是自己可以起名字的地方都叫标识符。
  1）命名规则
  Scala中的标识符声明，基本和Java是一致的，但是细节上会有所变化，有以下三种规则：
  （1）以字母或者下划线开头，后接字母、数字、下划线
  （2）以操作符开头，且只包含操作符（+ - * / # !等）
  （3）用反引号`....`包括的任意字符串，即使是Scala关键字（39个）也可以*/

  /*  字符串输出
  1）基本语法
  （1）字符串，通过+号连接。
  （2）重复字符串拼接。
  （3）printf用法：字符串，通过%传值。
  （4）字符串模板（插值字符串）：通过$获取变量值。*/

  println("hello" + "world")

  println("hello" * 20)

  println("name : %s age :%d\n", "nihao", 5)

  val name = "linhai"
  val age = 8

  val s1 = s"name: $name,age:${age}"
  println(s1)

  val s2 = s"name: ${name + 1},age:${age + 2}"
  println(s2)


  //    （5）长字符串  原始字符串
  println("我" +
    "是" +
    "一首" +
    "诗")

  //多行字符串，在Scala中，利用三个双引号包围多行字符串就可以实现。
  // 输入的内容，带有空格、\t之类，导致每一行的开始位置不能整洁对齐。
  //应用scala的stripMargin方法，在scala中stripMargin默认是“|”作为连接符，
  // 在多行换行的行头前面加一个“|”符号即可。
  println(
    """我
      |是
      |一首
      |诗
      |""".stripMargin)

  """
    |select id,
    |       age
    |from  user_info
    |""".stripMargin

  /*  s"""
     |${name}
     |${age}
     |""".stripMargin*/

  // 所有的代码都是代码块
  // 表示运行一段代码  同时将最后一行的结果作为返回值
  // 千万不要写return
  val i: Int = {
    println("w")
    20 + 23
  }
  val a4 = {
    println("d")
    1 + 2
  }
  // 代码块为1行的时候  大括号可以省略
  val d = 293 + 32
  // 如果代码块没有计算结果  返回类型是unit
  val unit: Unit = {
    println("s")
    println("sdf")
  }

  // 当代码块没办法完成计算的时候  返回值类型为nothing
  val value: Nothing = {
    println("s")
    throw new RuntimeException
  }

  //2.7 整数类型（Byte、Short、Int、Long）
  /*

数据类型	描述
  Byte [1]	8位有符号补码整数。数值区间为 -128 到 127
Short [2]	16位有符号补码整数。数值区间为 -32768 到 32767
Int [4]	32位有符号补码整数。数值区间为 -2147483648 到 2147483647
Long [8]	64位有符号补码整数。数值区间为 -9223372036854775808 到 9223372036854775807 = 2的(64-1)次方-1

*/

  val l = 1L

  // （1）Scala各整数类型有固定的表示范围和字段长度，不受具体操作的影响，以保证Scala程序的可移植性。
  val b1: Byte = 2
  //（2）编译器对于常量值的计算 能够直接使用结果进行编译
  // 但是如果是变量值 编译器是不知道变量的值的 所以判断不能将大类型的值赋值给小的类型
  // （3）Scala程序中变量常声明为Int型，除非不足以表示大数，才使用Long

  /*浮点类型（Float、Double）
Scala的浮点类型可以表示一个小数，比如123.4f，7.8，0.12等等。
1）浮点型分类
数据类型	描述
  Float [4]	32 位, IEEE 754标准的单精度浮点数
  Double [8]	64位 IEEE 754标准的双精度浮点数*/
  // 浮点数介绍
  // 默认使用double
  val q: Double = 3.14

  // 如果使用float 在末尾添加f
  val fl = 3.14f

  // 浮点数计算有误差
  println(0.1 / 3.3)

  /*字符类型（Char）
1）基本说明
字符类型可以表示单个字符，字符类型是Char。
2）案例实操
（1）字符常量是用单引号 ' ' 括起来的单个字符。
（2）\t ：一个制表位，实现对齐的功能
（3）\n ：换行符
（4）\\ ：表示\
（5）\" ：表示"*/

  val c1: Char = 's'
  val c2: Char = 34234
  //    （2）\t ：一个制表位，实现对齐的功能
  val c5: Char = '\t'

  //    （3）\n ：换行符
  val c3: Char = '\n'
  println(c3 + 0)
  //    （4）\\ ：表示\
  val c7: Char = '\\'
  println(c5 + 0)

  //    （5）\" ：表示"
  val c6: Char = '\"'
  println(c6 + 0)


  /*
布尔类型：Boolean
1）基本说明
（1）布尔类型也叫Boolean类型，Booolean类型数据只允许取值true和false
（2）boolean类型占1个字节。
*/
  val bo1: Boolean = true
  val bo2: Boolean = false
  /*

Unit类型、Null类型和Nothing类型（重点）
1）基本说明
数据类型	描述
  Unit	表示无值，和其他语言中void等同。用作不返回任何结果的方法的结果类型。Unit只有一个实例值，写成()。
Null	null , Null 类型只有一个实例值null
  Nothing	Nothing类型在Scala的类层级最低端；它是任何其他类型的子类型。
当一个函数，我们确定没有正常的返回值，可以用Nothing来指定返回类型，这样有一个好处，就是我们可以把返回的值（异常）赋给其它的函数或者变量（兼容性）
*/

  /*

2）案例实操
（1）Unit类型用来标识过程，也就是没有明确返回值的函数。
由此可见，Unit类似于Java里的void。Unit只有一个实例——( )，这个实例也没有实质意义。
*/

  val unit1: Unit = {
    10
    println("2")

  }
  println(unit)

  // 如果标记对象的类型是unit的话  后面有返回值也没法接收
  // unit虽然是数值类型  但是可以接收引用数据类型   因为都是表示不接收返回值

  //（2）Null类只有一个实例对象，Null类似于Java中的null引用。Null可以赋值给任意引用类型（AnyRef），但是不能赋值给值类型（AnyVal）。


  //
  val aa: String = "aa"

  // null
  var aa1: String = "aa"

  aa1 = "bb"
  aa1 = null
  if (aa1 != null) {
    val strings: Array[String] = aa1.split(",")
  }
  // 值类型不能等于null,idea不会识别报错  编译器会报错
  var i4 = 10
  //    i4 = null


  //（3）Nothing，可以作为没有正常返回值的方法的返回类型，非常直观的告诉你这个方法不会正常返回，而且由于Nothing是其他任意类型的子类，他还能跟要求返回值的方法兼容。


  /*
数值类型自动转换
当Scala程序在进行赋值或者运算时，精度小的类型自动转换为精度大的数值类型，这个就是自动类型转换（隐式转换）。数据类型按精度（容量）大小排序为：
*/

  /*
1）基本说明
（1）自动提升原则：有多种类型的数据混合运算时，系统首先自动将所有数据转换成精度大的那种数据类型，然后再进行计算。
（2）把精度大的数值类型赋值给精度小的数值类型时，就会报错，反之就会进行自动类型转换。
（3）（byte，short）和char之间不会相互自动转换。
（4）byte，short，char他们三者可以计算，在计算时首先转换为int类型。

*/

  //    （1）自动提升原则：有多种类型的数据混合运算时，
  //    系统首先自动将所有数据转换成精度大的那种数据类型，然后再进行计算。

  val tw: Float = 1 + 1L + 3.14f
  val dfs: Double = 1 + 1L + 3.14f + 3.14


  //    （2）把精度大的数值类型赋值给精度小的数值类型时，就会报错，反之就会进行自动类型转换。
  val ou = 10
  val b97: Double = ou

  //    （3）（byte，short）和char之间不会相互自动转换。
  // 因为byte和short是有符号的数值,而char是无符号的
  val b5: Byte = 10
  val c4: Char = 20

  //    （4）byte，short，char他们三者可以计算，在计算时首先转换为int类型。
  val b2: Byte = 20
  //    val i1: Byte = b1 + b2
  val i1: Int = 1100000000
  val i2: Int = 1200000000
  // 超出范围的int值计算会造成结果错误
  val i3: Int = i1 + i2
  println(i3)

  //强制类型转化
  //自动类型转换的逆过程，将精度大的数值类型转换为精度小的数值类型。使用时要加上强制转函数，但可能造成精度降低或溢出，格外要注意。
  var num: Int = 2.543.toInt

  /*2）案例实操
（1）将数据由高精度转换为低精度，就需要使用到强制转换。
（2）强转符号只针对于最近的操作数有效，往往会使用小括号提升优先级*/


  /*
数值类型和String类型间转换
1）基本说明
在程序开发中，我们经常需要将基本数值类型转成String类型。或者将String类型转成基本数值类型。
2）案例实操
（1）基本类型转String类型（语法：将基本类型的值+"" 即可）。
（2）String类型转基本数值类型（语法：s1.toInt、s1.toFloat、s1.toDouble、s1.toByte、s1.toLong、s1.toShort）。

*/

  //    （1）基本类型转String类型（语法：将基本类型的值+"" 即可）

  val string: String = 10.toString
  println(string)

  val str: String = 1 + ""

  //    （2）String类型转基本数值类型（语法：s1.toInt、s1.toFloat、s1.toDouble、s1.toByte、s1.toLong、s1.toShort）
  val double = "3.23".toDouble
  println(double + 1)
  println(double.toByte)

  // 不能直接将小数类型的字符串转换为整数  需要先转换为double再转换int
  //    println("3.14".toInt)
  // 标记为f的float数能够识别
  //    println("12.6f".toFloat)


}}





























































