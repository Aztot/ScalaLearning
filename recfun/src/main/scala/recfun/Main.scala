package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int =
  if ((c == r)||(c == 0)) 1 else pascal(c-1,r-1)+pascal(c,r-1)
  pascal(1,3)
  
  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    def bal(chars: List[Char], acc: Int): Boolean = {
      if ((chars.isEmpty)&&(acc == 0)) true
      else if ((chars.isEmpty)&&(acc != 0)) false
      else if ((chars.head == ')') && (acc == 0)) false
      else if (chars.head == '(') bal(chars.tail,acc+1)
      else if (chars.head == ')') bal(chars.tail,acc-1)
      else bal(chars.tail,acc)
    }
    if (chars.isEmpty) false
    else bal(chars,0)
  }
  
  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
    def count(money: Int,coins: List[Int]): Int ={
      if (coins.isEmpty) 0
      else if (money==0) 1
      else if (money<0) 0
      else count(money-coins.head,coins)+count(money,coins.tail)

    }
    count(money,coins)
  }
  }
