/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.model.enums;

/**
 *
 * @author Yannick
 */
public enum FinanzstatusTyp {
    
    ZAHLUNGSEINGANG("Zahlungseingang"),
    NEBENKOSTENABRECHNUNG("Nebenkostenabrechnung"),
    MIETKOSTENABRECHNUNG("Mietkostenabrechnung");
    
    private final String finanzTyp;

    private FinanzstatusTyp(String finanzTyp) {
        this.finanzTyp = finanzTyp;
    }

    public String getFinanzTyp() {
        return finanzTyp;
    }
    
    
}
