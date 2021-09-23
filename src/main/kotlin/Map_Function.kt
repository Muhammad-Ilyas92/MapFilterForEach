//Map Function ap k data ko aik form s dusri form m convert krta h
//example : ap n usay list de wo ap k pehle ko pakray ga convert kr dega, same isse trhan dusre or teesre
//map this data to other form
// example: aik form of data agr mera network s aya h to m n wo UI m show krwaya to y hm map m krte hein 
fun main()
{
    //mjhy  aik list chaye jis m mjhy in sb numbers ka square chaye
    val nums = listOf<Int>(1,2,3,4,5,6)
    val list = nums.map { it * it }
    println(list)
    println("----------------")

    val userList1 = listOf(
        User1(1, "Shakir"),
        User1(2, "Umair"),
        User1(3, "Raja")
    )
    //suppose y jo mere userlist h usko m n convert kr k PAID USER k objects bananay hein to wahan m map function ko use kr skta hun
    //yahan pr hm n userobject ko paiduser m convert kiya hai
    val paidUserlist = userList1.map {
        PaidUser(it.id,it.name,"Paid")
    }
    println(paidUserlist)
    println("----------------")

}

data class User1 (val id: Int, val name: String)

data class PaidUser(val id: Int, val name: String, val type: String)
