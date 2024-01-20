package com.example.onlykotlinprojectnoactivity

class listExampleClass {
    fun listHandsOn(){
        var list1 = listOf("abc", "def", "ghi", "jkl")
        var list2 = mutableListOf("abc", "def", "ghi", "jkl")

        println("list before insert new element: "+list2.toString())

        list2.add("SMPS")
        println("list after insert 'SMPS' element : "+list2.toString())

        list2.add(1,"Cabinet", )
        println("list after insert 'Cabinet' element in 2nd position : "+list2.toString())

        list2.removeAt(2)
        list2.remove("ghi")
        println("list after remove 'Cabinet' and 2th element : "+list2.toString())

        var isDelete = list2.remove("ghi")
        println("if item not in list, remove method return: $isDelete")
    }
}