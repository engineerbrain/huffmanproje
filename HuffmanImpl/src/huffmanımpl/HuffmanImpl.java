/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package huffmanımpl;

/**
 *
 * @author tr
 */
public class HuffmanImpl {

    
    public static void main(String[] args) {
        Huffman huffman = new Huffman("aaaaaaaabbbbbbbccccdd");

        String encodedText = huffman.encode();
        System.out.println(encodedText);

        huffman.printCodes();

        String originalText = huffman.decode(encodedText);
        System.out.println(originalText);
    }
    
}
