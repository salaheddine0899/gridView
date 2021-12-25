package com.example.grid;

public class CharacterAnime {
    private String _name;
    private int _img;
    public CharacterAnime(String name,int img){
        _name=name;
        _img=img;
    }
    public String get_name(){
        return _name;
    }
    public int get_img(){
        return _img;
    }
    public void set_name(String name){
        _name=name;
    }
    public void set_img(int img){
        _img=img;
    }
}
