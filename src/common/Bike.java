/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import java.util.Objects;

/**
 *
 * @author Tim
 */
public class Bike implements Comparable{
    private String manufacturer;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.manufacturer);
        hash = 61 * hash + this.serialNum;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Bike other = (Bike) obj;
        if (this.serialNum != other.serialNum) {
            return false;
        }
        if (!Objects.equals(this.manufacturer, other.manufacturer)) {
            return false;
        }
        return true;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public Bike() {
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(int serialNum) {
        this.serialNum = serialNum;
    }
    private int serialNum;
    
    public int compare(Bike tarbike){
        
    }

    @Override
    public int compareTo(Bike o) {
        int compare;
        if(this.serialNum<o.getSerialNum()){
            compare = 1;
        }else if(this.serialNum == o.getSerialNum()){
            compare = 0;
        }else{
            compare = -1;
        }
        return compare;    }
}
