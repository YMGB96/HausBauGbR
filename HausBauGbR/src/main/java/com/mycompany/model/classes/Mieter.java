/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.model.classes;

import com.mycompany.model.template.ModelTemplate;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
/**
 *
 * @author masou
 */
@Entity
@Table(name = "mieter")
public class Mieter extends ModelTemplate{
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    protected long id = -1L; 
    private String anrede;
    private String vorname;
    private String nachname;
    @Embedded
    private Adresse anschriftAlt;
    private String telefonFestnetz;
    private String telefonMobil;
    private String email;
    @Embedded
    private Konto kontoverbindung;
    private Mietobjekt gemietetesObjekt;
    private String dokument;
    @ManyToOne(fetch=FetchType.EAGER) // cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH}, 
    @JoinColumn(name="mietvertrag_id")
    protected Mietvertrag mietvertrag = null;

    public Mieter() { super(); }

    public Mieter(String anrede, String vorname, String nachname, Adresse anschriftAlt, String telefonFestnetz, String telefonMobil, String email, Konto kontoverbindung, Mietobjekt gemietetesObjekt, String dokument) {
        this.anrede = anrede;
        this.vorname = vorname;
        this.nachname = nachname;
        this.anschriftAlt = anschriftAlt;
        this.telefonFestnetz = telefonFestnetz;
        this.telefonMobil = telefonMobil;
        this.email = email;
        this.kontoverbindung = kontoverbindung;
        this.gemietetesObjekt = gemietetesObjekt;
        this.dokument = dokument;
    }
    
    @Override
    public long getId() { return this.id; }

    @Override
    public void setId(long id) { this.id = id; }
    
    public String getAnrede() {
        return anrede;
    }

    public void setAnrede(String anrede) {
        this.anrede = anrede;
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

    public Adresse getAnschriftAlt() {
        return anschriftAlt;
    }

    public void setAnschriftAlt(Adresse anschriftAlt) {
        this.anschriftAlt = anschriftAlt;
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

    public Konto getKontoverbindung() {
        return kontoverbindung;
    }

    public void setKontoverbindung(Konto kontoverbindung) {
        this.kontoverbindung = kontoverbindung;
    }

    public Mietobjekt getGemietetesObjekt() {
        return gemietetesObjekt;
    }

    public void setGemietetesObjekt(Mietobjekt gemietetesObjekt) {
        this.gemietetesObjekt = gemietetesObjekt;
    }

    public String getDokument() {
        return dokument;
    }

    public void setDokument(String dokument) {
        this.dokument = dokument;
    }
        
    public Mietvertrag getMietvertrag() {
        return mietvertrag;
    }

    public void setMietvertrag(Mietvertrag mietvertrag) {
        this.mietvertrag = mietvertrag;
    }
    
}
