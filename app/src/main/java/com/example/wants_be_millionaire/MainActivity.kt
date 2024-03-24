package com.example.wants_be_millionaire

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


const val APP_USERS          : String = "DB_USER"                    //  DATASTORE - Users
const val APP_USERS_QUESTION : String = "DB_USER_RESPONSE"           //  DATASTORE - Users Responses
const val APP_CONFIRM        : String = "The answer to this question must be selected."
const val APP_EARN           : String  = "This is the correct answer. You earned $"
const val APP_WINNER         :String   = "Congratulations you won $"
const val APP_TITLE_EARN     : String = " Earned :$"
const val  APP_NUM_QUESTIONS :String  =" / 10"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnplay : Button  = findViewById<Button>(R.id.btn_play)
        val btnhelp  : Button = findViewById<Button>(R.id.btn_help)

        Global.CorrectAnswer.add( Question(1,
            "Which of these US presidents appeared on the television series Laugh-In?",
            'B',"A. Lyndon Johnson","B. Richard Nixon","C. Jimmy Carter","D. Gerald Ford"))

        Global.CorrectAnswer.add( Question(2,
            "The Earth is approximately how many miles away from the Sun?",
            'C',"A. 9.3 million","B. 39 million","C. 93 million","D. 193 million"))

        Global.CorrectAnswer.add( Question(3,
            "Which insect shorted out an early supercomputer and inspired the term computer bug?",
            'A',"A. Moth","B. Roach","C. Fly","D. Japanese beetle"))

        Global.CorrectAnswer.add( Question(4,
            "Which of the following landlocked countries is entirely contained within another country?",
            'A',"A. Lesotho","B. Burkina Faso","C. Mongolia","D. Luxembourg"))

        Global.CorrectAnswer.add( Question(5,
            "In the children’s book series, where is Paddington Bear originally from?",
            'B',"A. India","B. Peru","C. Canada","D. Iceland"))

        Global.CorrectAnswer.add( Question(6,
            "Who is credited with inventing the first mass-produced helicopter?",
            'A',"A. Igor Sikorsky","B. Elmer Sperry","C. Ferdinand von Zeppelin","D. Gottlieb Daimler"))

        Global.CorrectAnswer.add( Question(7,
            "What letter must appear on the beginning of the registration number of all non-military aircraft in the US?",
            'A',"A. N","B. A","C. U","D. L"))

        Global.CorrectAnswer.add( Question(8,
            "During World War II, US soldiers used the first commercial aerosol cans to hold what?",
            'C',"A. Cleaning fluid","B. Antiseptic","C. Insecticide","D. Shaving cream"))

        Global.CorrectAnswer.add( Question(9,
            "Famous pediatrician and author Dr. Benjamin Spock won an Olympic gold medal in what sport?",
            'B',"A. Swimming","B. Rowing ","C. Fencing","D. Sailing"))

        Global.CorrectAnswer.add( Question(10,
            "What club did astronaut Alan Shepard use to make his famous golf shot on the moon?",
            'C',"A. Nine iron","B. Sand wedge","C. Six iron","D. Seven iron"))


        btnplay.setOnClickListener()
        {
            val start  : Intent = Intent(this@MainActivity,Question01Activity::class.java)

             startActivity(start)
        }

        btnhelp.setOnClickListener()
        {
            val start  : Intent = Intent(this@MainActivity,HelpActivity::class.java)

            startActivity(start)
        }
    }
}