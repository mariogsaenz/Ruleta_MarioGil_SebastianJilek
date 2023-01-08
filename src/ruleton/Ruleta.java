
package ruleton;
import java.util.*;
import javax.swing.JOptionPane;

public class Ruleta {
    
    int fichas = 10;
    
    public int getFichas(){
        return this.fichas;
    }
    
    List<Casillas> tablero = new ArrayList<>();
    //Conjuntos de numeros
    Casillas pares = new Casillas();
    Casillas impares = new Casillas();
    Casillas rojo = new Casillas();
    Casillas negro = new Casillas();
    Casillas columnaUno = new Casillas();
    Casillas columnaDos = new Casillas();
    Casillas columnaTres = new Casillas();
    Casillas primeros18 = new Casillas();
    Casillas segundos18 = new Casillas();
    Casillas primeraDocena = new Casillas();
    Casillas segundaDocena = new Casillas();
    Casillas terceraDocena= new Casillas();
    
    //Todos los numeros
    Casillas cero = new Casillas();
    Casillas uno = new Casillas();
    Casillas dos = new Casillas();
    Casillas tres = new Casillas();
    Casillas cuatro = new Casillas();
    Casillas cinco = new Casillas();
    Casillas seis = new Casillas();
    Casillas siete = new Casillas();
    Casillas ocho = new Casillas();
    Casillas nueve = new Casillas();
    Casillas diez = new Casillas();
    Casillas once = new Casillas();
    Casillas doce = new Casillas();
    Casillas trece = new Casillas();
    Casillas catorce = new Casillas();
    Casillas quince = new Casillas();
    Casillas dieciseis = new Casillas();
    Casillas diecisiete = new Casillas();
    Casillas dieciocho = new Casillas();
    Casillas diecinueve = new Casillas();
    Casillas veinte = new Casillas();
    Casillas veintiuno = new Casillas();
    Casillas veintidos = new Casillas();
    Casillas veintitres = new Casillas();
    Casillas veinticuatro = new Casillas();
    Casillas veinticinco = new Casillas();
    Casillas veintiseis = new Casillas();
    Casillas veintisiete = new Casillas();
    Casillas veintiocho = new Casillas();
    Casillas veintinueve = new Casillas();
    Casillas treinta = new Casillas();
    Casillas treintauno = new Casillas();
    Casillas treintados = new Casillas();
    Casillas treintatres = new Casillas();
    Casillas treintacuatro = new Casillas();
    Casillas treintacinco = new Casillas();
    Casillas treintaseis = new Casillas();

    
    public Ruleta(){
        //Añadimos nuetros numeros y conjuntos de numeros a la Ruleta
        tablero.add(pares);
        tablero.add(impares);
        tablero.add(rojo);
        tablero.add(negro);
        tablero.add(primeraDocena);
        tablero.add(segundaDocena);
        tablero.add(terceraDocena);
        tablero.add(columnaUno);
        tablero.add(columnaDos);
        tablero.add(columnaTres);
        tablero.add(primeros18);
        tablero.add(segundos18);
        tablero.add(cero);
        tablero.add(uno);
        tablero.add(dos);
        tablero.add(tres);
        tablero.add(cuatro);
        tablero.add(cinco);
        tablero.add(seis);
        tablero.add(siete);
        tablero.add(ocho);
        tablero.add(nueve);
        tablero.add(diez);
        tablero.add(once);
        tablero.add(doce);
        tablero.add(trece);
        tablero.add(catorce);
        tablero.add(quince);
        tablero.add(dieciseis);
        tablero.add(diecisiete);
        tablero.add(dieciocho);
        tablero.add(diecinueve);
        tablero.add(veinte);
        tablero.add(veintiuno);
        tablero.add(veintidos);
        tablero.add(veintitres);
        tablero.add(veinticuatro);
        tablero.add(veinticinco);
        tablero.add(veintiseis);
        tablero.add(veintisiete);
        tablero.add(veintiocho);
        tablero.add(veintinueve);
        tablero.add(treinta);
        tablero.add(treintauno);
        tablero.add(treintados);
        tablero.add(treintatres);
        tablero.add(treintacuatro);
        tablero.add(treintacinco);
        tablero.add(treintaseis);
    }
    
