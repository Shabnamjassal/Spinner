package com.shivani.spinner

data class StudentModel(
    var name : String ? =null,
    var rollno : Int = 0
){
    override fun toString(): String {
        return "$name"
    }
}
