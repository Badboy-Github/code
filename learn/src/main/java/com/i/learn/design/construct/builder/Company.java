package com.i.learn.design.construct.builder;

/**
 * 产品
 */
public class Company {

    private CEO ceo;

    private CTO cto;

    private COO coo;

    private CFO cfo;

    public CEO getCeo() {
        return ceo;
    }

    public void setCeo(CEO ceo) {
        this.ceo = ceo;
    }

    public CTO getCto() {
        return cto;
    }

    public void setCto(CTO cto) {
        this.cto = cto;
    }

    public COO getCoo() {
        return coo;
    }

    public void setCoo(COO coo) {
        this.coo = coo;
    }

    public CFO getCfo() {
        return cfo;
    }

    public void setCfo(CFO cfo) {
        this.cfo = cfo;
    }
}
