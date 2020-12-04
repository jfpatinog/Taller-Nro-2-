package com.clientes;

import com.clases.BeneficiosCovid19;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class Main {


    public static void main(String[] args) {
	// write your code her
        ArrayList<BeneficiosCovid19> ListaBeneficio = new ArrayList<>();
        ArrayList<BeneficiosCovid19>  listaBeneficios02 = new ArrayList<>();
        Main mainObj = new Main();
        BeneficiosCovid19 client2 = new BeneficiosCovid19();
        client2.setNombre("Fernando");
        client2.setId(mainObj.getIdBeneficio());
        client2.setValorSubsidio(Float.valueOf(3000));
        listaBeneficios02.add(client2);
        //System.out.println(listaBeneficios02.toString());

        BeneficiosCovid19 client = new BeneficiosCovid19();
        client.setNombre("Juan");
        client.setId(mainObj.getIdBeneficio());
        client.setValorSubsidio(Float.valueOf(5000));

        BeneficiosCovid19 client1 = new BeneficiosCovid19();
        client1.setNombre("Luis");
        client1.setId(mainObj.getIdBeneficio());
        client1.setValorSubsidio(Float.valueOf(6000));
        ListaBeneficio.add(client);
        ListaBeneficio.add(client1);

        //System.out.println(ListaBeneficio.toString());
        listaBeneficios02.addAll(ListaBeneficio);
     //   mainObj.imprimirRegistros(ListaBeneficio);
        mainObj.imprimirRegistros(listaBeneficios02);


        /**
         * Crear 2 lista de beneficios para clientes Lista 1 y Lista 2 por ejemplo
         * Ejemplo:
         * id:12121
         * nombre: Beneficiados que perdieron su trabajo por COVID19
         * valorSubsidio: 150000
         *
         * Ejemplo:
         * id:895656
         * Nombre: Beneficios para persona tercera edad dagnificados COVID
         * valorSubsidio:200000
         */


    }

    /**
     * Implementa un metodo que entregue un reporte de comparacion de las 2 listas este metodo solo imprimira regiostros
     * Cuando un metodo no retorna un tipo de datos se trabaja con la palabra clave VOID
     * Abarcar los operadores terniarios para condiciones logicas
     * Operadores logicos
     * Operacionres aritmeticos
     **/
    public void imprimirRegistros(ArrayList<BeneficiosCovid19> imprimir){
     for(int i =0; i < imprimir.size(); i++){
         System.out.println("->" + imprimir.get(i));
     }
     /*
     for(BeneficiosCovid19 benif: imprimir){
         System.out.print("-> " + benif);
     }*/

    }
    //Implementa un metodo que te entregue un numero aletorio para el ide de los beneficios usar el wrapper de Integer
    private String getIdBeneficio(){
        //Random random = new Random();
        return Integer.toString((int) (Math.random()*1000000+10000));
        //return String.valueOf( (int) (Math.random()*1000000+10000));
    }
}
