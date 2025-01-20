/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.model.classes;

import com.mycompany.model.template.ModelTemplate;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.util.HashSet;
import java.util.Set;
/**
 *
 * @author masou
 */
@Entity
@Table(name = "mietvertrag")
public class Mietvertrag extends ModelTemplate{
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    protected long id = -1L;
    @OneToMany(mappedBy = "mietvertrag", fetch = FetchType.EAGER, cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    protected Set<Mietobjekt> mietobjektList = null;
    @OneToOne(fetch = FetchType.EAGER, cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    @JoinColumn(name = "mieter_id")
    protected Mieter mieter = null;
    
    public Mietvertrag() { super(); }

    @Override
    public long getId(){
        return this.id;
    }
    
    @Override
    public void setId(long id) {
            this.id = id;
    }
    
    public Set<Mietobjekt> getMietobjektList(){
        if (mietobjektList == null){
            mietobjektList = new HashSet<>();
    }
        return mietobjektList;
    }

    public void setMietobjektList(Set<Mietobjekt> mietobjektList) {
        this.mietobjektList = mietobjektList;
    }
    
    public Mieter getMieter() {
        return mieter;
    }

    public void setMieter(Mieter mieter) {
        this.mieter = mieter;
    }
    
    //Mietobjekte bearbeiten
    
    public boolean hasMietobjekt(){
        return (mietobjektList != null && !mietobjektList.isEmpty());
    }
    
    public void addMietobjekt(Mietobjekt m){
        if (m != null && m.hasId()){
            getMietobjektList().add(m);
            m.setMietvertrag(this);
        }
    }
    
    public void removeMietobjekt(Mietobjekt m){
        if (hasMietobjekt()){
            getMietobjektList().remove(m);
            m.setMietvertrag(null);
        }
    }
    
    //Mieter bearbeiten
    
    public boolean hasMieter(){
        return (this.mieter != null);
    }
    
    public void addMieter(Mieter m){
        if (m != null && m.hasId()){
            this.mieter = m;
            m.setMietvertrag(this);
        }
    }
    
    public void removeMieter(){
        this.mieter.setMietvertrag(null);
        this.mieter = null;
    }
        
}
