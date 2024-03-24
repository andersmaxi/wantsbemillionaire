package com.example.wants_be_millionaire

data class Question (val question:Int,
                     val questiondescription:String,
                     val correctanswer:Char,
                     val opt1:String="A.",
                     val opt2:String="B.",
                     val opt3:String="C.",
                     val opt4:String="D.")
