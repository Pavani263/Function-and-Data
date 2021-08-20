object Q4 extends App {
  var bank:List[Bank_Acc] = List(new Bank_Acc("Nimal",255,-18000),new Bank_Acc("Kamal",279,80000),new Bank_Acc("Sunil",296,69000),
                                 new Bank_Acc("Piyal",327,-125000),new Bank_Acc("Ranil",483,35000)) 

//List of Accounts with negative balances
  val findNegAcc   = (l:List[Bank_Acc]) => l.filter(x => x.b < 0)

//Calculate the sum of all account balances
  val sum   = (l:List[Bank_Acc]) => l.reduce((x,y) => (new Bank_Acc("",0,x.b+y.b)))

// Calculate the final balances of all accounts after apply the interest function as fallows:
//If balance is positive, deposit interest is .05  and if balance is negative, overdraft interest is .1
  val final_bal = (l:List[Bank_Acc]) => l.map(x => if (x.b < 0) new Bank_Acc(x.n,x.a,x.b*1.001) else new Bank_Acc(x.n,x.a,x.b*1.0005))

  println("Negative balance accounts : ")
  findNegAcc(bank).foreach(z => println("Acc No : "+ z.a +" Name :"+ z.n + ":" + z.b))

  println("\nSum of all account balances : ")
  println(sum(bank).b)

  println("\nFinal balances : ")
  final_bal(bank).foreach(z => println("Acc No : "+ z.a+" Name :"+ z.n + " Final Balance :" + z.b))  
  
}

class Bank_Acc(name:String,acc_no:Int,balance:Double){
  var n = name
  var a = acc_no
  var b = balance
}