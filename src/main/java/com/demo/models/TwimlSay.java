package com.demo.models;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;

/**
 * @author Miguel Reyes
 *         Date: 10/11/15
 *         Time: 12:51 PM
 */
public class TwimlSay {

    @XmlAttribute(name = "voice")
    private String voice;

    @XmlValue
    private String text;

    public void setText(String text) {
        this.text = text;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }
}
