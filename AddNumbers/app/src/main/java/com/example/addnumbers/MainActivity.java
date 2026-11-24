package com.example.addnumbers;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.addnumbers.R;

public class MainActivity extends AppCompatActivity {

    EditText num1, num2;
    Button addBtn;
    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        addBtn = findViewById(R.id.addBtn);
        resultText = findViewById(R.id.resultText);

        addBtn.setOnClickListener(v -> {

            String a = num1.getText().toString().trim();
            String b = num2.getText().toString().trim();

            if (a.isEmpty() || b.isEmpty()) {
                Toast.makeText(this, "Enter both numbers",
                        Toast.LENGTH_SHORT).show();
                return;
            }

            double n1 = Double.parseDouble(a);
            double n2 = Double.parseDouble(b);

            double sum = n1 + n2;

            resultText.setText(String.valueOf(sum));
        });
    }
}
