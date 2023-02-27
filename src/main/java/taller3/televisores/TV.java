package taller3.televisores;

public class TV {
    private Marca marca;
    private int canal;
    private int precio;
    private boolean estado;
    private int volumen;
    Control control;
    private static int numTV = 0;
    
    public TV(Marca marca, boolean estado){
        this.marca = marca;
        this.estado = estado;
        canal = 1;
        precio = 500;
        volumen = 1;
        numTV=numTV+1;
    }
    
    public Marca getMarca(){
        return marca;
    }
    public void setMarca(Marca marca){
        this.marca = marca;
    }
    
    public Control getControl(){
        return control;
    }
    
    public void setControl(Control control){
        this.control = control;
    }
    
    public int getPrecio(){
        return precio;
    }
      
    public void setPrecio(int precio){
        this.precio = precio;
    }
    public int getVolumen(){
        return volumen;
    }
    public void setVolumen(int volumen){
        if(estado && volumen > -1 && volumen < 8){
                    this.volumen = volumen;
        }
    }    
    public int getCanal(){
        return canal;
    }
    
    public void setCanal(int canal){
        if (estado && canal > 0 && canal < 121){
            this.canal = canal;
        }
    }
    
    
    public boolean getEstado(){
        return estado;
    }
    public void turnOn(){
        estado = true;
    }
    
    public void turnOff(){
        estado = false;
    }
    
    public static int getNumTV(){
        return numTV;
    }
    
    public static void setNumTV(int numer){
        numTV = numer;
    }
    

    public void canalUp(){
        if (estado && canal > 0 && canal < 120){
            canal++;
        }
        
    }
    
    public void canalDown(){
        if (estado && canal > 1 && canal < 121){
            canal--;
        }
    }
    
    public void volumenUp(){
        if (estado && volumen > -1 && volumen < 7){
            volumen++;
        }
    }
    
    public void volumenDown(){
        if (estado && volumen > 0 && volumen < 8){
            volumen--;
        }
    }
    
}
