package com.opensurvey.uitext

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import org.w3c.dom.Text
import java.time.Duration
import kotlin.coroutines.jvm.internal.CompletedContinuation.context
import kotlin.math.log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        subbtn.setOnClickListener{

            val age=30
            if (age>29) {

                Toast.makeText("good",Int)



            }

        }







    }

}