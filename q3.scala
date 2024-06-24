object takeHomeSalary{
    def normalWork(h1:Int):Int={
        h1*250
    }
    def ot(h2:Int):Int={
        h2*85
    }
    def income(h1:Int,h2:Int):Int={
        normalWork(h1)+ot(h2)
    }
    def tax(income:Int):Double ={
        income*0.12
    }
    def finalSalary(h1:Int,h2:Int):Double={
        income(h1,h2)-tax(income(h1,h2))
    }
    def main(args: Array[String]): Unit = {
        val h1 = 40
        val h2 = 30
        println(s"The take home salary of an employee: ${finalSalary(h1,h2)}")
    }
}