    public void lanzar(int resultado){
        //numero aleatorio
        //int resultado = (int) (Math.random() * 37);
        JOptionPane.showMessageDialog(null, "Resultado: "+ resultado);
        boolean par = (resultado % 2  == 0);
        List<Integer> listaNegro = new ArrayList<Integer>(Arrays.asList(1,3,5,7,9,11,13,15,17,19,21,23,25,27,29,31,33,35));
        //Comprobamos si el numero es 0, par o impar
        if(resultado==0){
            System.out.println("Pago: " + cero.getApuesta());
        }
        else{
            if(!par){
                System.out.println("Pago: " + (impares.getApuesta() * 2));
                fichas = fichas + impares.getApuesta() * 2;
            }
            else if(par){
                System.out.println("Pago: " + (pares.getApuesta() * 2));
                fichas = fichas + pares.getApuesta() * 2;
            }
            //Comprobamos si es negro o rojo
            if(listaNegro.contains(resultado)){
                //es rojo
                fichas = fichas + negro.getApuesta()*2;
            }
            else{
                //es negro
                fichas = fichas + rojo.getApuesta() * 2;
            }
            //Comprobamos las docenas
            if(resultado<=12){
                fichas = fichas + primeraDocena.getApuesta() * 3;
            }
            else if(resultado>12 && resultado<=24){
                fichas = fichas + segundaDocena.getApuesta() * 3;
            }
            else if(resultado>24){
                fichas = fichas + terceraDocena.getApuesta() * 3;
            }
            //Comprobamos las columnas
            if(resultado%3 == 0){
                fichas = fichas + columnaTres.getApuesta() * 3; 
            }
            else if((resultado+1) % 3 == 0){
                fichas = fichas + columnaUno.getApuesta() * 3;
            }
            else if((resultado+2) % 3 == 0){
               fichas = fichas + columnaDos.getApuesta() * 3; 
            }
            //Comprobamos primera mitad y segunda mitad
            if(resultado<=18){
                fichas = fichas + primeros18.getApuesta() * 2;
            }
            else if(resultado>18){
                fichas = fichas + segundos18.getApuesta() * 2;
            }
            //Comprobamos los numeros sueltos
            switch (resultado) {
                case 1:
                    fichas = fichas + uno.getApuesta() * 36;
                    break;
                case 2:
                    fichas = fichas + dos.getApuesta() * 36;
                    break;
                case 3:
                    fichas = fichas + tres.getApuesta() * 36;
                    break;
                case 4:
                    fichas = fichas + cuatro.getApuesta() * 36;
                    break;
                case 5:
                    fichas = fichas + cinco.getApuesta() * 36;
                    break;
                case 6:
                    fichas = fichas + seis.getApuesta() * 36;
                    break;
                case 7:
                    fichas = fichas + siete.getApuesta() * 36;
                    break;
                case 8:
                    fichas = fichas + ocho.getApuesta() * 36;
                    break;
                case 9:
                    fichas = fichas + nueve.getApuesta() * 36;
                    break;
                case 10:
                    fichas = fichas + diez.getApuesta() * 36;
                    break;
                case 11:
                    fichas = fichas + once.getApuesta() * 36;
                    break;
                case 12:
                    fichas = fichas + doce.getApuesta() * 36;
                    break;
                case 13:
                    fichas = fichas + trece.getApuesta() * 36;
                    break;
                case 14:
                    fichas = fichas + catorce.getApuesta() * 36;
                    break;
                case 15:
                    fichas = fichas + quince.getApuesta() * 36;
                    break;
                case 16:
                    fichas = fichas + dieciseis.getApuesta() * 36;
                    break;
                case 18:
                    fichas = fichas + diecisiete.getApuesta() * 36;
                    break;
                case 19:
                    fichas = fichas + dieciocho.getApuesta() * 36;
                    break;
                case 20:
                    fichas = fichas + veinte.getApuesta() * 36;
                    break;
                case 21:
                    fichas = fichas + veintiuno.getApuesta() * 36;
                    break;
                case 22:
                    fichas = fichas + veintidos.getApuesta() * 36;
                    break;
                case 23:
                    fichas = fichas + veintitres.getApuesta() * 36;
                    break;
                case 24:
                    fichas = fichas + veinticuatro.getApuesta() * 36;
                    break;
                case 25:
                    fichas = fichas + veinticinco.getApuesta() * 36;
                    break;
                case 26:
                    fichas = fichas + veintiseis.getApuesta() * 36;
                    break;
                case 27:
                    fichas = fichas + veintisiete.getApuesta() * 36;
                    break;
                case 28:
                    fichas = fichas + veintiocho.getApuesta() * 36;
                    break;
                case 29:
                    fichas = fichas + veintinueve.getApuesta() * 36;
                    break;
                case 30:
                    fichas = fichas + treinta.getApuesta() * 36;
                    break;
                case 31:
                    fichas = fichas + treintauno.getApuesta() * 36;
                    break;
                case 32:
                    fichas = fichas + treintados.getApuesta() * 36;
                    break;
                case 33:
                    fichas = fichas + treintatres.getApuesta() * 36;
                    break;
                case 34:
                    fichas = fichas + treintacuatro.getApuesta() * 36;
                    break;
                case 35:
                    fichas = fichas + treintacinco.getApuesta() * 36;
                    break;
                case 36:
                    fichas = fichas + treintaseis.getApuesta() * 36;
                    break;
                default:
                    break;
            }
            
        }
        for(Casillas casillas: tablero){
            casillas.limpiar();
        }
    }
    
