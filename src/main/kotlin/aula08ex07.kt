/*
 *  Utilização de métodos estáticos e variáveis estáticas
 * */
class Car(val horsepowers: Int) {

    companion object Factory {
        val cars = mutableListOf<Car>()
        fun makeCar(horsepowers: Int): Car {
            val car = Car(horsepowers)
            cars.add(car)
            return car
        }}}

fun main(){
    val car = Car.makeCar(150)
    println(Car.Factory.cars.size)
}