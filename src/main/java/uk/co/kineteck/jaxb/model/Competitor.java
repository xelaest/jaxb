package uk.co.kineteck.jaxb.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.Date;

@XmlRootElement(name = "competitor")
@XmlType(propOrder = {"id", "name", "dob"})
public class Competitor {
    private Long id;
    private String name;
    private Date dob;

    public Long getId() {
        return id;
    }

    @XmlAttribute
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    @XmlElement(name = "name")
    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }

    @XmlAttribute
    public void setDob(Date dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Competitor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dob=" + dob +
                '}';
    }
}
