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
@XmlRootElement(name="insuree")
public class Insuree {
    @XmlElement
    public String name;
    
    @XmlElement
    public String surname;
    
    @XmlElement
    public Date birthday;
    
    @XmlElement
    public String address;
    
    @XmlElement
    public String postNumber;
    
    @XmlElement
    public String city;
    
    @XmlElement
    public boolean youngDriver;

    public Insuree() {
    }
}
