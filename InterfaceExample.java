import java.io.*;

interface database {
    void connect();
    void disconnect();
}

/*public class oracle implements database {
    public void connect() {
        System.out.println("Conecting to oracle database");
    }
    public void disconnect() {
        System.out.println("oracle database is disconnected");
    }
}

public class mysql implements database {
    public void connect()  {
	System.out.println("Connecting to mysql database");
    }
    public void disconnect() {
        System.out.println("mysql database is disconnected");
    }
}*/

class InterfaceExample {
    public static void main(String args[]) throws IOException{
      Class c = Class.forName(args[0]);
      oracle o = (oracle)c.newInstance();
      o.connect();
      o.disconnect();
    }
} 
