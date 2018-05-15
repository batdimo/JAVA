/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author s504
 */
public class Fc {
    private String source;
    private String target;

    public Fc(String source, String target) {
        this.setSource(source);
        this.setTarget(target);
    }
    

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }
    
    public void copy() throws FileNotFoundException, IOException{
    FileInputStream fin= new FileInputStream(source);
    FileOutputStream fout= new FileOutputStream(target);
    int c = 0;
    while((c=fin.read())!=-1){
        fout.write(c);
    }
}
}
