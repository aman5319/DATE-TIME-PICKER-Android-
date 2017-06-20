package com.example.amidezcod.date_time_picker;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void showTime(View view) {
        timePicker timePicker = new timePicker();
        timePicker.show(getFragmentManager(), "time");
    }

    public void showDate(View view) {
        datePicker datePiker = new datePicker();
        datePiker.show(getFragmentManager(), "date");
    }
}
