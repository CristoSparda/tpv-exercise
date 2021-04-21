package oop.inheritance.core;

import oop.inheritance.data.SupportedTerminal;
import oop.inheritance.ingenico.IngenicoDisplay;
import oop.inheritance.verifone.v240m.VerifoneV240mDisplay;

public class DisplayFactory {

    public static DisplayInterface getDisplay(SupportedTerminal supportedTerminal){
        DisplayInterface display = null;

        if (supportedTerminal == SupportedTerminal.INGENICO) {
            display = new IngenicoDisplay();
        } else {
            display = new VerifoneV240mDisplay();
        }
        return display;
    }
}
