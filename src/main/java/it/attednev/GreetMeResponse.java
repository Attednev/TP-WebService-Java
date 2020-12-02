package it.attednev;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "greeting"
})
@XmlRootElement(name = "GreetMeResponse")
public class GreetMeResponse {

    @XmlElement(required = true)
    protected String greeting;

    public String getGreeting() {
        return this.greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
}
