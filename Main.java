/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplicationclient;

/**
 *
 * @author wael
 */
public class Main {
  
    public static void main(String[] args) {
       
        
try { // Call Web Service Operation
   istic.soa.tp1.service.CalculetteServiceService service = new istic.soa.tp1.service.CalculetteServiceService();
   istic.soa.tp1.service.CalculetteService port = service.getCalculetteServicePort();
   	 // TODO initialize WS operation arguments here
	int x = 0;
   // TODO process result here
   java.lang.Boolean result = port.premier(55);
   System.out.println("Result premier = "+result);
} catch (Exception ex) {
   // TODO handle custom exceptions here
}

try { // Call Web Service Operation
   istic.soa.tp1.service.CalculetteServiceService service = new istic.soa.tp1.service.CalculetteServiceService();
   istic.soa.tp1.service.CalculetteService port = service.getCalculetteServicePort();
   	 // TODO initialize WS operation arguments here
	int numbers = 0;
   // TODO process result here
   java.lang.String result = port.decomposition(55);
   System.out.println("Result decomposition = "+result);
} catch (Exception ex) {
   // TODO handle custom exceptions here
}


try { // Call Web Service Operation
   istic.soa.tp1.service.CalculetteServiceService service = new istic.soa.tp1.service.CalculetteServiceService();
   istic.soa.tp1.service.CalculetteService port = service.getCalculetteServicePort();
   	 // TODO initialize WS operation arguments here
	int i = 0;
	int j = 0;
   // TODO process result here
   int result = port.plus(11, 5);
   System.out.println("Result addition = "+result);
} catch (Exception ex) {
   // TODO handle custom exceptions here
}


try { // Call Web Service Operation
   istic.soa.tp1.service.CalculetteServiceService service = new istic.soa.tp1.service.CalculetteServiceService();
   istic.soa.tp1.service.CalculetteService port = service.getCalculetteServicePort();
   	 // TODO initialize WS operation arguments here
	int a = 0;
	int b = 0;
   // TODO process result here
   int result = port.moins(5, 11);
   System.out.println("Result soustraction = "+result);
} catch (Exception ex) {
   // TODO handle custom exceptions here
}


try { // Call Web Service Operation
   istic.soa.tp1.service.CalculetteServiceService service = new istic.soa.tp1.service.CalculetteServiceService();
   istic.soa.tp1.service.CalculetteService port = service.getCalculetteServicePort();
   	 // TODO initialize WS operation arguments here
	int d = 0;
	int p = 0;
   // TODO process result here
   int result = port.multiplication(5, 11);
   System.out.println("Result multiplication = "+result);
} catch (Exception ex) {
   // TODO handle custom exceptions here
}


try { // Call Web Service Operation
   istic.soa.tp1.service.CalculetteServiceService service = new istic.soa.tp1.service.CalculetteServiceService();
   istic.soa.tp1.service.CalculetteService port = service.getCalculetteServicePort();
   	 // TODO initialize WS operation arguments here
	int t = 0;
	int m = 0;
   // TODO process result here
   float result = port.div(8, 2);
   System.out.println("Result division = "+result);
} catch (Exception ex) {
   // TODO handle custom exceptions here
}




        
    }

}
