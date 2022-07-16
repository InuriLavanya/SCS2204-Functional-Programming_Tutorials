object Q4 extends App{
    
    def cost(quantity:Int)={
        if(quantity>=50){
            ((24.95*quantity*.6)+(50*3)+((quantity-50)*.75))
        }
        else{
            ((24.95*quantity*.6)+(3*quantity))
        }
    }
    println(cost(60))
}