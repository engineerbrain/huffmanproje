/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package huffmanımpl;


public class Leaf extends Node {

    private final char character;

    public Leaf(char character, int frequency) {
        super(frequency);
        this.character = character;
    }

}
