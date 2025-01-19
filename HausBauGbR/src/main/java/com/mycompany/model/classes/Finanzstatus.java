/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.model.classes;

import com.mycompany.model.enums.FinanzstatusTyp;
import jakarta.persistence.Embeddable;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import java.io.Serializable;
import java.util.Date;
/**
 *
 * @author masou
 */
@Embeddable
public class Finanzstatus implements Serializable{
    
    @Enumerated(EnumType.STRING) 
    private FinanzstatusTyp finanzStatusTyp;
    private int betragEur;
    private Date datum;

    public Finanzstatus()  { super(); }
    
    public Finanzstatus(FinanzstatusTyp finanzStatusTyp, int betragEur, Date datum) {
        this.finanzStatusTyp = finanzStatusTyp;
        this.betragEur = betragEur;
        this.datum = datum;
    }

    public FinanzstatusTyp getFinanzStatusTyp() {
        return finanzStatusTyp;
    }

    public void setFinanzStatusTyp(FinanzstatusTyp finanzStatusTyp) {
        this.finanzStatusTyp = finanzStatusTyp;
    }

    public int getBetragEur() {
        return betragEur;
    }

    public void setBetragEur(int betragEur) {
        this.betragEur = betragEur;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }
    
    
    
    
}
