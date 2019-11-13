package com.example.examenpmdm_alejandro_benitez;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.io.Serializable;

public class MedioTransporte implements Serializable{
        private String modelo;
        private String marca;
        private String precio;
        private int img;



    public MedioTransporte (String modelo, String marca, String precio, int img) {
        this.modelo = modelo;
        this.marca = marca;
        this.precio = precio;
        this.img = img;
    }
    public int getCount(){
        return  super.getCount();
    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return super.getView(position, convertView, parent);
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return super.getDropDownView(position, convertView, parent);
    }





}
