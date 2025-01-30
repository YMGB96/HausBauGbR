/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.services;

import com.mycompany.model.classes.Mietobjekt;
import java.util.List;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRField;

/**
 *
 * @author masou
 */

public class MOReportServiceFehlBetrag implements JRDataSource {
     private int index = -1;
     List<Mietobjekt> moList = null;
     public MOReportServiceFehlBetrag(List<Mietobjekt> list){
        super();
        this.moList = list;
     }
     
     public boolean next() throws JRException {
        index++;
        return (moList!=null && index < moList.size()) ? true : false;
     }
     
     public Object getFieldValue(JRField jrField) throws JRException {
        Mietobjekt mo = moList.get(index);
        if (mo!=null) {
            //Offene Betrag ?????  !!!!!!!
            //if (jrField.getName().equals("OffeneBetrag")) { return mo.getBegin(); }
            //else if (jrField.getName().equals("FinanzStatus")) { return mo.getFinanzstatus();}
            //else { return null; }
        }
        return null;
     }
 }