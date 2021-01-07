/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fvgprinc.app.pbaconcepto.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

/**
 *
 * @author garfi
 */
@Namespace("/calc")
@Result(name = "show", location = "/show.jsp")

public class CalcAction extends ActionSupport {
    private final String SHOWRESACTION = "show";
    
    private double resultado;

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    
    private double x;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }
    private double y;

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Action("add")
    public String add() throws Exception {
        resultado = x + y;
        msg = "You select addition!";
        return SHOWRESACTION;
    }
    
    
    @Action("sub")
    public String sub() throws Exception {
        resultado = x - y;
        msg = "You select subtraction!";
        return SHOWRESACTION;
    }

    @Action("mul")
    public String mul() throws Exception {
        resultado = x * y;
        msg = "You select multiplication!";
        return SHOWRESACTION;
    }

    @Action("div")
    public String div() throws Exception {
        resultado = x / y;
        msg = "You select division!";
        return SHOWRESACTION;
    }
}
