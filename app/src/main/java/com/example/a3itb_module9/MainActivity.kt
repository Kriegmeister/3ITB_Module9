package com.example.a3itb_module9

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var regularProperty = 1
    override fun onCreate(savedInstanceState: Bundle?) {



        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var instanceClass = newInnerClass()
        instanceClass.newInnerFunction(this, "Sample Message")
    }

    inner class newInnerClass() {
         var innerString : String = "sample property"

        fun newInnerFunction(innerContext : Context, innerMessage : String) {
            regularProperty++
            Toast.makeText(innerContext, innerMessage, Toast.LENGTH_SHORT).show()
        }
    }
}