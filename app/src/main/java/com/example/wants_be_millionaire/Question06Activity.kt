package com.example.wants_be_millionaire

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast

class Question06Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question06)


        val btnconfirm : Button = findViewById<Button>(R.id.btnconfirm06)

        val radiogroup : RadioGroup = findViewById<RadioGroup>(R.id.rg_question6)

        val textquestion:TextView   = findViewById<TextView>(R.id.txtq06)

        val textmoney : TextView    = findViewById<TextView>(R.id.txtmoney06)


        val  rb01    :RadioButton  = findViewById<RadioButton>(R.id.q06_A)
        val  rb02    :RadioButton  = findViewById<RadioButton>(R.id.q06_B)
        val  rb03    :RadioButton  = findViewById<RadioButton>(R.id.q06_C)
        val  rb04    :RadioButton  = findViewById<RadioButton>(R.id.q06_D)

        var radiocheck=""

        val question= 5


        textmoney.text   =APP_TITLE_EARN +
                Global.MoneyScale[question].toString()+
                '\n'+
                (question +1).toString()+
                APP_NUM_QUESTIONS

        textquestion.text = Global.CorrectAnswer[question].questiondescription.toString()


        rb01.text = Global.CorrectAnswer[question].opt1
        rb02.text = Global.CorrectAnswer[question].opt2
        rb03.text = Global.CorrectAnswer[question].opt3
        rb04.text = Global.CorrectAnswer[question].opt4


        radiogroup.setOnCheckedChangeListener()
        { radioGroup: RadioGroup, i: Int ->


            val radioButton: RadioButton = findViewById<RadioButton>(i)

            radiocheck= radioButton.text.toString().substring(0,1)

        }


        btnconfirm.setOnClickListener()
        {


            if (radiocheck.toString()=="")
            {
                Toast.makeText(this@Question06Activity,APP_CONFIRM,
                    Toast.LENGTH_SHORT).show()

                return@setOnClickListener
            }


            if (Global.CorrectAnswer[question].correctanswer.toString() == radiocheck.toString())
            {

                Toast.makeText(this@Question06Activity,APP_EARN + Global.MoneyScale[question+1].toString(),
                    Toast.LENGTH_SHORT).show()

                Thread.sleep(2000)
                val intentnext : Intent = Intent(this@Question06Activity,Question07Activity::class.java)
                startActivity(intentnext)
            }
            else
            {
                val intentlose : Intent = Intent(this@Question06Activity,LoseActivity::class.java)
                startActivity(intentlose)
            }


        }
    }
}