    public void calcularApuesta(int x, int y){
        if(this.fichas>0){
	        if(y>=335 && y<=380){ //Fila de abajo
	            if(x>=100 && x<=178){
	                System.out.println("primeros18");
	                primeros18.sumarFicha();
	            }
	            else if(x>=179 && x<=263){
	                System.out.println("pares");
	                pares.sumarFicha();
	            }
	            else if(x>=264 && x<=350){
	                System.out.println("rojo");
	                rojo.sumarFicha();
	            }
	            else if(x>=351 && x<=435){
	                System.out.println("negro");
	                negro.sumarFicha();
	            }
	            else if(x>=436 && x<=517){
	                System.out.println("impares");
	                impares.sumarFicha();
	            }
	            else if(x>=518 && x<=600){
	               System.out.println("segundos18"); 
	               segundos18.sumarFicha();
	            } 
	        }
	        else if(y>=281 && y<=381){ //Fila docenas
	            if(x>=100 && x<=263){
	                System.out.println("primeraDocena");
	                primeraDocena.sumarFicha();
	            }
	            else if(x>=264 && x<=435){
	                System.out.println("segundaDocena");
	                segundaDocena.sumarFicha();
	            }
	            else if(x>=436 && x<=600){
	                System.out.println("terceraDocena");
	                terceraDocena.sumarFicha();
	            }
	        }
	        else if(y>=225 && y<=282){ //Fila del 1
	            if(x>=100 && x<=137){
	                System.out.println("uno");
	                uno.sumarFicha();
	            }
	            else if(x>=138 && x<=178){
	                System.out.println("cuatro");
	                cuatro.sumarFicha();
	            }
	            else if(x>=179 && x<=220){
	                System.out.println("siete");
	                siete.sumarFicha();
	            }
	            else if(x>=221 && x<=263){
	                System.out.println("diez");
	                diez.sumarFicha();
	            }
	            else if(x>=264 && x<=304){
	                System.out.println("trece");
	                trece.sumarFicha();
	            }
	            else if(x>=305 && x<=350){
	                System.out.println("dieciseis");
	                dieciseis.sumarFicha();
	            }
	            else if(x>=351 && x<=390){
	                System.out.println("diecinueve");
	                diecinueve.sumarFicha();
	            }
	            else if(x>=391 && x<=432){
	               System.out.println("veintidos"); 
	               veintidos.sumarFicha();
	            } 
	            else if(x>=433 && x<=475){
	                System.out.println("veinticinco");
	                veinticinco.sumarFicha();
	            }
	            else if(x>=476 && x<=517){
	                System.out.println("veintiocho");
	                veintiocho.sumarFicha();
	            }
	            else if(x>=518 && x<=558){
	                System.out.println("treintauno");
	                treintauno.sumarFicha();
	            }
	            else if(x>=559 && x<=600){
	                System.out.println("treintacuatro");
	                treintacuatro.sumarFicha();
	            }
	            else if(x>=601 && x<=642){
	                System.out.println("columnaUno");
	                columnaUno.sumarFicha();
	            }
	            else if(x>=57 && x<=99){ //cero
	                System.out.println("cero");
	                cero.sumarFicha();
	            }
	        }
	        else if(y>=160 && y<=226){ //Fila del 2
	            if(x>=100 && x<=137){
	                System.out.println("dos");
	                dos.sumarFicha();
	            }
	            else if(x>=138 && x<=178){
	                System.out.println("cinco");
	                cinco.sumarFicha();
	            }
	            else if(x>=179 && x<=220){
	                System.out.println("ocho");
	                ocho.sumarFicha();
	            }
	            else if(x>=221 && x<=263){
	                System.out.println("once");
	                once.sumarFicha();
	            }
	            else if(x>=264 && x<=304){
	                System.out.println("catorce");
	                catorce.sumarFicha();
	            }
	            else if(x>=305 && x<=350){
	                System.out.println("diecisiete");
	                diecisiete.sumarFicha();
	            }
	            else if(x>=351 && x<=390){
	                System.out.println("veinte");
	                veinte.sumarFicha();
	            }
	            else if(x>=391 && x<=432){
	               System.out.println("veintitres"); 
	               veintitres.sumarFicha();
	            } 
	            else if(x>=433 && x<=475){
	                System.out.println("veintiseis");
	                veintiseis.sumarFicha();
	            }
	            else if(x>=476 && x<=517){
	                System.out.println("veintinueve");
	                veintinueve.sumarFicha();
	            }
	            else if(x>=518 && x<=558){
	                System.out.println("treintados");
	                treintados.sumarFicha();
	            }
	            else if(x>=559 && x<=600){
	                System.out.println("treintacinco");
	                treintacinco.sumarFicha();
	            }
	            else if(x>=601 && x<=642){
	                System.out.println("columnaDos");
	                columnaDos.sumarFicha();
	            }
	            else if(x>=57 && x<=99){ //cero
	                System.out.println("cero");
	                cero.sumarFicha();
	            }
	        }
	        else if(y>=100 && y<=161){ //Fila del 3
	            if(x>=100 && x<=137){
	                System.out.println("tres");
	                tres.sumarFicha();
	            }
	            else if(x>=138 && x<=178){
	                System.out.println("seis");
	                seis.sumarFicha();
	            }
	            else if(x>=179 && x<=220){
	                System.out.println("nueve");
	                nueve.sumarFicha();
	            }
	            else if(x>=221 && x<=263){
	                System.out.println("doce");
	                doce.sumarFicha();
	            }
	            else if(x>=264 && x<=304){
	                System.out.println("quince");
	                quince.sumarFicha();
	            }
	            else if(x>=305 && x<=350){
	                System.out.println("dieciocho");
	                dieciocho.sumarFicha();
	            }
	            else if(x>=351 && x<=390){
	                System.out.println("veintiuno");
	                veintiuno.sumarFicha();
	            }
	            else if(x>=391 && x<=432){
	               System.out.println("veinticuatro"); 
	               veinticuatro.sumarFicha();
	            } 
	            else if(x>=433 && x<=475){
	                System.out.println("veintisiete");
	                veintisiete.sumarFicha();
	            }
	            else if(x>=476 && x<=517){
	                System.out.println("treinta");
	                treinta.sumarFicha();
	            }
	            else if(x>=518 && x<=558){
	                System.out.println("treintatres");
	                treintatres.sumarFicha();
	            }
	            else if(x>=559 && x<=600){
	                System.out.println("treintaseis");
	                treintaseis.sumarFicha();
	            }
	            else if(x>=601 && x<=642){
	                System.out.println("columnaTres");
	                columnaTres.sumarFicha();
	            }
	            else if(x>=57 && x<=99){ //cero
	                System.out.println("cero");
	                cero.sumarFicha();
	            }
	        }
	        this.fichas--;
        }
        else{
            System.out.println("No quedan fichas. Gracias por apostar con nosotros. Te esperamos.");
        }
    }
   
}
