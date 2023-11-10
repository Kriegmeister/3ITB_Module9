package com.example.a3itb_module9

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class SharedActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shared)

        var sharePreferences = getSharedPreferences("Stored_Values", MODE_PRIVATE)
        var sharedEditor = sharePreferences.edit()

        var edtEmpName : EditText = findViewById(R.id.edtEmpName)
        var edtEmpDepartment : EditText = findViewById(R.id.edtEmpDepartment)
        var editEmpSalary : EditText = findViewById(R.id.edtEmpSalary)
        var buttonSave : Button = findViewById(R.id.btnSave)
        var buttonGet : Button = findViewById(R.id.btnGet)

        buttonSave.setOnClickListener{
            try {

                sharedEditor.putString("EmpName", edtEmpName.text.toString())
                sharedEditor.putString("EmpDept", edtEmpDepartment.text.toString())
                sharedEditor.putInt("EmpSalary", editEmpSalary.text.toString().toInt())
                sharedEditor.apply()
                Toast.makeText(this, "Added Successfully", Toast.LENGTH_SHORT).show()
            }catch (e: Exception){
                Toast.makeText(this, e.message.toString(), Toast.LENGTH_SHORT).show()
            }

        }
        buttonGet.setOnClickListener {
            Toast.makeText(this, sharePreferences.getString("EmpName",""), Toast.LENGTH_LONG).show()
        }
    }
}