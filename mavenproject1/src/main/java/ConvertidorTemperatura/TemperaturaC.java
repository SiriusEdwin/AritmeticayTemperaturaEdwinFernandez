/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConvertidorTemperatura;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

/**
 *
 * @author Geovanni
 */
@WebService
public class TemperaturaC {
    @WebMethod(operationName = "Fahrenheit2Celcius")
    public String Fahrneit2Celcius(@WebParam(name = "temperaturaFahrenheit") Double grad) {
        double cels = ((grad - 32)* 5)/9;
        return "Celsius :" + cels;
    }
    
     @WebMethod(operationName = "Celsius2Fahrenheit")
    public String Celcius2Fahrenheit (@WebParam(name = "temperaturaCelcius") Double grad) 
    {
        double fahren = (grad * 9/5) + 32;
        return "Fahrenheit :" + fahren;
    }
    
}
