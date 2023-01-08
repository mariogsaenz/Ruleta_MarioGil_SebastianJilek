package ruleton;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.*;
 

public class Servidor {
    public static void main(String[] args) {
        try(ServerSocket server = new ServerSocket(5678)){
            while(true) {
                try(Socket cliente = server.accept();
                    DataOutputStream dot = new DataOutputStream(cliente.getOutputStream());
                        DataInputStream in = new DataInputStream(cliente.getInputStream())){
                    boolean empieza = false;
                    while(true){
                           
                        empieza = in.readBoolean();
                        if(empieza){
                            int resultado = (int) (Math.random() * 37);
                            dot.writeInt(resultado); 
                            empieza=false;
                        }
                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch(BindException e){
            e.printStackTrace();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }
	
}
