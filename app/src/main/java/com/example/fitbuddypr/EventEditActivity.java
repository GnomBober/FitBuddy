package com.example.fitbuddypr;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class EventEditActivity extends AppCompatActivity
{
    private EditText eventNameET;
    private TextView Prots, Fats, Carbs, Cals;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_edit);
        initWidgets();
    }

    private void initWidgets()
    {
        Prots = findViewById(R.id.Prots);
        Fats = findViewById(R.id.Fats);
        Carbs = findViewById(R.id.Fats);
        Cals = findViewById(R.id.Cals);
    }

    public void AddRecord(View view) {
    }
}