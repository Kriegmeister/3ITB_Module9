package com.example.a3itb_module9

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    lateinit var dataList : ArrayList<DataClass>
    lateinit var imageList: Array<Int>
    lateinit var titleList: Array<String>

   // var regularProperty = 1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       imageList = arrayOf(
           R.drawable.ic_launcher_background,
           R.drawable.ic_launcher_background,
           R.drawable.ic_launcher_background,
           R.drawable.ic_launcher_background,
           R.drawable.ic_launcher_background,
           R.drawable.ic_launcher_background,
           R.drawable.ic_launcher_background,
           R.drawable.ic_launcher_background,
           R.drawable.ic_launcher_background,
           R.drawable.ic_launcher_background
       )

       titleList = arrayOf(
           "TitleOne",
           "TitleTwo",
           "TitleThree",
           "TitleFour",
           "TitleFive",
           "TitleSix",
           "TitleSeven",
           "TitleEight",
           "TitleNine",
           "TitleTen",
       )

       recyclerView = findViewById(R.id.recyclerView)
       recyclerView.layoutManager = LinearLayoutManager(this)
       recyclerView.setHasFixedSize(true)
       dataList = arrayListOf<DataClass>()
       getData()

        /*var instanceClass = newInnerClass()
        instanceClass.newInnerFunction(this, "Sample Message")*/
    }

   /* inner class newInnerClass() {
         var innerString : String = "sample property"

        fun newInnerFunction(innerContext : Context, innerMessage : String) {
            regularProperty++
            Toast.makeText(innerContext, innerMessage, Toast.LENGTH_SHORT).show()
        }
    }*/
    private fun getData() {
        for(i in imageList.indices) {
            var dataClass = DataClass(imageList[i], titleList[i])
            dataList.add(dataClass)
        }

       recyclerView.adapter = AdapterClass(dataList)
    }
}