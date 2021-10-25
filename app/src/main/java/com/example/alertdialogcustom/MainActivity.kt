package com.example.alertdialogcustom

import android.app.Dialog
import android.content.Context
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.DialogFragment
import com.example.alertdialogcustom.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn1.setOnClickListener {
            val df = AlertDialogFragment(this)
            df.showNow(this.supportFragmentManager, "TAG")
        }

        binding.btn2.setOnClickListener{
            val df = CustomDialogFragment(this)
            df.showNow(this.supportFragmentManager, "TAG2")
        }

        binding.btn3.setOnClickListener{
            val df = CustomDialogFragment3(this)
            df.showNow(this.supportFragmentManager, "TAG3")
        }
    }



}