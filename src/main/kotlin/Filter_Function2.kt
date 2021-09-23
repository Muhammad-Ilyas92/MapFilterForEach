//is s pehle hm n filter function bnaya
//us m odd or even number find kiya
// is example m hm find krengay k jiski id=2 hai

fun main ()
{
    val userList = listOf(
    User(1, "Shakir"),
    User(2, "Umair"),
    User(3, "Raja")
    )

    println(userList.filter {it.id == 2})

}


data class User (val id: Int, val name: String)
{

}
