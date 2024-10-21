package com.android.jnitest3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.android.jnitest3.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    // Used to load the 'jnitest3' library on application startup.

    JniLibrary jniLibrary  = new JniLibrary();

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Example of a call to a native method
        TextView tv = binding.sampleText;
        tv.setText(jniLibrary.stringFromJNI());

        binding.btnAdd.setOnClickListener(v->{
            calculation(1);
        });

        binding.btnSub.setOnClickListener(v->{
            calculation(2);
        });

        binding.btnMult.setOnClickListener(v->{
            calculation(3);
        });

        binding.btnDivi.setOnClickListener(v->{
            calculation(4);
        });
    }

    void calculation(int a){
        String txt1 = binding.text1.getText().toString();
        String txt2 = binding.text2.getText().toString();

        if(txt1.isEmpty()){
            txt1 = "0";
        }
        if(txt2.isEmpty()){
            txt2 = "0";
        }
        int x = Integer.parseInt(txt1);
        int y = Integer.parseInt(txt2);

        int result = 0;
        switch (a){
            case 1:
                result = jniLibrary.add(x, y);
                break;
            case 2:
                result = jniLibrary.sub(x, y);
                break;
            case 3:
                result = jniLibrary.multiply(x, y);
                break;
            case 4:
                result = jniLibrary.divide(x, y);
                break;

        }

        binding.txtResult.setText(""+result);
    }


}