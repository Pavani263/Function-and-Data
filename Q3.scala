object Q3 extends App {
  val acc1 = new Bank_Acc(744,"Pavani",50000)
  val acc2 = new Bank_Acc(985,"Hiruni",40000)
  val x = 10000

  println(acc1.a + "-" + acc1.n + "'s balance " + acc1.b + "\n" + acc2.a + "-" + acc2.n + "'s balance " + acc2.b)

  acc1.transfer(acc2,x)

  println(acc1.a + "-" + acc1.n + " transfer " + x + " to " + acc2.a + "-" +acc2.n)
  println(acc1.a + "-" + acc1.n + "'s balance " + acc1.b + "\n" + acc2.a + "-" + acc2.n + "'s balance " + acc2.b)

}


class Bank_Acc(acc_no:Int,name:String,balance:Double){
  var a = acc_no
  var n = name
  var b = balance
  
  //Transfer Money
  def transfer(acc:Bank_Acc,b:Double) = {
      acc.b  = acc.b+b
      this.b = this.b-b
  }
}

