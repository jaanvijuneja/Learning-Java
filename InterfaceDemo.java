
package mysql.project;


interface Callback{
    int i = 1;
    void callback(int p);
}

class Client implements Callback{
    public void callback(int p){
      
        System.out.println("p: "+p + "i=" + i);
    }
}
public class InterfaceDemo {

 
    public static void main(String[] args) {
        
        Callback c = new Client();
        
        c.callback(10);
    }
    
}
