package com.mycompany.services;

import com.mycompany.dao.BenutzerDao;
import com.mycompany.model.classes.Benutzer;
import jakarta.transaction.Transactional;


public class BenutzerService extends ServiceTemplate<Benutzer, BenutzerDao>
{
  //-------------------------------------------------------------------------
  //  Constructor(s)
  //-------------------------------------------------------------------------     
    public BenutzerService()
    {
        super(new BenutzerDao());
    }
    
    
  //-------------------------------------------------------------------------
  //  Check login information
  //-------------------------------------------------------------------------  
    @Transactional
    public boolean checkLogin(String username, String password) throws Exception
    {
        return getDao().checkLogin(username, password);
    }



}
