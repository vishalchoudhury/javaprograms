import java.io.*;

interface Connection {
    void connect(String dbname);
    void disconnect(String dbname);
}

class SqlServer implements Connection {
    void connect(){
