package projetoescolar;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        ArrayList<String> aluno = new ArrayList();
        
        
        
        int menu = -1;

        do {

            System.out.println("asdjuas");
            menu = teclado.nextInt();
            
            switch (menu) {
                case 0:

                    break;
                case 1:
                    Alunos.menuAlunos(aluno);
                    break;
                case 2:
                    
                    break;
                case 3:
                    break;
                default:
                    break;
            }

        } while (menu!=0);
    }

}
