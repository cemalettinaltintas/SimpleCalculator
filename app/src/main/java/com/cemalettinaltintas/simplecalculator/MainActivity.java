package com.cemalettinaltintas.simplecalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.cemalettinaltintas.simplecalculator.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    /*
    EditText number1Text;
    EditText number2Text;
    TextView resultText;
     */
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        /*
        number1Text=findViewById(R.id.number1Text);
        number2Text=findViewById(R.id.number2Text);
        resultText=findViewById(R.id.resultText);
         */
    }

    public void sum(View view) {
        if (binding.number1Text.getText().toString().matches("") || binding.number2Text.getText().toString().matches("")){
            binding.resultText.setText("Enter number");
        }else{
            int number1= Integer.parseInt(binding.number1Text.getText().toString());
            int number2= Integer.parseInt(binding.number2Text.getText().toString());
            binding.resultText.setText("Result :"+(number1+number2));
        }
    }

    public void deduct(View view) {
        if (binding.number1Text.getText().toString().matches("") || binding.number2Text.getText().toString().matches("")){
            binding.resultText.setText("Enter number");
        }else{
            int number1= Integer.parseInt(binding.number1Text.getText().toString());
            int number2= Integer.parseInt(binding.number2Text.getText().toString());
            binding.resultText.setText("Result :"+(number1-number2));
        }
    }

    public void multiply(View view) {
        if (binding.number1Text.getText().toString().matches("") || binding.number2Text.getText().toString().matches("")){
            binding.resultText.setText("Enter number");
        }else{
            int number1= Integer.parseInt(binding.number1Text.getText().toString());
            int number2= Integer.parseInt(binding.number2Text.getText().toString());
            binding.resultText.setText("Result :"+(number1*number2));
        }
    }

    public void divide(View view) {
        if (binding.number1Text.getText().toString().matches("") || binding.number2Text.getText().toString().matches("")){
            binding.resultText.setText("Enter number");
        }else{
            double number1= Double.parseDouble(binding.number1Text.getText().toString());
            int number2= Integer.parseInt(binding.number2Text.getText().toString());
            if (number2==0){
                binding.resultText.setText("The second number cannot be zero!");
                binding.number2Text.setText("");
                return;
            }
            binding.resultText.setText("Result :"+(number1/number2));
        }
    }
}