package com.opensurvey.uitext

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainbtn.setOnClickListener {

            Log.d("메인버튼","메인화면클릭확인")

        }

        subbtn.setOnClickListener {



        }



    }

}