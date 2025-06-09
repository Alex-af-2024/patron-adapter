package com.afranco.adapter.main;

import com.afranco.adapter.interfaces.Warrior;

import java.util.ArrayList;
import java.util.List;

public class Torneo {
    private List<Warrior> warriors = new ArrayList<>();

    public void agregarWarrior(Warrior warrior){
        warriors.add(warrior);
    }

    public void pelear(){
        for(Warrior w : warriors){
            System.out.println("Ataque del guerrero: " + w.attack());
        }
    }
}
