package semaphore.sockets;

/*
 * Javier Abell�n. 1 de diciembre de 2003
 *
 * DatoSocket.java
 *
 */

import java.io.*;

/**
 * Dato para enviar por el socket. Sus atributos son simples y una Clase Atributo
 */
public class DatoSocket implements Serializable
 {
     /** Primer atributo, un int */
     private int edad;
     private int numero;
     
     /** Segundo atributo, un String */
     private String nombre;
     private boolean acertado;

    public boolean isAcertado() {
        return acertado;
    }

    public void setAcertado(boolean acertado) {
        this.acertado = acertado;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
     
     /** Tercer atributo, una clase Serializable */
     private Atributo e = new Atributo();
     
     public DatoSocket(){
         this.edad = 0;
         this.nombre = "Sin especificar";
     }

    public DatoSocket(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }
    
    public DatoSocket(int edad, String nombre, int numero) {
        this.edad = edad;
        this.nombre = nombre;
        this.numero = numero;
    }
     
     /** M�todo para devolver un String en el que se represente el valor de
      * todos los atributos. */
     @Override
     public String toString ()
     {
         String resultado;
         resultado = "Edad: " + Integer.toString(getEdad()) +
            " -- Nombre: " + getNombre() + " --  Has acertado?: " + this.acertado + " " + getE().toString();
         return resultado;
     }

    /**
     * @return the c
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @return the d
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return the e
     */
    public Atributo getE() {
        return e;
    }

    /**
     * @param edad the c to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @param nombre the d to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @param e the e to set
     */
    public void setE(Atributo e) {
        this.e = e;
    }

     /*******
      *
      * LOS SIGUIENTES M�TODOS SON INNECESARIOS SALVO QUE QUERAMOS QUE SE
      * ENVIEN Y RECIBAN LOS DATOS DE FORMA NO STANDARD.
      * Puedes descomentarlos y todo funcionar� exactamente igual
      *
      *******/
     /*
     private void writeObject(java.io.ObjectOutputStream out)
         throws IOException
     {
         out.writeInt (c);
         out.writeUTF (d);
         out.writeInt (e.a);
         out.writeUTF (e.b);
     }*/
     
     /*
     private void readObject(java.io.ObjectInputStream in)
     throws IOException, ClassNotFoundException
     {
         c = in.readInt();
         d = in.readUTF();
         if (e==null) e = new Atributo();
         e.a = in.readInt();
         e.b = in.readUTF();
     }*/
}