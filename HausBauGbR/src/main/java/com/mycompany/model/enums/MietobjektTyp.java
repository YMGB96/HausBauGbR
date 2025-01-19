/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.model.enums;

/**
 *
 * @author Yannick
 */
public enum MietobjektTyp {
    
    WOHNUNG("Wohnung"),
    LADENLOKAL("Ladenlokal"),
    STELLPLATZ("Stellplatz"),
    GARAGE("Garage"),
    TIEFGARAGE("Tiefgarage"),
    SONSTIGES("Sonstiges");
      
    
    private final String mietTyp;
    
    private MietobjektTyp(String t){
        
        this.mietTyp = t;
    }

    public String getMiettyp() {
        return mietTyp;
    }
    
    
}
