
package examen.Biblioteca.POJOS;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 *
 * @author mrnovoa
 * 
 */

public class ObjectOutputStreamSinCabecera extends ObjectOutputStream {
    
    public ObjectOutputStreamSinCabecera (OutputStream out) throws IOException {
        
        super (out);
    }
    
    @Override
    protected void writeStreamHeader () throws IOException {
        
        this.reset();
    }
}
