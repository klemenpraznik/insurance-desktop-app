/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.naloga3;

import java.util.Date;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Klemen
 */
@XmlRootElement(name="vehicle")
class Vehicle {
    @XmlElement
    public String brand;
    
    @XmlElement
    public String model;
    
    @XmlElement
    public String transmission;
    
    @XmlElement
    public String volume;
    
    @XmlElement
    public String power;
    
    @XmlElement
    public String fuel;
    
    @XmlElement
    public String type;
    
    @XmlElement
    public String doors;
    
    @XmlElement
    public String seats;
    
    @XmlElement
    public Date firstRegistration;
    
    @XmlElement
    public String registraionNumber;

    public Vehicle() {
    }
}
