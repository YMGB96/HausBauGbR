package com.mycompany.web.beans;
 
import com.mycompany.model.classes.Adresse;
import com.mycompany.model.classes.Benutzer;
import com.mycompany.services.BenutzerService;
import java.util.List;
import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.SessionScoped;
import jakarta.faces.context.FacesContext; 
import jakarta.inject.Named;
import jakarta.servlet.http.HttpSession;

@Named(value = "benutzer") 
@SessionScoped 
public class BenutzerBean extends BeanTemplate<Benutzer, BenutzerService> {

    public BenutzerBean() {
        super(new BenutzerService());
    }

    @PostConstruct
    public void init() {
        resetItem();

        Adresse adresse1 = new Adresse("Teststraße", "86",
                "12345", "Testort", "Testland");
        Benutzer benutzer1 = new Benutzer(true, "admin",
                "admin", adresse1, "123456",
                "0049123456789", "admin@admin.com",
                "admin", "admin");
        Benutzer benutzer2 = new Benutzer(false, "user",
                "user", adresse1, "654321",
                "0049987654321", "user@user.com",
                "user", "user");

        try {
            // Wenn die Datenbank frisch erstellt wurde und es noch keine
            // Benutzer gibt, werden diese zwei Benutzer standardmäßig
            // hinzugefügt
            List<Benutzer> benutzerInDB = getService().getDao().list();
            boolean match = benutzerInDB.stream()
                    .anyMatch(benutzer -> benutzer.getBenutzerName()
                            .equals(benutzer1.getBenutzerName()));
            if (!match) {
                getItemList().add(benutzer1);
                saveItem(benutzer1);
            }
            match = benutzerInDB.stream()
                    .anyMatch(benutzer -> benutzer.getBenutzerName()
                            .equals(benutzer2.getBenutzerName()));
            if (!match) {
                getItemList().add(benutzer2);
                saveItem(benutzer2);
            }
        } catch (Exception e) {
            System.err.println("Konnte keine Liste finden. " + e);
        }
    }

  //-------------------------------------------------------------------------
  //  Benutzerdaten
  //-------------------------------------------------------------------------     
    protected String benutzername = null;
    protected String passwort = null;

    public String getBenutzername() {
        return benutzername;
    }

    public void setBenutzername(String benutzername) {
        this.benutzername = benutzername;
    }

    public String getPasswort() {
        return passwort;
    }

    public void setPasswort(String passwort) {
        this.passwort = passwort;
    }

  //-------------------------------------------------------------------------
  //  Login / Logout
  //-------------------------------------------------------------------------     
    public String doLogin() {
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
        return "backend/landing.xhtml?faces-redirect=true"; 
    }

    public String doLogout() {
        HttpSession websession = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true); 
        websession.removeAttribute("MyLoginObject"); 
        return "/login.xhtml?faces-redirect=true";
    }

}
