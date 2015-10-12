package com.demo.models;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Miguel Reyes
 *         Date: 10/9/15
 *         Time: 3:44 PM
 */

@XmlRootElement(name = "Response")
public class TwimlResponse {

    @XmlElement(name = "Say")
    private TwimlSay say;

    public void setSay(TwimlSay say) {
        this.say = say;
    }

}