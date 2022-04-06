/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ups.edu.ec.unidad_01;

/**
 *
 * @author PC-13
 */
public class Unidad_01 {

    public static void main(String[] args) {
        boolean esTaxi;
        Auto autoMauricio = new Auto();
        autoMauricio.color="amarillo";
        autoMauricio.marca="chevrolet";
        autoMauricio.year=2017;
        autoMauricio.placa="ABF8592";
        autoMauricio.precio=100;
        
        System.out.println(autoMauricio.color+"\n"+
                                         autoMauricio.marca+"\n"+
                                         autoMauricio.placa+"\n"+
                                         autoMauricio.year+"\n"+
                                         autoMauricio.precio+"\n"+
                                         autoMauricio.esTaxi()
                                         );
        
        esTaxi = autoMauricio.esTaxi();
        if(esTaxi==true)
        {
            System.out.println("El auto de la placa "+autoMauricio.placa+" si es un taxi");
        }else{
            System.out.println("El auto de la placa "+autoMauricio.placa+" no es un taxi");
        }
        
        System.out.println("El auto de placa "+autoMauricio.placa+" debe pagar de tasa solidaria de "+autoMauricio.calcularTasaSolidaria());
        
        String provincia=autoMauricio.obtenerProvincia();
        System.out.println("La provincia de la placa es : "+provincia);
        
        int limiteYear=2010;
        double limitePrecio=10000.0;
        System.out.println("El precio de la matricula es: "+autoMauricio.calcularMatricula(limiteYear, limitePrecio));
        
        if(autoMauricio.validarPlaca()==true)
        {
            System.out.println("La cantidad de digitos de la placa es la correcta");
        }else{
            System.out.println("La cantidad de digitos de la placa es incorrecta");
        }
        limiteYear=2022;
        System.out.println("La diferencia de anios es: "+autoMauricio.calcularYears(limiteYear));
        
        limiteYear=2022;
        int edadMax=2000;
        if(autoMauricio.sePuedeAsegurar(limiteYear, edadMax )==true)
        {
            System.out.println("El auto si se puede asegurar");
        }else{
            System.out.println("El auto no se puede asegurar");
        }
    }
}
