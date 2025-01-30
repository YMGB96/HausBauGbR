/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.services;

import com.mycompany.model.classes.Mietobjekt;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author masou
 */
public class MOReportBericht {
    File reportFile = new File("C:\\reports\\ObjektBericht.jasper");
    File targetFile = new File("C:\\reports\\ObjektBericht.pdf");
    List<Mietobjekt> List = new ArrayList<Mietobjekt>();
    
    //Map<String, Object> parameters = new HashMap<String, Object>();
    //parameters.put("EinnahmeVon",);
    //parameters.put("EinnahmeBis");
    
    //try {
        
      //  JasperPrint jp = JasperFillManager.fillReport(reportFile.getAbsolutePath(), parameters, new MOReportServiceFehlBetrag(moList));
        //JasperExportManager.exportReportToPdfFile(jp, targetFile.getAbsolutePath());
        //}
    //catch(Exception e) { System.out.println("ERROR: "+e.getMessage());}
    //System.out.println("Done!");
}