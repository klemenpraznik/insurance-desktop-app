/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.naloga3;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Klemen
 */
@XmlRootElement(name="insuranceDocument")
public class InsuranceDocument {
    @XmlElement
    public Insuree insuree;
    
    @XmlElement
    public Vehicle vehicle;
    
    @XmlElement
    public Insurance insurance;

    public InsuranceDocument(Insuree insuree, Vehicle vehicle, Insurance insurance) {
        this.insuree = insuree;
        this.vehicle = vehicle;
        this.insurance = insurance;
    }

    public InsuranceDocument() {
    }
}
