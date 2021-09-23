//Collection Function
//how we use collection function in foreach() , map(), filter()

fun main ()
{
    //in this list we filter and check odd and even numbers, we can sublist to filter
    val nums = listOf<Int>(1,2,3,4,5)
    println(isOdd(2))
    println(isOdd(3))
    println(isOdd(4))
    println("-------------")
    //collection mhamara pass bht se utility function hote hein
    //is walay collection m hamare pas filter function hota h, wo list ko filter use krne m
    //FILTER kya krta h apki list m loop krta h or condition check krta h k y true h ya false, agr condition us pr true aati h le leta h agr false a jaye to ignore kr deta h
    val list = nums.filter (::isOdd) //isodd wala function is filter m call huwa h,
    println(list)
    println("--------------")


/*
    //aik or b tareka hai jis m hm pora odd function filter m use kr skte hien..
    val list = nums.filter (fun (a:Int): Boolean //yahan boolen return kr rh a
    {
        return a % 2 !=0 // y mode k lye h
    })

*/
    
/*

    //ab hm lameda k through isko kese kr skte hein
    val list = nums.filter ({ a: Int -> a % 2 !=0})

    //Move lambda argument out of parentheses
    val list = nums.filter { a: Int -> a % 2 != 0 }

    //now i more simplify into (it)
    val list = nums.filter { it % 2 != 0 }

*/

    println(list)
}

fun isOdd(a:Int): Boolean //yahan boolen return kr rh a
{
    return a % 2 !=0 // y mode k lye h
}


