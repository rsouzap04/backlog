package com.example.crashlog;

import android.util.Log;


//Classe Biblioteca (lib) para ser usada em outros projetos
//File - new module - android library

public final class CrashLog {

    public static void print(String message){
        Log.d("CrashLog", message);
    }
}
