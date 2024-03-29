package com.company;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable{

    private String name;
    private int hitPoint;
    private int strenth;
    private String weapon;

    public Player(String name, int hitPoint, int strenth) {
        this.name = name;
        this.hitPoint = hitPoint;
        this.strenth = strenth;
        this.weapon = "Sword";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoint() {
        return hitPoint;
    }

    public void setHitPoint(int hitPoint) {
        this.hitPoint = hitPoint;
    }

    public int getStrenth() {
        return strenth;
    }

    public void setStrenth(int strenth) {
        this.strenth = strenth;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hitPoint=" + hitPoint +
                ", strenth=" + strenth +
                ", weapon='" + weapon + '\'' +
                '}';
    }

    @Override
    public List<String> write() {

        List<String> values = new ArrayList<>();

        values.add(0,this.name);
        values.add(1,"" + this.hitPoint);
        values.add(2, ""+ this.strenth);
        values.add(3, this.weapon);


        return values;
    }

    @Override
    public void read(List<String> savedValues) {

        if (savedValues!=null && savedValues.size()>0) {
            this.name = savedValues.get(0);
            this.hitPoint=Integer.parseInt(savedValues.get(1));
            this.strenth=Integer.parseInt(savedValues.get(2));
            this.weapon=savedValues.get(3);
        }

    }
}
