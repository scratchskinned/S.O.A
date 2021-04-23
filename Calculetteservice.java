/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package istic.soa.tp1.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author wael
 */
@WebService()
public class CalculetteService {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "plus")
    public int plus(@WebParam(name = "i")
    int i, @WebParam(name = "j")
    int j) {
        //TODO write your implementation code here:
        return i+j;
    }

 
    @WebMethod(operationName = "moins")
    public int moins(@WebParam(name = "a")
    int a, @WebParam(name = "b")
    int b) {
        //TODO write your implementation code here:
        return a-b;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "multiplication")
    public int multiplication(@WebParam(name = "d")
    int d, @WebParam(name = "p")
    int p) {
        //TODO write your implementation code here:
        return d*p;
    }
/**
     * Web service operation
     */
    @WebMethod(operationName = "div")
    public float div(@WebParam(name = "t")
    int t, @WebParam(name = "m")
    int m) {
        //TODO write your implementation code here:
        return t/m;
    }
          /**
     * Web service operation
     */
    @WebMethod(operationName = "premier")
    public Boolean premier(@WebParam(name = "x")
    int x) {
        
      int rst;
       boolean f = true;
       
       for(int i=2; i <= x/2; i++){
               rst = x%i;
            if(rst == 0){
                f = false;
                break;}
           
 }
       return f;
    }

    /**
     * Web service operation
     */ 
    /**
     * Web service operation
     */
    @WebMethod(operationName = "decomposition")
    public String decomposition(@WebParam(name = "numbers")
    int numbers) {
        int n = numbers;
        List<Integer> factors = new ArrayList<Integer>();
        for (int i = 2; i <= n / i; i++) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }
        if (n > 1) {
            factors.add(n);
        }
        String listString = factors.toString();
        return listString;
    }

    
 
    
    
    
    
    
}

