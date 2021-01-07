/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fvgprinc.app.pbaconcepto.actions;

import com.fvgprinc.app.pbaconcepto.bean.Moneda;
import com.fvgprinc.app.pbaconcepto.bl.MonedaBL;
import static com.opensymphony.xwork2.Action.NONE;
import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import java.sql.SQLException;
import java.util.List;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

/**
 *
 * @author garfi
 */
@Namespace(value = "/")
public class SelectMonedaAction extends ActionSupport {

    private List<Moneda> lstMonedas;

    public List<Moneda> getLstMonedas() {
        return lstMonedas;
    }

    public void setLstMonedas(List<Moneda> lstMonedas) {
        this.lstMonedas = lstMonedas;
    }
    
    private Moneda youMoneda;

    public Moneda getYouMoneda() {
        return youMoneda;
    }

    public void setYouMoneda(Moneda youMoneda) {
        this.youMoneda = youMoneda;
    }


    public Moneda getDefaultSearchEngine() {
        Moneda defaMoneda = new Moneda();
        defaMoneda.setCodMonedaN(1);
        defaMoneda.setDesMoneda("Colones");
        return defaMoneda;
    }

    public SelectMonedaAction() throws SQLException {
       MonedaBL bL = new MonedaBL();
        
        lstMonedas = bL.getList(-1);
        
    }

    @Override
    @Action(value = "resultSelMoneda", results = {
        @Result(name = SUCCESS, location = "/resSelMoneda.jsp")})

    public String execute() {
        return SUCCESS;
    }

    @Action(value = "selMoneda", results = {
        @Result(name = NONE, location = "/selMoneda.jsp")})
    public String display() {
        return NONE;
    }
}
