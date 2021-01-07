/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fvgprinc.app.pbaconcepto.actions;

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

public class SelectAction extends ActionSupport {

    private List<String> searchEngine;

    private String yourSearchEngine;
    private String yourMonth;

    public String getYourMonth() {
        return yourMonth;
    }

    public void setYourMonth(String yourMonth) {
        this.yourMonth = yourMonth;
    }

    public List<String> getSearchEngine() {
        return searchEngine;
    }

    public void setSearchEngine(List<String> searchEngine) {
        this.searchEngine = searchEngine;
    }

    public String getYourSearchEngine() {
        return yourSearchEngine;
    }

    public void setYourSearchEngine(String yourSearchEngine) {
        this.yourSearchEngine = yourSearchEngine;
    }

    public String getDefaultSearchEngine() {
        return "yahoo.com";
    }

    public SelectAction() {

        searchEngine = new ArrayList<String>();
        searchEngine.add("google.com");
        searchEngine.add("bing.com");
        searchEngine.add("yahoo.com");
        searchEngine.add("baidu.com");
    }

    @Override
    @Action(value = "resultSelection", results = {
        @Result(name = SUCCESS, location = "/resultselect.jsp")})

    public String execute() {
        return SUCCESS;
    }

    @Action(value = "select", results = {
    @Result(name = NONE,  location = "/select.jsp")})
    public String display() {
        return NONE;
    }
}
