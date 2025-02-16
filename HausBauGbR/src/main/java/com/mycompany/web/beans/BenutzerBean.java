package com.mycompany.web.beans;
 

import com.mycompany.model.classes.Benutzer;
import com.mycompany.services.BenutzerService;
import java.util.Arrays;
import java.util.List;
import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.SessionScoped;
import jakarta.faces.context.FacesContext; 
import jakarta.inject.Named;
import jakarta.servlet.http.HttpSession;


@Named(value = "benutzer") 
@SessionScoped 
public class BenutzerBean extends BeanTemplate<Benutzer, BenutzerService>
{
  //-------------------------------------------------------------------------
  //  Constructor(s)
  //-------------------------------------------------------------------------     
    public BenutzerBean() { super(new BenutzerService()); } 

    @PostConstruct
    public void init()
    { 
        resetItem(); 
    }



 
    
  //-------------------------------------------------------------------------
  //  Benutzerdaten
  //-------------------------------------------------------------------------     
    protected String benutzername = null;
    protected String passwort = null;

    public String getBenutzername() { return benutzername; }

    public void setBenutzername(String benutzername) { this.benutzername = benutzername; }

    public String getPasswort() { return passwort; }

    public void setPasswort(String passwort) { this.passwort = passwort; }
      
    
  //-------------------------------------------------------------------------
  //  Login / Logout
  //-------------------------------------------------------------------------     
    public String doLogin() 
    {  
        /*
            CHECK USER CREDENTIALS HERE !!!
            If correct, then store the MyLoginObject in the session --> websession.setAttribute("MyLoginObject", true) 
            The de.hhbk.web.filter.BackendAreaFilter will check the MyLoginObject for the backend folder path.
            Remove the MyLoginObject on logout (see doLogout()). 
            Session timeout (see web.xml) will automatically delete all session objects.
        */  
        HttpSession websession = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true); 
        websession.setAttribute("MyLoginObject", true); 
        // The return parameter is the navigation path to the next website.
        return "backend/empty.xhtml?faces-redirect=true"; 
    } 
    
    public String doLogout() 
    {  
        HttpSession websession = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true); 
        websession.removeAttribute("MyLoginObject"); 
        return "/login.xhtml?faces-redirect=true";
    }  
    
    
    
}
