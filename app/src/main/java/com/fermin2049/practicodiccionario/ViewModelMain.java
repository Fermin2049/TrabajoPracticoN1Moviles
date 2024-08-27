package com.fermin2049.practicodiccionario;

import android.app.Application;
import android.content.Intent;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;


public class ViewModelMain extends AndroidViewModel {
    private final MutableLiveData<Intent> navigateToActivity = new MutableLiveData<>();
    LiveData<String> mutableWord;

    public ViewModelMain(@NonNull Application application) {
        super(application);
    }



    public void verificationWord(String word){
        if (word.isEmpty()){
            Toast.makeText(getApplication(), "Ingrese una Palabra", Toast.LENGTH_SHORT).show();
        }else {
            Intent intent = new Intent(getApplication(), TraslateActivity.class);
            intent.putExtra("word",word);
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            getApplication().startActivity(intent);

        }
    }

}
