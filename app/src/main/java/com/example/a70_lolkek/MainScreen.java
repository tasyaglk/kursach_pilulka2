package com.example.a70_lolkek;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainScreen extends AppCompatActivity {

    private ImageView settings_button;
    private ImageView calendar_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_screen);

        settings_button = findViewById(R.id.settings_button);
        calendar_button = findViewById(R.id.calendar_button);

        settings_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Здесь будет переход в настройки
                Intent intent = new Intent(MainScreen.this, SettingsActivity.class);
                startActivity(intent);
            }
        });

        calendar_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Здесь будет переход в календарь
                Intent intent = new Intent(MainScreen.this, Calendar.class);
                startActivity(intent);
            }
        });
    }
}
