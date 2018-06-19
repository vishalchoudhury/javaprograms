import java.io.*;

class work {
    public static void main(String args[]) {
      Class c = Class.forName(args[0]);
      oracle o = (oracle)c.newInstance();
      o.connect();
      o.disconnect();
    }
}
