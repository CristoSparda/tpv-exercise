package oop.inheritance.core;

import oop.inheritance.data.SupportedTerminal;
import oop.inheritance.ingenico.IngenicoDisplay;
import oop.inheritance.ingenico.IngenicoPrinter;
import oop.inheritance.verifone.v240m.VerifoneV240mDisplay;
import oop.inheritance.verifone.v240m.VerifoneV240mPrinter;

public class PrinterFactory {
    
    public static PrinterInterface getprinter(SupportedTerminal supportedTerminal){
        PrinterInterface printer =  null;

        if (supportedTerminal == SupportedTerminal.INGENICO) {
            printer = new IngenicoPrinter();
        } else {
            printer = new VerifoneV240mPrinter();
        }
        return printer;
        
    }
    
    
}
