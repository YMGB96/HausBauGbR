package com.mycompany.dao;

import com.mycompany.model.classes.Benutzer;
import com.mycompany.model.classes.Verantwortlichkeiten;




public class BenutzerDao extends GenericDao<Benutzer>
{
  //-------------------------------------------------------------------------
  //  Constructor(s)
  //-------------------------------------------------------------------------     
    public BenutzerDao() { super(Benutzer.class); }
 

  //-------------------------------------------------------------------------
  //  Check login information
  //-------------------------------------------------------------------------
    public boolean checkLogin(String email, String passwort) throws Exception 
    {
        return (boolean) executeQuery(session -> 
        {
            return session.createNamedQuery("findByEmailAndPassword", Benutzer.class)
                          .setParameter("email", email)
                          .setParameter("passwort", passwort)
                          .uniqueResultOptional()
                          .isPresent();
        });
    }

    
    
//    public boolean checkLogin(String username, String password) throws Exception 
//    {
//        return (boolean) executeQuery(session -> 
//        {
//            String hql = "SELECT COUNT(u) FROM Benutzer u WHERE u.email = :email AND u.passwort = :passwort";
//            Long count = session.createQuery(hql, Long.class)
//                                .setParameter("email", username)
//                                .setParameter("passwort", password)
//                                .uniqueResult();
//            return count != null && count > 0;
//        });
//    }


  //-------------------------------------------------------------------------
  //  Remove item and keep associations 
  //-------------------------------------------------------------------------     
    public void deleteItemOnly(Benutzer b) throws Exception 
    {
        executeTransaction(session -> 
        {
            Benutzer benutzer = session.get(Benutzer.class, b.getId());
            if (benutzer != null) 
            {
                if (benutzer.hasVerantwortlichkeiten()) 
                {
                    Verantwortlichkeiten v = benutzer.getVerantwortlichkeiten();
                    v.setBenutzer(null);
                    benutzer.setVerantwortlichkeiten(null);
                    session.update(v);
                }
                session.remove(benutzer);  // Änderung von delete() zu remove()
            }
            return null;
        });
    }


//    public void deleteItemOnly(Benutzer b) throws Exception
//    {
//         executeTransaction( (session) -> 
//         { 
//             Benutzer benutzer = session.get(Benutzer.class, b.getId());
//
//             if (benutzer != null) 
//             {
//                 // Set the associated room to null
//                 if (benutzer.hasRaum()) 
//                 {
//                     Raum r = benutzer.getRaum();
//                     r.setBetreuung(null);
//                     benutzer.setRaum(null); 
//                     session.update(r);
//                 } 
//                 // Now delete
//                 session.delete(benutzer);
//             }  
//             return null; 
//         } ); 
//    }     

    
    
}
