import scala.annotation.tailrec
import scala.beans.BeanProperty

object function {
//函数式编程
def main(args: Array[String]): Unit = {
  //定义了 一个函数
  //函数没有重载
  def sayHi(name :String):Unit={
    println(s"${name}syhi")
  }

  def sayhello(name:String,age:Int):Unit={
    println(s"  $age 岁的 $name")
  }

  //在函数中创建函数
def syaHi2(naem:String):Unit={
  def changaName():String={
    s"$naem "
  }
}
//定义在类中的叫做方法
  def sayHi1(name :String):Unit={
    println(s"$name")
  }
//在方法中可以定义函数
def sayHi4(name:String, age:Int) :Unit = {

  // 在方法当中也可以定义函数
  def changeName(): String = {
    s"$name 大帅哥"
  }

  println(s"hi  $age 岁的 ${changeName()}")
}

//可变参数
  //可变参数在函数值本质式 一个数组
def sayHI1(name:String*):Unit={
  println(s"$name")
  for (elem <- name){

  }
}


  // 可变参数使用:
  // (2)可变参数必须在参数列表的最后
  /*def sayHi1(sex: String,names:String*):Unit = {
    println(s"hi $names")
  }*/

  // (3)参数默认值
  def sayHi2(name:String = "linhai"):Unit = {
    println(s"hi ${name}")
  }

  sayHi2("linhai")
  sayHi2()


  // 可变参数在使用的时候 可以不在最后
  def sayHi3( name:String = "linhai" , age:Int):Unit = {
    println(s"hi ${name}")
  }

  // (4)带名参数
  sayHi3(age = 10)

def func20(x:Int,y:Int):Int={
  println("func0的调用")
  if (x<20){
    return x+y
  }
  2 * x + 3 * y
}

  def func0(x: Int, y: Int): Int = {
    println("func0的调用")
    if (x < 20) {
      return x + y
    }
    2 * x + 3 * y
  }


  //    （1）return可以省略，Scala会使用函数体的最后一行代码作为返回值
  def func1(x: Int, y: Int): Int = {
    println("func1的调用")
    x + y
  }

  val i: Int = func1(10, 20)
  println(i)

  //    （2）如果函数体只有一行代码，可以省略花括号
  // 如果不写大括号 默认有效范围只有一行
  def func2(x: Int, y: Int): Int = x + y


  //    （3）返回值类型如果能够推断出来，那么可以省略（:和返回值类型一起省略）
  def func3(x: Int, y: Int) = x + y




  //    （4）如果有return，则不能省略返回值类型，必须指定
  def func4(x: Int, y: Int): Int = {
    if (x < 20) {
      return x + y
    }
    2 * x + 3 * y
  }

  func4(10, 20)

  //    （5）如果函数明确声明unit，那么即使函数体中使用return关键字也不起作用
  def func5(x: Int, y: Int): Unit = return x + y

  val unit: Unit = func5(10, 20)
  //    （6）Scala如果期望是无返回值类型，可以省略等号
  def func6(x: Int, y: Int) {
    println(x + y)
  }

  //    （7）如果函数无参，但是声明了参数列表，那么调用时，小括号，可加可不加
  def func7(): Unit = {
    println("hello")
  }

  func7()
  func7

  //    （8）如果函数没有参数列表，那么小括号可以省略，调用时小括号必须省略
  def func8 {
    println("hello")
  }

  func8
  //    （9）如果不关心名称，只关心逻辑处理，那么函数名（def）可以省略
  def func9(x: Int, y: Int) = x + y


  val function: (Int, Int) => Int = (x: Int, y: Int) => x + y

  //    （1）参数的类型可以省略，会根据形参进行自动的推导
val f1:(Int,Int)=> Int=(x,y)=>x+y

  //    （2）类型省略之后，发现只有一个参数，则圆括号可以省略；

  val f3:Int => Int=x =>x +22

  val f4:()=>Int =()=>10

  //    （3）匿名函数如果只有一行，则大括号也可以省略
  val f5:(Int,Int) =>Int=(x,y)=>{
    println("")
    x+y
  }
  //    （4）如果参数只出现一次，且按照顺序出现，则参数省略且后面参数可以用_代替
val f6:(Int,Int) =>Int=_+_

  // 化简为_的条件
  // 1. 传入的参数类型可以推断 所以可以省略
  val f7: (Int, Int) => Int = (x, y) => y - x

  // 2. 参数必须只使用一次  使用的顺序必要和定义的顺序一样
  val f8: (Int, Int) => Int = -_ + _


  // 如果化简为匿名函数  只剩下一个_  则不可以化简
  val function6: String => String = _ + ""
  val str: String = function6("linhai")
  val function1: String => String = a => a


  // 如果化简的下划线在函数里面  也会报错
  //    val function1: String => Unit = println(_ + "hi")

  val function2: String => Unit = println
  function2("linhai")
}

