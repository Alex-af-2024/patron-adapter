package com.afranco.adapter.main;

import com.afranco.adapter.adaptador.AndroidAdapter;
import com.afranco.adapter.interfaces.Warrior;
import com.afranco.adapter.model.Android;
import com.afranco.adapter.model.Namekian;
import com.afranco.adapter.model.Saiyan;

public class Main {
    public static void main(String[] args) {
        Torneo torneo = new Torneo();

        torneo.agregarWarrior(new Saiyan());
        torneo.agregarWarrior(new Namekian());

        Android android = new Android();
        Warrior adaptado = new AndroidAdapter(android);
        torneo.agregarWarrior(adaptado);

        torneo.pelear();
    }
}
