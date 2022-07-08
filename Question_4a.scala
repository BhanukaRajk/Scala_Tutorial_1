//Tutorial Question 4(a)
object tuteQ4a {
    def main(args: Array[String]) = {
        var Whours: Int = 40;
        var OThours: Int = 30;

        println("Working hours: 40h \nOT hours: 30h");
        println("Take home salary:"+TakeHomeSalary(Whours, OThours));
    }

    def WHPayment(Whours:Int):Float = {
        return Whours*250.0f
    }
    def OTHPayment(OThours:Int):Float = {
        return OThours*85.0f
    }

    def Income(Whours:Int, OThours:Int):Float = {
        return OTHPayment(OThours)+WHPayment(Whours)
    }

    def TakeHomeSalary(Whours:Int, OThours:Int):Float = {
        return Income(Whours, OThours)*0.88f
    }
}