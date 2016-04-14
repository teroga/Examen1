/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Stephannie
 */
public class MetodosAuto {
    String numeroRegistro;
    String nombreDueño;
    String cedula;
    String placa;
    
    ArrayList <Auto> arrayAuto;
    int numRegistro=0;
    
    public MetodosAuto(){
        arrayAuto=new ArrayList<Auto>();
    }
    
    public void ingresarInformacion(String numeroRegistro,String nombreDueño, String cedula, String placa){
        numRegistro++; //VARIABLE PARA QE SUME EN NUM REGISTRO
        arrayAuto.add(new Auto(numeroRegistro, nombreDueño, cedula, placa));
        JOptionPane.showMessageDialog(null, "El auto placa "+placa+"ha sido agregado con éxito."); 
        
    }
    
    public boolean buscarRegistro(String placa){
        boolean encontro=false;
        
        for(int contador=0; contador<arrayAuto.size();contador++){
            if(arrayAuto.get(contador).getPlaca().equals(placa)){
                encontro=true;
                System.out.println(placa);
                JOptionPane.showMessageDialog(null, "El registro se muestra a continuaci'on.");
            }
            else{
                JOptionPane.showMessageDialog(null, "El registro no ha sido encontrado"); 
            }
        }
        return encontro;
    }
    
    public void modificarRegistro(String placa, String nombreDueño, String cedula){
        for(int contador=0; contador<arrayAuto.size();contador++){
            if(arrayAuto.get(contador).getPlaca().equals(placa)){
                arrayAuto.get(contador).setNombreDueño(nombreDueño);
                arrayAuto.get(contador).setCedula(cedula);
                arrayAuto.get(contador).setNumRegistro(numeroRegistro); //RECORDAR CAMBIAR
                JOptionPane.showMessageDialog(null, "Se ha modificado el registro. Para confirmar vuelva a buscarlo.");
            }
        }
    }
    
    public void eliminarRegistro(String placa){
        for(int contador=0; contador<arrayAuto.size();contador++){
            if(arrayAuto.get(contador).getPlaca().equals(placa)){
                arrayAuto.remove(contador);
            }
        }
            }
    
    //METODOS SET Y GET
      public String getNumRegistro() {
        return numeroRegistro;
    }

    /**
     * @param numRegistro the numRegistro to set
     */
    public void setNumRegistro(String numRegistro) {
        this.numeroRegistro = numRegistro;
    }

    /**
     * @return the nombreDueño
     */
    public String getNombreDueño() {
        return nombreDueño;
    }

    /**
     * @param nombreDueño the nombreDueño to set
     */
    public void setNombreDueño(String nombreDueño) {
        this.nombreDueño = nombreDueño;
    }

    /**
     * @return the cedula
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     * @return the placa
     */
    public String getPlaca() {
        return placa;
    }
      
}
