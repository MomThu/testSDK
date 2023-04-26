package com.mom.mylibrary

class Person {
    public val firstName = "Mom";
    public val lastName = "Thu";

    companion object {
        fun fullName(firstName: String, lastName: String): String {
            return "$firstName $lastName"
        }
    }
}