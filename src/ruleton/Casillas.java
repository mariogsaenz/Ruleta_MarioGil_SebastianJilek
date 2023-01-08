package ruleton;


public class Casillas {
    int apuesta;
    
    public void limpiar(){
        apuesta = 0;
    }
    public void sumarFicha(){
        apuesta++;
    }
    public String toString(){
        return ("Apuesta:  " + apuesta);
    }
    public int getApuesta(){
        return this.apuesta;
    }
}
