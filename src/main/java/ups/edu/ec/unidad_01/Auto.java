/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ups.edu.ec.unidad_01;

/**
 *
 * @author PC-13
 */
public class Auto
{
    String placa;
    String color;
    String marca;
    int year;
    double precio;
    int tasaSolidaria;
    public int calcularTasaSolidaria()
    {
        //int tasaSolidaria;
        int preciof=(int)precio;
        
        if(preciof<=1000)
            tasaSolidaria=0;
        
        if(precio>=1001 & precio<=10000)
            tasaSolidaria=100;
        
        if(precio>=10001 & precio<=25000)
            tasaSolidaria=250;
            
        if(precio>=25001)
            tasaSolidaria=370;
            
        return tasaSolidaria;
    }
    public boolean esTaxi()
    {
        boolean retorno=false;
        if(this.color=="amarillo")
        {
            retorno=true;
        }
        return retorno;
    }
    public String obtenerProvincia()
    {
        String provincia="";
        String letraI=this.placa.substring(0,1);
        
        if(letraI.equals("A"))
            provincia="Azuay";
  
        if (letraI.equals("B"))
            provincia="Bolivar";
        
        if (letraI.equals("U"))
            provincia="Cañar";
        
        if (letraI.equals("C"))
            provincia="Carchi";
        
        if (letraI.equals("X"))
            provincia="Cotopaxi";
        
        if (letraI.equals("H"))
            provincia="Chimborazo";
        
        if (letraI.equals("O"))
            provincia="El Oro";
        
        if (letraI.equals("E"))
            provincia="Esmeraldas";
        
        if (letraI.equals("W"))
            provincia="Galapagos";
        
        if (letraI.equals("G"))
            provincia="Guayas";
        
        if (letraI.equals("I"))
            provincia="Imbabura";
        
        if (letraI.equals("L"))
            provincia="Loja";
        
        if (letraI.equals("R"))
            provincia="Los Rios";
        
        if (letraI.equals("M"))
            provincia="Manabi";
        
        if (letraI.equals("V"))
            provincia="Morona Santiago";
        
        if (letraI.equals("N"))
        
        if (letraI.equals("S"))
            provincia="Paztaza";
        
        if (letraI.equals("P"))
            provincia="Pichincha";
        
        if (letraI.equals("K"))
            provincia="Sucumbios";
        
        if (letraI.equals("Q"))
            provincia="Orellana";
        
        if (letraI.equals("T"))
            provincia="Tunguragua";
        
        if (letraI.equals("Z"))
            provincia="Zamora Chinchipe";
        
        if (letraI.equals("Y"))
            provincia="Santa Elena";
        
        return provincia;
    }
    
    public double calcularMatricula(int limiteYear, double limitePrecio)
    {
        Double PrecioDeMatricula;
        if(precio>=0 & precio<=limitePrecio)
        {
            if(year>=0 & year<=limiteYear)
            {
                PrecioDeMatricula=(10/100)*precio;
            }
            else{
                PrecioDeMatricula=(15/100)*precio;
            }
        }else{
            if(year>=0 & year<=limiteYear)
            {
                PrecioDeMatricula=(20/100)*precio;
            }else{
                PrecioDeMatricula=((25.0)*precio)/100.0;
            }
        }
        return PrecioDeMatricula;
    }
     public boolean validarPlaca()
    {
        boolean llave;
        if(placa.length()==7)
        {
            llave=true;
        }else{
            llave=false;
        }
        return llave;
    }
   
     
    public boolean esNumeros(String placaNumeros)
    {
        boolean llave=false;
        for(int i=0; i<=placaNumeros.length(); i++)
        {
            String caracter=placaNumeros.substring(i, i+1);
            boolean esNumero;
            if(caracter.matches("-?\\d+"))
            {
                llave=true;
            }
            else
            {
                llave=false;
                break;
            }
        }
        return llave;
    }
    
    public boolean esLetras(String placaLetras)
    {
        boolean llave=false;
        
        return llave;
    }
    public int calcularYears(int currentYear)
    {
        int yearD=currentYear-year;
        return yearD;
    }
    
    public boolean sePuedeAsegurar(int currentYear, int edadMax)
    {
        boolean llave;
        int yearD=currentYear-year;
        if(yearD<edadMax)
        {
            llave=true;
        }
        else{
            llave=false;
        }
        return llave;
    }
    
    
            
    
}
