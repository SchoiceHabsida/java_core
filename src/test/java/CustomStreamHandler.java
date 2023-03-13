import java.io.OutputStream;
import java.util.logging.StreamHandler;

public class CustomStreamHandler extends StreamHandler {
    @Override
    protected synchronized void setOutputStream(OutputStream out) throws SecurityException {
        super.setOutputStream(out);
    }
}
