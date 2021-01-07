/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fvgprinc.app.pbaconcepto.actions;

import static com.opensymphony.xwork2.Action.NONE;
import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import java.util.List;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

/**
 *
 * @author garfi
 */
@Namespace(value = "/")

public class ComboBoxAction extends ActionSupport {

    private List<String> fruits;

    private String yourFruits;
    private String yourMonth;

    public String getYourMonth() {
        return yourMonth;
    }

    public void setYourMonth(String yourMonth) {
        this.yourMonth = yourMonth;
    }

    public List<String> getFruits() {
        return fruits;
    }

    public void setFruits(List<String> fruits) {
        this.fruits = fruits;
    }

    public String getYourFruits() {
        return yourFruits;
    }

    public void setYourFruits(String yourFruits) {
        this.yourFruits = yourFruits;
    }


    public ComboBoxAction() {

        fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Watermelon");
    }

    @Override
    @Action(value = "result", results = {
    @Result(name = SUCCESS,  location = "/result.jsp")})
    public String execute() {
        return SUCCESS;
    }
    
    @Action(value = "comboBox", results = {
    @Result(name = NONE,  location = "/combobox.jsp")})
    public String display() {
        return NONE;
    }
}
