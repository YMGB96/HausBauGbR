package com.mycompany.web.beans;
 
import com.mycompany.dao.GenericDao;
import com.mycompany.dao.VerantwortlichkeitenDao;
import com.mycompany.model.classes.Benutzer;
import com.mycompany.model.classes.Mietobjekt;
import com.mycompany.model.classes.Verantwortlichkeiten;
import com.mycompany.services.ServiceTemplate;
import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;


@Named(value = "verantwortlichkeiten") 
@ViewScoped  
public class VerantwortlichkeitenBean extends BeanTemplate<Verantwortlichkeiten, ServiceTemplate<Verantwortlichkeiten, VerantwortlichkeitenDao>>
{ 
  //-------------------------------------------------------------------------
  //  Constructor(s)
  //-------------------------------------------------------------------------     
    public VerantwortlichkeitenBean() { super(new ServiceTemplate<Verantwortlichkeiten, VerantwortlichkeitenDao>(new VerantwortlichkeitenDao())); } 

    @PostConstruct
    public void init()
    { 
        resetItem(); 
//        getItemList().add(new Raum("A120", "IT Fachraum"));
//        getItemList().add(new Raum("A121", "Lehrerzimmer"));
//        getItemList().add(new Raum("A122", "IT Fachraum"));
//        getItemList().add(new Raum("A123", "IT Fachraum"));
    }
 
 
  //-------------------------------------------------------------------------
  //  Mieter
  //-------------------------------------------------------------------------  
    public void addBenutzer(Benutzer b)
    {
        try        
        {
            getItem().addBenutzer(b);
            getService().getDao().save(getItem());
            new GenericDao<Benutzer>(Benutzer.class).save(b); 
        } 
        catch (Exception e)
        { 
            handleException("Fehler", e); 
        }
    }
    
    public void removeBenutzer(Verantwortlichkeiten v)
    {
        if (v == null || !v.hasBenutzer()) { return; }
        try        
        {
            Benutzer b = v.getBenutzer();
            v.setBenutzer(null);
            b.setVerantwortlichkeiten(null);
            getService().getDao().save(v);
            new GenericDao<Benutzer>(Benutzer.class).save(b);
        } 
        catch (Exception e)
        {
            handleException("Fehler", e); 
        }
    }
    
    
  //-------------------------------------------------------------------------
  //  Mietobjekt
  //-------------------------------------------------------------------------  
    public void addHardware(Verantwortlichkeiten v, Mietobjekt mo)
    {
        try        
        {
            v.addMietobjekt(mo);
            getService().getDao().save(v);
            new GenericDao<Mietobjekt>(Mietobjekt.class).save(mo); 
        } 
        catch (Exception e)
        { 
            handleException("Fehler", e); 
        } 
    }
    
    public void removeHardware(Mietobjekt mo)
    { 
        if (mo == null || !mo.hasMietvertrag()) { return; }
        try        
        {
            Verantwortlichkeiten v = mo.getVerantwortlichkeiten(); 
            v.removeMietobjekt(mo); 
            getService().getDao().save(v);
            new GenericDao<Mietobjekt>(Mietobjekt.class).save(mo); 
        } 
        catch (Exception e)
        {
            handleException("Fehler", e); 
        }
    }   
 
    
    
}
