package ruleton;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Cliente {
    public static void main(String[] args) {
        Socket s;
    	try{
            s = new Socket("localhost", 5678);
            Presentacion p = new Presentacion(s);
            p.setVisible(true); 
        } catch (UnknownHostException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        /*finally {
        	try {
        		s.close();
        	}catch(IOException e) {
        		e.printStackTrace();
        	}
        }*/
    }
}
