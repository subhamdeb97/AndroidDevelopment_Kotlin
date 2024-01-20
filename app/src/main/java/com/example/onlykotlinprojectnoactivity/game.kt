package com.example.onlykotlinprojectnoactivity

import java.util.Arrays

class game {
    fun game(){
        var str = "Rock Paper Scissors"
        println(str.lowercase())
        var listItem = arrayOf("Rock", "Paper", "Scissors")
        var computerChoice:String = ""
        var playerChoice:String = ""
        val loopWillRun = true
        while(loopWillRun){
            var randomNum = (0..2).random()
            computerChoice = listItem[randomNum]
            println("choose between : "+ Arrays.toString(listItem))
            playerChoice = readln()
            println("Computer choose: "+ computerChoice)
            if(computerChoice == playerChoice){
                println("match draw try again")
            }
            else if (computerChoice == "Rock" && playerChoice == "Paper"){
                println("You win!")
            }
            else if (computerChoice == "Paper" && playerChoice == "Rock"){
                println("Computer win!")
            }
            else if (computerChoice == "Rock" && playerChoice == "Scissors"){
                println("Computer win!")
            }
            else if (computerChoice == "Scissors" && playerChoice == "Paper"){
                println("Computer win!")
            }
            else if (computerChoice == "Paper" && playerChoice == "Scissors"){
                println("You win!")
            }
            else if (computerChoice == "Scissors" && playerChoice == "Rock"){
                println("You win!")
            }
            if(computerChoice != playerChoice){
                break
            }
        }
    }
}