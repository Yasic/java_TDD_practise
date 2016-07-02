package com.tw.tdd1.Javabean;

import com.tw.tdd1.Exception.InchLessThanZeroException;
import com.tw.tdd1.Utils.UnitTransformUtil;

/**
 * Created by yasic on 16-7-2.
 */
public class Inch extends BaseUnit{
    private int data;
    private int hashcode = -1;

    public Inch(int data) {
        if (data < 0) {
            throw new InchLessThanZeroException();
        }
        this.data = data;
    }

    public int getData() {
        return data;
    }


    @Override
    public boolean equals(Object obj) {
        return (obj instanceof BaseUnit) && this.hashCode() == obj.hashCode();
        /*if (obj == null) {
            return false;
        }


        if (obj.getClass() == Feet.class){
            return ((Feet)obj).getData() * 12 == this.getData();
        }
        return this.data == ((Inch)obj).getData();*/
    }

    @Override
    public int hashCode() {
        if (hashcode == -1){
            hashcode = (int)((double)getData() * (double)UnitTransformUtil.getINCHUNIT());
        }
        return hashcode;
    }

}
