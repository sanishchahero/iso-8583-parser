/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ke.co.shemistone.parser.field;

/**
 *
 * @author shemistone
 */
public class PackException extends RuntimeException {
    
    public PackException(String message) {
        super(message);
    }

    public PackException(String message, Throwable cause) {
        super(message, cause);
    }

}
