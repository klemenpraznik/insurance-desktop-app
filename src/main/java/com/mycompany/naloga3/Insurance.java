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
@XmlRootElement(name="insurance")
class Insurance {
    //osnovno zavarovanje
    @XmlElement
    public boolean ao;
    @XmlElement
    public boolean aoPlus;
    
    //kasko
    @XmlElement
    public boolean noKasko;
    @XmlElement
    public boolean fullKasko;
    @XmlElement
    public boolean deductableKasko;

    //dodatno zavarovanje
    @XmlElement
    public boolean zavarovanjeStekel;
    @XmlElement
    public boolean zavarovanjeParkirisce;
    @XmlElement
    public boolean zavarovajeProtiKraji;
    @XmlElement
    public boolean zavarovanjeTretjeOsebe;
    @XmlElement
    public boolean zavarovanjePnevmatik;
    @XmlElement
    public boolean zavarovanjePotnikov;
    @XmlElement
    public boolean zavarovanjeProtiToci;

    public Insurance() {
    }
}
