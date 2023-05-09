package XML.XstreamEjemplos;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class ObjectOutputStreamSincabecera extends ObjectOutputStream {

    public ObjectOutputStreamSincabecera(OutputStream out) throws IOException {

        super(out);
    }

    @Override
    protected void writeStreamHeader() throws IOException {
        //borro la cabezera del siguiente objeto
        this.reset();
    }

}
