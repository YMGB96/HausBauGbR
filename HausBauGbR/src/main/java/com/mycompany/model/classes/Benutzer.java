/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.model.classes;

/**
 *
 * @author masou
 */
public class Benutzer {
    
    private Boolean istAdmin;
    private String vorname;
    private String nachname;
    private Adresse anschrift;
    private String telefonFestnetz;
    private String telefonMobil;
    private String email;
    private String benutzerName;
    private String passwort;

    public Boolean getIstAdmin() {
        return istAdmin;
    }

    public void setIstAdmin(Boolean istAdmin) {
        this.istAdmin = istAdmin;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public Adresse getAnschrift() {
        return anschrift;
    }

    public void setAnschrift(Adresse anschrift) {
        this.anschrift = anschrift;
    }

    public String getTelefonFestnetz() {
        return telefonFestnetz;
    }

    public void setTelefonFestnetz(String telefonFestnetz) {
        this.telefonFestnetz = telefonFestnetz;
    }

    public String getTelefonMobil() {
        return telefonMobil;
    }

    public void setTelefonMobil(String telefonMobil) {
        this.telefonMobil = telefonMobil;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBenutzerName() {
        return benutzerName;
    }

    public void setBenutzerName(String benutzerName) {
        this.benutzerName = benutzerName;
    }

    public String getPasswort() {
        return passwort;
    }

    public void setPasswort(String passwort) {
        this.passwort = passwort;
    }
    
    
    
}
