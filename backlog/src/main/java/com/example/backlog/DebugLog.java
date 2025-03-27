package com.example.backlog;

import android.util.Log;


//Classe Biblioteca (lib) para ser usada em outros projetos
//File - new module - android library

public final class DebugLog {

    public static void print(String message){
        Log.d("DebugLog", message);
    }
}
