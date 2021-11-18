package co.edu.unbosque.model.persistance;

import java.io.*;
import java.util.Random;

public class BinariosFile {

    private File f;
    private FileOutputStream fos;
    private DataOutputStream dos;
    private FileInputStream fis;
    private DataInputStream dis;
    private int REGISTROS = 10;

    private double numeros[];
    private int valores[];

    private String ruta = "./data/prueba.out";

    public int getREGISTROS() {
        return REGISTROS;
    }

    public void setREGISTROS(int REGISTROS) {
        this.REGISTROS = REGISTROS;
    }

    public int[] getValores() {
        return valores;
    }

    public void setValores(int[] valores) {
        this.valores = valores;
    }

    public BinariosFile(){
        numeros = new double[10];
        valores = new int[10];
    }


    public String escribirArchivoBinario() {
        String mensaje = "Archivo Generado Exitosamente!";
        f = new File(ruta);
        Random r=new Random();
        //double d=18.76353;
        try{
            fos=new FileOutputStream(f);
            dos=new DataOutputStream(fos);
            for (int i=0;i<REGISTROS;i++){
                dos.writeInt(i);
                dos.writeDouble(r.nextDouble());//Nº aleatorio
            }
            dos.close();
        }
        catch(FileNotFoundException e){
            mensaje= "No se encontro el archivo";
        }
        catch(IOException e){
            mensaje = "Error al escribir";
        }
        return mensaje;
    }

    public void leerArchivoBinario() {
        f = new File(ruta);
        try {
            fis = new FileInputStream(f);
            dis = new DataInputStream(fis);
            for (int i=0; i<REGISTROS ; i++){
                //System.out.println(dis.readDouble());
                numeros[i] = dis.readDouble();
                valores[i] = dis.readInt();
            }
            dis.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}




