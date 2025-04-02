package org.example;

import java.util.Scanner;

public class StandardInputOutput {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Ingrese una frase: ");
        String sentence = myScanner.nextLine();

        String[] words = sentence.split(" ");
        int counter = 0;

        for (String word:words){
            if (word.startsWith("a") || word.startsWith("e") || word.startsWith("i") || word.startsWith("o") || word.startsWith("u")){
                counter++;
            }else{
                System.out.println(word+" No comienza con vocal");
            }
        }
        System.out.println("El numero de palabras que empiezan con vocal son: " + counter);
        myScanner.close();
    }
}
