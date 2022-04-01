fun main(){
    var benzy=Car("vitz","toyota","hummer", 5)
    benzy.carry(31)
    benzy.identity()
    println(benzy.calculateParkingFees(9))

    var x = Bus("rangler","mercedees","green",45)
    println(x.maxtripfare(70.00))
//    println(x.calculateparkingfees(3))

}
open class Car(var make:String,var model:String,var color:String,var capacity:Int) {
    fun carry(people: Int) {
        var x = people - capacity
        if(people<=capacity){
            println("carrying $people passengers")
        }
        else  {
            println("high amount $x people")
        }
    }
   fun identity(){
        println("i am $color $make $model")
    }
  open  fun calculateParkingFees(Hour:Int):Int{

    var tot1 = Hour * 20
    return tot1

    }
}
class Bus(make: String,model: String,color: String,capacity: Int): Car(make,model,color,capacity){
    fun maxtripfare(fare:Double):Double{
        var max = 600
        var tot2 =max * fare
        return  tot2
    }

    override fun calculateParkingFees(Hour: Int): Int {
        return super.calculateParkingFees(Hour)
    }

}
