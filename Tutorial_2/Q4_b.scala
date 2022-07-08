object Q4_b extends App{

    def attendence(price: Int):Int = {
        120+((15-price)/5*20)
    }

    def income(price: Int):Int = {
        price*attendence(price)
    }

    def cost(price:Int):Int = {
        500+(attendence(price)*3)
    }

    def profit(price:Int):Int = {
        income(price)-cost(price)
    }
    printf("prifit of 15 tickets: ")
    println(profit(15))

    printf("prifit of 10 tickets: ")
    println(profit(10))

    printf("prifit of 20 tickets: ")
    println(profit(20))

}