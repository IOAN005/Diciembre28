package com.corenetworks.presentacion;

import com.corenetworks.modelo.Camisa;
import com.corenetworks.modelo.Pantalon;
import com.corenetworks.modelo.Zapatos;

import java.io.*;

public class ProbarRopa {
    public static void main(String[] args) {
        //1.Declaracion de variable
        FileOutputStream fSalida;
        ObjectOutputStream objecto;
        Pantalon p1;
        Pantalon p2;
        Camisa c1;
        Zapatos z1;
        Zapatos z2;
        //2.Activamos entrada salida
        try {
            fSalida=new FileOutputStream("ropa.dat");
            objecto=new ObjectOutputStream(fSalida);
            p1=new Pantalon("chino");
            objecto.writeObject(p1);
            p2=new Pantalon("corto");
            objecto.writeObject(p2);
            c1=new Camisa(true,25);
            objecto.writeObject(c1);
            z1=new Zapatos(10);
            objecto.writeObject(z1);
            z2=new Zapatos(5);
            objecto.writeObject(z2);
            //3.Cerrar
            objecto.flush();
            objecto.close();
            fSalida.close();

        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
        } catch (IOException e) {
            System.out.println(e.toString());
        }


    }
}
