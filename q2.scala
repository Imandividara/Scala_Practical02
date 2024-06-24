object expressions{
    def main(args: Array[String]): Unit = {
        var a = 2
        var b = 3
        var c = 4
        var d = 5
        var k = 4.3f
        var g = 3.0f


        
        b -= 1
        println(s"a) ${b*a+c*d}")
        d -= 1

        
        println(s"b) $a")
        a += 1

        println(s"c) ${-2*(g-k) + c}")
        
        println(s"d) $c")
        c += 1

        c += 1
        println(s"e) ${c*a}")
        a += 1



    }
}