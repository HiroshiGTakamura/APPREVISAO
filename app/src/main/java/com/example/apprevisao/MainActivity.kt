package com.example.apprevisao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val testButton = findViewById<Button>(R.id.testButton)
        testButton.setOnClickListener{testFunction()}
    }

    private fun testFunction(){
        val firstInput = findViewById<EditText>(R.id.firstNumber).text.toString().toFloat()
        val secondInput = findViewById<EditText>(R.id.secondNumber).text.toString().toFloat()
        var testResult = ""

        if (firstInput > secondInput){
            testResult = "Campo 1 é maior que o Campo 2"
        }
        if (firstInput < secondInput){
            testResult = "Campo 2 é maior que o Campo 1"
        }
        if (firstInput == secondInput){
            testResult = "Campo 1 é igual ao Campo 2"
        }

        Toast.makeText(this, testResult, Toast.LENGTH_SHORT).show()
    }
}