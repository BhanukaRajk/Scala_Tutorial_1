//Tutorial Question 4(b)
object tuteQ4b {
    def main(args: Array[String]) :Unit = {
        var MaxProfit, best_price : Int = 0;

        for( ticketPrice <- 5 to (50, 5)){
            println( "Value of a ticket: " + ticketPrice + " --> Profit: " + Profit(ticketPrice) );
            if(MaxProfit < Profit(ticketPrice)){
                MaxProfit = Profit(ticketPrice);
                best_price = ticketPrice;
            }
        }

        println("\nBest price for ticket: "+best_price);
        println("Maximum profit: "+MaxProfit);
    }


    def Audience(price: Int): Int = {
        return 120+(15-price)/5*20;
    }
    def Income(price: Int): Int = {
        return Audience(price)*price;
    }
    def Cost(price: Int): Int = {
        return 500+Audience(price);
    }
    def Profit(price: Int): Int = {
        return Income(price)-Cost(price);
    }
}