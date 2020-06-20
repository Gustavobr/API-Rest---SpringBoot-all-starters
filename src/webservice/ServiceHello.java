/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webservice;

/**
 *
 * @author gustavoscipiao
 */

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(serviceName = "Somador")
public class ServiceHello {

    /**
     * Sample method
     * @param a
     * @param b
     * @return 
     */
    
    @WebMethod(operationName = "somar")
    
    public double somar(double a, double b) {
        return a+b;
    }    
    
}
