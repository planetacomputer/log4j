/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutoriallog4j;

/**
 *
 * @author Ocupacional 2016-04
 */
public class Pojo {
    int attr1;
    int attr2;

    public int getAttr1() {
        return attr1;
    }

    public void setAttr1(int attr1) {
        this.attr1 = attr1;
    }

    protected int getAttr2() {
        return attr2;
    }

    public void setAttr2(int attr2) {
        this.attr2 = attr2;
    }

    @Override
    public String toString() {
        return "Pojo{" + "attr1=" + attr1 + ", attr2=" + attr2 + '}';
    }
    
    
}
