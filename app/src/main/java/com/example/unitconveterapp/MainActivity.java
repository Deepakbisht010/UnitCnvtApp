package com.example.unitconveterapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private TextView textHead;
    private EditText textInput;
    private  TextView textShow;
    private Button button;
    private ImageView imageCv;
    private  TextView Author;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        textHead=findViewById(R.id.textHead);
        textInput=findViewById(R.id.textInput);
        textShow=findViewById(R.id.textShow);
        button=findViewById(R.id.button);
        imageCv=findViewById(R.id.imageCv);
        Author=findViewById(R.id.Author);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Wait For Answer !",Toast.LENGTH_SHORT).show();
                String s=textInput.getText().toString();
                int kg=Integer.parseInt(s);
                double pound=kg*2.205;
                textShow.setText("The Corresponding Value in Pound is : "+pound+" 👍");
            }
        });
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}