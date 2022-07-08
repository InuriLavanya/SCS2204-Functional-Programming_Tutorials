object Q3_b extends App{

    var a = 2
    var b = 3
    var c = 4
    var d = 5
    var k = 4.3f
    var g = 4.0f

    //scala doesn't allow to use increment and decrement operators directly
    b -= 1;
    println(b*a+c*d);
    d -= 1;

    println(a);
    a += 1;

    println(-2*(g-k)+c);

    println(c);
    c += 1;

    c += 1;
    println(c*a);
    a += 1;

}