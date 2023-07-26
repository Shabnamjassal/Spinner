package com.shivani.spinner

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Adapter
import android.widget.AdapterView
import android.widget.AdapterView.OnItemSelectedListener
import android.widget.ArrayAdapter
import android.widget.BaseAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var staticSpinner: Spinner
    lateinit var dynamicSpinner: Spinner
    lateinit var dynamicAdapter: ArrayAdapter<StudentModel>
    var spinnerList = arrayListOf<StudentModel>()
    lateinit var staticSpinnerAdapter: ArrayAdapter<String>
    var simpleList = arrayOf("Orange", "Green", "Pink")
    var booleanArray = booleanArrayOf(false, false, false)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        staticSpinner = findViewById(R.id.staticSpinner)
        dynamicSpinner = findViewById(R.id.dynamicSpinner)

        staticSpinnerAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, simpleList)
        staticSpinner.adapter = staticSpinnerAdapter

        spinnerList.add(StudentModel("Testing", 1))
        spinnerList.add(StudentModel("Test", 2))
        spinnerList.add(StudentModel("Tested", 3))
        dynamicAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, spinnerList)
        dynamicSpinner.adapter = dynamicAdapter

        dynamicSpinner.onItemSelectedListener = object : OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, position: Int, p3: Long) {
                System.out.println("selectedItem ${spinnerList.get(position)}")
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }
    }

}


