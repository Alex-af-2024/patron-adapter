package com.afranco.adapter.adaptador;

import com.afranco.adapter.interfaces.Warrior;
import com.afranco.adapter.model.Android;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AndroidAdapterTest {
    @Test
    public void testAttack(){
        Android android = new Android();
        Warrior adaptado = new AndroidAdapter(android);

        assertEquals(7500, adaptado.attack()); // 7000+500
    }
}