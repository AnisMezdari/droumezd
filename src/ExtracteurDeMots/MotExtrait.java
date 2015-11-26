/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExtracteurDeMots;

/**
 *
 * @author Antoine Drouhin, Anis Mezdari
 */
public class MotExtrait {

    private final String mot;
    private final int line;

    public MotExtrait(String mot, int line) {
        this.mot = mot;
        this.line = line;
    }

    public String getMot() {
        return mot;
    }

    public int getLine() {
        return line;
    }
}
