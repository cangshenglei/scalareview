object 抽象属性和抽象方法 {
  def main(args: Array[String]): Unit = {
    val person01:Person09 = new Student09

    person01.sayHi()

  }
}

// 抽象的属性只能存在于抽象的类中
// 抽象类的使用有两种方法 :
// 使用子类继承抽象类
// 使用匿名子类
abstract class Person09{
  val name:String
  var age:Int

  def sayHi():Unit
}

class Student09 extends Person09{

  override val name: String = "student"
  override var age: Int = 18

  override def sayHi(): Unit = {
    println("hi student")
  }
/*
  2）继承&重写
  （1）如果父类为抽象类，那么子类需要将抽象的属性和方法实现，否则子类也需声明为抽象类
  （2）重写非抽象方法需要用override修饰，重写抽象方法则可以不加override。
  （3）子类中调用父类的方法使用super关键字
  （4）子类对抽象属性进行实现，父类抽象属性可以用var修饰；
  子类对非抽象属性重写，父类非抽象属性只支持val类型，而不支持var。
  因为var修饰的为可变变量，子类继承之后就可以直接使用，没有必要重写*/

/*

  // 抽象属性
  // 本质就是不写等号   属性自带封装  自带方法
  val name: String
  var age:Int

  def sayHi():Unit

  val name1:String = "person"
  var age1:Int = 10

  def sayHi1():Unit = {
    println("hi person")
  }
}

//  （1）如果父类为抽象类，那么子类需要将抽象的属性和方法实现，否则子类也需声明为抽象类
class Student06 extends Person06 {

  override val name: String = "lisi"
  override var age: Int = 18
  //  （2）重写非抽象方法需要用override修饰，重写抽象方法则可以不加override。
  def sayHi(): Unit = {
    println("hi")
  }

  override def sayHi1(): Unit = {
    //  （3）子类中调用父类的方法使用super关键字
    super.sayHi1()
    println("hi student")
  }

  //  （4）子类对抽象属性进行实现，父类抽象属性可以用var修饰；
  //  子类对非抽象属性重写，父类非抽象属性只支持val类型，而不支持var。
  //  因为var修饰的为可变变量，子类继承之后就可以直接使用，没有必要重写
 // override val name1: String = "student"
 // age1 = 18
}
*/

















}