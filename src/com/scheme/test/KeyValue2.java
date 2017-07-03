package com.scheme.test;

/**
 * Created by andingLJ on 2017/6/29.
 */
public class KeyValue2 {

    private String key;
    private String value;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public int hashCode(){
        String str = key+"-"+value;
        return str.hashCode();
    }

    @Override
    public boolean equals(Object anObject) {
        if (this == anObject) {
            return true;
        } else if (anObject instanceof KeyValue2) {
            KeyValue2 anKv = (KeyValue2) anObject;
            return (key + "-" + value).equals(anKv.getKey() + "-" + anKv.getValue());
        }
        return false;
    }

    @Override
    public String toString(){
        return key + "-" + value;
    }
}
