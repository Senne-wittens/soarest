package com.api.rest.Model;

import javax.persistence.*;

@Entity
public class Type {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String Type;
    @Column
    private String strongAgainst;
    @Column
    private String weakAgainst;
    @Column
    private String resistantTo;
    @Column
    private String weakTo;


    public Type() {
    }

    public Type(String type) {
        Type = type;
    }



    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getStrongAgainst() {
        return strongAgainst;
    }

    public void setStrongAgainst(String strongAgainst) {
        this.strongAgainst = strongAgainst;
    }

    public String getWeakAgainst() {
        return weakAgainst;
    }

    public void setWeakAgainst(String weakAgainst) {
        this.weakAgainst = weakAgainst;
    }

    public String getResistantTo() {
        return resistantTo;
    }

    public void setResistantTo(String resistantTo) {
        this.resistantTo = resistantTo;
    }

    public String getWeakTo() {
        return weakTo;
    }

    public void setWeakTo(String weakTo) {
        this.weakTo = weakTo;
    }
}
