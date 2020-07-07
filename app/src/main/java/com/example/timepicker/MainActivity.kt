package com.example.timepicker

import android.app.TimePickerDialog
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.annotation.RequiresApi
import java.util.*

class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);
    }

    @RequiresApi(Build.VERSION_CODES.N)
    fun clickTimePicker(view:View){
        val c = Calendar.getInstance();
        val hour = c.get(Calendar.HOUR);
        val minute = c.get(Calendar.MINUTE);
        val tpd = TimePickerDialog(this,
            // when button is clicked
            TimePickerDialog.OnTimeSetListener(
                function = {
                    view, h, m -> Toast.makeText(this,
                    "$h : $m : ",
                    Toast.LENGTH_LONG).show()
                }
            ), hour, minute, false);
        tpd.show();
    } // function end

}
