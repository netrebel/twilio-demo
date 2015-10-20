package com.demo.models;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

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

    public static class TwimlSay {

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

}