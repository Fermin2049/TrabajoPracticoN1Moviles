package com.fermin2049.practicodiccionario;

import android.app.Application;
import android.content.Intent;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;

public class ViewModelTraslate extends AndroidViewModel {

    private final MutableLiveData<Word> wordMutableLiveData = new MutableLiveData<>();
    private final ArrayList<Word> listWord = new ArrayList<>();


    public ViewModelTraslate(@NonNull Application application) {
        super(application);
        listWord.add(new Word("casa","house",R.drawable.house));
        listWord.add(new Word("perro","dog",R.drawable.dog));
        listWord.add(new Word("gato","cat",R.drawable.cat));
        listWord.add(new Word("pelota","ball",R.drawable.ball));
        listWord.add(new Word("profesor","professor",R.drawable.teacher));

    }

    public LiveData<Word> getWordLiveData() {
        return wordMutableLiveData;
    }



    public void rescueData(Intent intent){
        String word = intent.getStringExtra("word");
        if (word != null){
            for (Word w : listWord){
                if (w.getSpanish().equals(word)){
                    wordMutableLiveData.setValue(w);
                    return;
                }
            }
            wordMutableLiveData.setValue(new Word("Palabra no encontrada","",R.drawable.error));
        }
    }


}
