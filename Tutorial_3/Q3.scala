object Q3 extends App{
    
    val Pi = 3.14
    def volume(radius:Int) = {
        (Pi*radius*radius*radius*4/3)
    }
    println(volume(5))
}