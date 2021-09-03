package com.rsk.kotlin

import com.rsk.java.Person

class Program {
    companion object{
        @JvmStatic
        fun main(args: Array<String>){
            val p = Person()

            p.name = "Bernie"
            p.age = 36

            println("${p.name} is ${p.age} years old")

            try{
                p.name = ""
            } catch (e: Exception){
                println(e.message)
            }

            val partner = p.partner

            println(partner?.name)
        }
    }
}

class Student : Person() {

}