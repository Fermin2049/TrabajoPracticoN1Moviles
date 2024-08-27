package com.fermin2049.practicodiccionario;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.ViewModelProvider;

import com.fermin2049.practicodiccionario.databinding.ActivityIntroBinding;
import com.fermin2049.practicodiccionario.databinding.ActivityTraslateBinding;

public class TraslateActivity extends AppCompatActivity {
    ActivityTraslateBinding binding;
    ViewModelTraslate modelTraslate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTraslateBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        modelTraslate = ViewModelProvider.AndroidViewModelFactory.getInstance(getApplication()).create(ViewModelTraslate.class);



        // Observar el LiveData<Word>
        modelTraslate.getWordLiveData().observe(this, word -> {
            binding.textViewEnglish.setText(word.getEnglish());
            binding.imageEnglish.setImageResource(word.getImage());
        });

        // Obtener el Intent y rescatar los datos
        Intent intent = getIntent();
        modelTraslate.rescueData(intent);
    }
}