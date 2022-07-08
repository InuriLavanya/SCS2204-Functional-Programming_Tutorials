object Q4_a extends App{

    def Total_Salary(NWH : Int, OTH : Int) : Int = {
        ((NWH*250)+(OTH*85))
    }

    def Tax(salary:Int): Int = {
        (salary*.12).toInt
    }

    def Takehome_Salary(NWH : Int, OTH : Int) : Int = {
        Total_Salary(NWH,OTH) - Tax(Total_Salary(NWH,OTH))
    }

    printf("Take home salary : ")
    println(Takehome_Salary(40,30))
}