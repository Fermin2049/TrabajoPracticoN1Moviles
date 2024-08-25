package com.fermin2049.practicodiccionario;

public class Word {
    private String spanish;
    private  String english;
    private int image;

    public Word(String spanish, String english, int image) {
        this.spanish = spanish;
        this.english = english;
        this.image = image;
    }

    public String getSpanish() {
        return spanish;
    }

    public void setSpanish(String spanish) {
        this.spanish = spanish;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
