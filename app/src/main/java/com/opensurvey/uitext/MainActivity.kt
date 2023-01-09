package com.opensurvey.uitext

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainbtn.setOnClickListener {

            Log.d("메인버튼","메인화면클릭확인")
            Log.e("메인버튼","에러메세지")

            val userAge = 19

            if (userAge >= 20) {

                Log.d("성인판별","성인입니")
            }

            else if (userAge >= 17) {
                Log.d("성인판별","고딩입니다")
            }

            else {
                Log.d("성인판별","민짜입니다")
            }

        }


        //변수 만들기
        val myName = "김태홍" //
        var myAge : Int// variable : 변수





        myAge=35
        myAge=34

        subbtn.setOnClickListener {

            Toast.makeText(this, "아이디를 입력해 주세요", Toast.LENGTH_SHORT).show()
            Log.d("변수값",myName)



        }



    }

}