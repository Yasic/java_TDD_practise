package com.tw.tdd1.Javabean;

import com.tw.tdd1.Utils.UnitTransformUtil;

/**
 * Created by yasic on 16-7-2.
 */
public class Feet extends BaseUnit{
    private int data;
    private int hashCode = -1;

    public Feet(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    @Override
    public boolean equals(Object obj) {
        return (obj instanceof BaseUnit) && obj.hashCode() == hashCode();
        /*if (obj == null){
            return false;
        }
        if (obj.getClass() == Inch.class){
            return getData() * 12 == ((Inch)obj).getData();
        }
        return getData() == ((Feet)obj).getData();*/
    }

    @Override
    public int hashCode() {
        if (hashCode == -1){
            hashCode = (int)((double)getData() * (double) UnitTransformUtil.getFEETUNIT());
        }
        //System.out.println("Feet" + getData() + " " + hashCode + " " + (double) UnitTransformUtil.getFEETUNIT());
        return hashCode;
    }
}
