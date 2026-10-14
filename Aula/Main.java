package Aula;
import java.util.*;

public class Main {
    public static void main (String[] args) {
      
        char[] nome = {'A', 'M', 'O', 'R'};
        int[] megasena = {15,13,14,55,37,24};
        for (int x =  nome.length-1; x>=0; x-- ){
           System.out.print(nome[x]);
        }
        for (char x : nome){
           System.out.println(x);
        }
        for (int x : megasena){
           System.out.println(x);
        }
    }
}