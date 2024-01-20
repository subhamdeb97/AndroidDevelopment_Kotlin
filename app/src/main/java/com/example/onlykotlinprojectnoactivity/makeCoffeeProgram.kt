package com.example.onlykotlinprojectnoactivity

class makeCoffeeProgram {
    fun makeCoffeeProgram(){
        // Call Function
        println("write your name Sir!")
        var forWho: String = readln()
        println("How many cubes of sugar you want Sir!")
        var sugarCount: Int = readln().toInt()
        var returnValue =  makeCoffee(sugarCount, forWho)
    }
// Define Function

    fun makeCoffee(sugarCount : Int, customerName: String): Int{
        if(sugarCount == 0){
            println("Coffee with no sugar for $customerName")
        }else if(sugarCount < 2){
            println("Coffee with $sugarCount spoon of sugar for $customerName")
        }else{
            println("Coffee with $sugarCount spoons of sugar for $customerName")
        }
        val v= 2
        return v
    }

}