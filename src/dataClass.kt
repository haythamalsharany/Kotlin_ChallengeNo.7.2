fun main() {
    val emp1=Employee("haytham",27)
    val emp2=Employee("wafa",22)
    val emp3=Employee("wafa",22)
    println(emp1)
    println(emp1.equals(emp2))
    println(emp2.equals(emp3))

    val user1=User("haytham",27)
    var user2=User("wafa",22)
    val user3=User("wafa",22)
    println(user1)
    println("you can compare between to data class object value " )
    println(user1.equals(user2))
    println(user2.equals(user3))
    println("you can copy object value to another object")

    println(user2.copy())
    println("you can use standard function to config object value ")
    println(user2.let { it->it.name="ali" })
 

}


class Employee(name:String,age:Int){

}
data class User(var name:String,var age:Int)