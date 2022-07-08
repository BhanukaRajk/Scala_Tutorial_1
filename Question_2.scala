//Tutorial Question 2
object tuteQ2 {
    def main(args: Array[String]) ={
        var a = 2;
        var b = 3;
        var c = 4;
        var d = 5;
        var g = 4.0f;
        var k = 4.3f;

        println(MMDecrement(b) * a + c * DecrementMM(d));
        println(IncrementPP(a));
        println (-2 * ( g - k ) + c);
        println (IncrementPP(c));
        println (PPIncrement(c)*IncrementPP(a));


    }


    def PPIncrement(value:Int): Int = {
        return value+1;
    }
    def MMDecrement(value:Int): Int = {
        return value-1;
    }

    def IncrementPP(value:Int): Int = {
        return PPIncrement(value)-1;
    }
    def DecrementMM(value:Int): Int = {
        return MMDecrement(value)+1;
    }
}