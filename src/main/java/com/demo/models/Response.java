package com.demo.models;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Miguel Reyes
 *         Date: 10/9/15
 *         Time: 3:44 PM
 */

@XmlRootElement(name = "Response")
public class Response {

    @XmlElement(name = "Say")
    private Say say;

    public void setSay(Say say) {
        this.say = say;
    }

}