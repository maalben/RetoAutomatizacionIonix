/**
 * Mario Alejandro Benitez Orozco
 *
 * <p>Copyright (c) 2024 . All Rights Reserved.
 *
 */
package ionix.exceptions;

import java.io.IOException;

public class ErrorElementNotFoundException extends RuntimeException{
    public ErrorElementNotFoundException(String message) {
        super(message);
    }

    public ErrorElementNotFoundException(IOException message) {
        super(message);
    }


}
