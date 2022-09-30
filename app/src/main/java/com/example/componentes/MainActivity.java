package com.example.componentes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.componentes.databinding.ActivityMainBinding;

import java.security.acl.Group;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.RadioB1.setOnClickListener(this);
        binding.RadioB2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (binding.RadioB1.isChecked()){
            Toast.makeText(this, "Opción 1", Toast.LENGTH_SHORT).show();
        } else if (binding.RadioB2.isChecked()){
            Toast.makeText(this, "Opción 2", Toast.LENGTH_SHORT).show();
        }
    }

    public void check(View view) {
        boolean marcado = ((CheckBox)view).isChecked();

        switch (view.getId()){
            case R.id.Check1:
                if (marcado)
                    Toast.makeText(this, "Check 1", Toast.LENGTH_SHORT).show();
                break;
            case R.id.Check2:
                if (marcado)
                    Toast.makeText(this, "Check 2", Toast.LENGTH_SHORT).show();
                break;

        }

    }
}