  def sayHi(name: String): String = {
    println(s"hi $name")
    s"hi $name"
  }

  //    1）函数可以作为值进行传递
 // val func1: String = sayHi("linhai")
  // 在被调用函数sayHi 后面加上 _，相当于把函数当成一个整体，传递给变量func2
  val func2 = sayHi _

  // 如果明确变量类型，那么不使用下划线也可以将函数作为整体传递给变量
  val func3: String => String = sayHi



  //    2）函数可以作为参数进行传递
  def sumAB(a: Int, b: Int): Int = a + b

  def difAB(a: Int, b: Int): Int = a - b

  // 给两个数 ,之后按照传入的公式进行计算
  def funcAB(a: Int, b: Int, func: (Int, Int) => Int): Int = {
    func(a, b)
  }


  val i: Int = funcAB(10, 20, difAB)
  println(i)


  funcAB(10, 20, 2 * _ / 4 *_)

  // 写一个MR  需要写3部分
  // 1. map类  map方法
  // 2. reduce类  reduce方法
  // 3. drive类  驱动
  def mapReduce(data:String,map:(String) => Int,reduce:(Int) => String):String ={
    // 使用map读取数据
    val i2: Int = map(data)
    // shuffle
    println("走shuffle")
    // 对shuffle后的数据进行聚合
    val result: String = reduce(i2)
    result
  }

  // 实现一个mr程序
  val str: String = mapReduce("hello world",
    (data: String) => data.length, (data: Int) => data + "reduce之后")
  println(str)



  //    3）函数可以作为函数返回值返回
  def sumByX(x:Int) = {
    def sumXY(y: Int): Int = {
      x + y
    }

    sumXY _
  }

  val function: Int => Int = sumByX(10)
  println(function)
  val i1: Int = function(20)
  println(i1)

  val i2: Int = sumByX(10)(20)
  println(i2)

  // 高阶函数的第三种用法化简
  // 过度化简  不利于读懂
  def sumXY1(x: Int): Int => Int =  x + _

  // 两个数相加  泛用性更强
  def sumAB(a:Int,b:Int) :Int = a + b

  // 确定一个数是4  适用性更强
  def sumByFour(b:Int) :Int = 4 + b
  def sumByFive(b:Int) :Int = 5 + b

  // 定义一个函数 动态确定一个参数
  def sumByA(a:Int): Int => Int = {
    def sumAB(b:Int):Int = a + b
    sumAB _
  }


  val sumByFour1: Int => Int = sumByA(4)
  val sumByFive1: Int => Int = sumByA(5)

  //添加闭包之后的mapReduce程序
  def mapReduce(data:String)(map:(String) => Int)(reduce:(Int) => String):String ={
    // 使用map读取数据
    val i2: Int = map(data)
    // shuffle
    println("走shuffle")
    // 对shuffle后的数据进行聚合
    val result: String = reduce(i2)
    result
  }

  // 先提供数据
  // 表示提供了当前数据的结果  后续可以重复使用  添加map方法和reduce方法
 // val function: (String => Int) => (Int => String) => String = mapReduce("data")


  // 填写map方法
  // 经过当前map方法处理之后的结果
  //val function1: (Int => String) => String = function((s: String) => s.length)

  // 填写reduce方法
  //val result: String = function1((i: Int) => i + "经过reduce聚合")
 // val result1: String = function1((i: Int) => i + "经过另外一种reduce聚合")


  // 阶乘
  var n = 5
  var res = 1
  for (i <- 1 to n) {
    res *= i
  }

  println(res)

  // 递归
  // 1. 调用自身
  // 2. 跳出条件
  // 3. 填入的参数必须有规律
  // 4. 递归必须声明函数返回值类型
  def rec(n: Int): Int = {
    if (n == 1) 1 else rec(n - 1) * n
  }

  println(rec(5))



  // 尾递归优化
  @tailrec
  def rec1(n: Int, res: Int = 1): Int = {
    if (n == 1) res else rec1(n - 1,res * n)
  }

  println(rec1(5))





/*  控制抽象
  1）值调用：把计算后的值传递过去
  2）名调用：把代码传递过去*/


