package com.marcelodebittencourt;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RoomTest {

    @Test
    void TestNewRoom(){
        //ENTRADA DE DADOS - MASSA
        int numerodoquarto = 200;
        String nomequarto = "Suite luxo";
        double valordiario = 500;

        //EXECUÇÃO DO TESTE
            Room quartoluxo = new Room(numerodoquarto,nomequarto,valordiario);


        // Resultado
        assertEquals(numerodoquarto, quartoluxo.getId());
        assertEquals(nomequarto, quartoluxo.getName());
        assertEquals(valordiario, quartoluxo.getPricePerDay() );




    }


    
}
