fun main() {
    var human=Human("Melante",9,27)
    human.eat(20)
    human.weight
    println(human.speak("I love travelling"))
    human.birthday()
    var person=User("Lavington","Mugendi","lavignmendi@gmail.com",728422795,"MENDI")
    println(person.email)
    println(person.password)

}
class Human(var name:String,var age:Int,var weight:Int) {
    fun eat(foodWeight: Int){
        println("I am eating $foodWeight kgs of food")
        weight+=foodWeight
        println(weight)
    }
    fun speak(speech: String): String {
        return speech
    }
    fun birthday(){
        age+=1
        println(age)
    }
}
data class User(var firstName:String,var lastName:String,var email:String,var phoneNumber:Int,var password:String ){

}

