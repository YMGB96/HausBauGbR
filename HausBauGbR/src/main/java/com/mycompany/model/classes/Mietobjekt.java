/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.model.classes;

/**
 *
 * @author masou
 */
public class Mietobjekt {
    
    private int ID;
    private int ObjektNr;
    private MietobjektTyp objektTyp;
    private Boolean objektPrivate;
    private String objektBeschreibung;
    private Adresse anschrift;
    private int wohnflaeche;
    private int m2PreisKalt;
    private int nebenkostenGes;
    private String notizfeld;
    private Mietobjekt verbundenesObjekt;
    private Mieter objektMieter;
    private Ansprechpartner ansprechpartner;
    private Finanzstatus finanzstatus;
    private String dokument;
    
    
    public int nebenkostenM2() {
        return 0;
    }
    
    public int m2PreisWarm() {
        return 0;
    }
    
    public int mieteKalt() {
        return 0;
    }
    
    public int mieteWarm() {
        return 0;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getObjektNr() {
        return ObjektNr;
    }

    public void setObjektNr(int ObjektNr) {
        this.ObjektNr = ObjektNr;
    }

    public MietobjektTyp getObjektTyp() {
        return objektTyp;
    }

    public void setObjektTyp(MietobjektTyp objektTyp) {
        this.objektTyp = objektTyp;
    }

    public Boolean getObjektPrivate() {
        return objektPrivate;
    }

    public void setObjektPrivate(Boolean objektPrivate) {
        this.objektPrivate = objektPrivate;
    }

    public String getObjektBeschreibung() {
        return objektBeschreibung;
    }

    public void setObjektBeschreibung(String objektBeschreibung) {
        this.objektBeschreibung = objektBeschreibung;
    }

    public Adresse getAnschrift() {
        return anschrift;
    }

    public void setAnschrift(Adresse anschrift) {
        this.anschrift = anschrift;
    }

    public int getWohnflaeche() {
        return wohnflaeche;
    }

    public void setWohnflaeche(int wohnflaeche) {
        this.wohnflaeche = wohnflaeche;
    }

    public int getM2PreisKalt() {
        return m2PreisKalt;
    }

    public void setM2PreisKalt(int m2PreisKalt) {
        this.m2PreisKalt = m2PreisKalt;
    }

    public int getNebenkostenGes() {
        return nebenkostenGes;
    }

    public void setNebenkostenGes(int nebenkostenGes) {
        this.nebenkostenGes = nebenkostenGes;
    }

    public String getNotizfeld() {
        return notizfeld;
    }

    public void setNotizfeld(String notizfeld) {
        this.notizfeld = notizfeld;
    }

    public Mietobjekt getVerbundenesObjekt() {
        return verbundenesObjekt;
    }

    public void setVerbundenesObjekt(Mietobjekt verbundenesObjekt) {
        this.verbundenesObjekt = verbundenesObjekt;
    }

    public Mieter getObjektMieter() {
        return objektMieter;
    }

    public void setObjektMieter(Mieter objektMieter) {
        this.objektMieter = objektMieter;
    }

    public Ansprechpartner getAnsprechpartner() {
        return ansprechpartner;
    }

    public void setAnsprechpartner(Ansprechpartner ansprechpartner) {
        this.ansprechpartner = ansprechpartner;
    }

    public Finanzstatus getFinanzstatus() {
        return finanzstatus;
    }

    public void setFinanzstatus(Finanzstatus finanzstatus) {
        this.finanzstatus = finanzstatus;
    }

    public String getDokument() {
        return dokument;
    }

    public void setDokument(String dokument) {
        this.dokument = dokument;
    }
    
    
    
}
