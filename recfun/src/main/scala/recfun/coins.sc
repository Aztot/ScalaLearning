def countChange(money: Int, coins: List[Int]): Int = {
  def count(money: Int,coins: List[Int]): Int ={
    if (coins.isEmpty) 0
    else if (money==0) 1
    else if (money<0) 0
    else count(money-coins.head,coins)+count(money,coins.tail)

  }
  count(money,coins)
}

