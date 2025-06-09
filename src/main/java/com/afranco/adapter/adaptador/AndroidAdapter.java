package com.afranco.adapter.adaptador;

import com.afranco.adapter.interfaces.Warrior;
import com.afranco.adapter.model.Android;

public class AndroidAdapter implements Warrior {
    private Android android;

    public AndroidAdapter(Android android) {
        this.android = android;
    }

    @Override
    public int attack() {
        return android.punch() + android.kick(); // suma sus ataques.
    }
}

/*Usaremos esta clase para crear instancias de Android pero con la
implementacion de interface Warrior.*/
