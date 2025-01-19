/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.model.classes;

import jakarta.persistence.Embeddable;
import java.io.Serializable;
/**
 *
 * @author masou
 */
@Embeddable
public class Konto implements Serializable {
    
    private String iban;
    private String bic;
    private String inhaber;
    private String kreditinstitut;

    public Konto() { super(); }
    
    public Konto(String iban, String bic, String inhaber, String kreditinstitut) {
        this.iban = iban;
        this.bic = bic;
        this.inhaber = inhaber;
        this.kreditinstitut = kreditinstitut;
    }

        
    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getBic() {
        return bic;
    }

    public void setBic(String bic) {
        this.bic = bic;
    }

    public String getInhaber() {
        return inhaber;
    }

    public void setInhaber(String inhaber) {
        this.inhaber = inhaber;
    }

    public String getKreditinstitut() {
        return kreditinstitut;
    }

    public void setKreditinstitut(String kreditinstitut) {
        this.kreditinstitut = kreditinstitut;
    }
    
    
}
