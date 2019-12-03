package com.nilu.Dialpad


import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnOne.setOnClickListener { writeOTP(it) }
        btnTwo.setOnClickListener { writeOTP(it) }
        btnThree.setOnClickListener { writeOTP(it) }
        btnFour.setOnClickListener { writeOTP(it) }
        btnFive.setOnClickListener { writeOTP(it) }
        btnSix.setOnClickListener { writeOTP(it) }
        btnSeven.setOnClickListener { writeOTP(it) }
        btnEight.setOnClickListener { writeOTP(it) }
        btnNine.setOnClickListener { writeOTP(it) }
        btnZero.setOnClickListener { writeOTP(it) }

        fabClose.setOnClickListener { clearOTP() }
    }

    private fun writeOTP(view: View) {
        Log.e("CURRENT_TEXT :---> ", view.tag.toString())
        when {
            TextUtils.isEmpty(edtOne.text) -> edtOne.setText(view.tag.toString())
            TextUtils.isEmpty(edtTwo.text) -> edtTwo.setText(view.tag.toString())
            TextUtils.isEmpty(edtThree.text) -> edtThree.setText(view.tag.toString())
            TextUtils.isEmpty(edtFour.text) -> edtFour.setText(view.tag.toString())
        }

    }

    private fun clearOTP() {
        when {
            !TextUtils.isEmpty(edtFour.text) -> edtFour.setText("")
            !TextUtils.isEmpty(edtThree.text) -> edtThree.setText("")
            !TextUtils.isEmpty(edtTwo.text) -> edtTwo.setText("")
            !TextUtils.isEmpty(edtOne.text) -> edtOne.setText("")
        }

    }

}

