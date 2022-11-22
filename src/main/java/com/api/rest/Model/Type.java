package com.api.rest.Model;

import javax.persistence.*;

@Entity
public class Type {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long id;

    @Column
    private String typename;
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

    public Type(String typename, String strongAgainst, String weakAgainst, String resistantTo, String weakTo) {
        this.typename = typename;
        this.strongAgainst = strongAgainst;
        this.weakAgainst = weakAgainst;
        this.resistantTo = resistantTo;
        this.weakTo = weakTo;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