  // 值调用
  def sayHi(name:String):Unit = {

    println("sayHi的调用")
    println(s"hi $name")
    println(s"hi $name")
  }

  sayHi({
    println("代码块-字符串")
    "linhai"
  })


  println("=======================")
  // 名调用    => String
  def sayHi1(name: => String):Unit = {
    println("sayHi1的调用")
    println(s"hi $name")
    println(s"hi $name")
  }

  var n1 = 1
  sayHi1({
    println("代码块-字符串1")
    n1 += 1
    "linhai" + n
  })



  def sumAB(a:Int,b:Int):Int = {
    println("sumAB调用")
    a + b
  }
  lazy val n = sumAB(10,20)

  println("分隔符===================")

  println(n)



  //（1）Scala语法中，类并不声明为public，所有这些类都具有公有可见性（即默认就是public）
  class Person {

  }

  //（2）一个Scala源文件可以包含多个类
  class Teacher{

  }



  object Test02_Class {
    def main(args: Array[String]): Unit = {
      val person0 = new Person02
      val student0 = new Student02

      person0.age = 10


      person0.getName
      person0.getAge
      person0.setAge(20)

    }
  }

  // scala中一个文件可以由多个public的类
  // 默认的访问权限就是public
  // 但是同一个包内部只能有一个相同名称的类
  class Person02{
    // 属性分两种
    // 可变和不可变
    // 不推荐大家自己写封装的东西
    // 因为scala可以通过修改属性的val 和var 来控制读写权限
    @BeanProperty
    var age:Int = _

    // val 只能生成get方法
    @BeanProperty
    val name:String = "zhangsan"


  }

  class Student02{

  }


  // 同一个包都可以访问的到
  Person04.name1

  // 受保护的权限  同一个包也无法访问
  //    Person04.name2

  // 访问公共的权限
  Person04.name3
}
}


class Person04{
  val nameClass = Person04.name

  val name1Class = Person04.name1

  // 受保护的权限
  protected val name2:String = "受保护的权限"
}

object Person04{
  // 私有的权限能够在当前类和当前伴生对象中调用
  private val name:String = "私有权限"

  // 包访问权限
  private[chapter06] val name1:String = "包访问权限"

  // public的权限
  val name3:String = "公共的权限"



// 不同的包里面无法访问name1  包访问权限
//    Person04.name1

// 不同的包也能访问到公共的权限
Person04.name3

class Student04 extends Person04{
  // 即使不是一个包  继承的子类也能够访问到受保护的权限
  val name2Class = name2
}


  def sum(n1:Int, n2:Int) : Int = {
    n1 + n2
  }



  // 主构造器  直接写在类的定义后面  可以添加参数  可以使用权限修饰符
  //class Person06 private(name:String){
  //  val name1 = name
  //}

  class Person06 (name:String){
    println("调用主构造器")

    val name1 = name
    var age:Int = _

    // 两个辅助构造器  再互相调用的时候 只能是下面的辅助构造器调用上面的辅助构造器

    def this(){
      // 辅助构造器的第一行 必须直接或简介的调用主构造器
      // 直接调用主构造器
      this("zhangsan")
      println("调用辅助构造器1")
    }

    def this(name:String,age1:Int){
      // 间接调用主构造器
      this()
      this.age = age1
      println("调用辅助构造器2")
    }

    // 主构造器参数 分为3类:
    // 没有修饰符 : 作为构造方法中的传入参数使用
    // val 修饰 : 会自动生产同名的属性 并且定义为val
    // var 修饰 : 会自动生产同名的属性 并且定义为var
    class Person07 (name1:String,val age:Int,var sex:String){
      val name = name1
      //  val age = age
      //  var sex = sex
    }


    // 子类继承父类的属性和方法
    val student0 = new Student08

    println(student0.name)
    println(student0.age)
    student0.sayHi
    println("===========================")

    val student01 = new Student08("lisi")
  }
}


class Person08 () {
  println("调用父类的主构造器")

  var name  = "person"
  var age = 18
  def sayHi: Unit ={
    println("hi person")
  }


  def this(name:String){
    this()
    this.name = name
    println("调用父类的辅助构造器")
  }
}

// 子类继承
// scala中的继承本质上是继承一个父类的构造器
class Student08 (name:String) extends Person08 (name:String){
  println("调用子类的主构造器")

  def this(){
    this("zhangsan")
    //    this.name = name
    println("调用子类的辅助构造器")
  }

































}


