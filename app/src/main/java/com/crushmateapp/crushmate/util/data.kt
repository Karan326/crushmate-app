package com.crushmateapp.crushmate.util



data class User(
    val uid: String? = "",
    val name: String? = "",
    val age: String? = "",
    val email: String? = "",
    val gender: String? = "",
    val preferredGender: String? = "",
    val imageurl: String? = ""

)

data class Chat(
    val userId: String? = "",
    val chatId: String? = "",
    val otherUserId: String? = "",
    val name: String? = "",
    val imageUrl: String? = ""
)

