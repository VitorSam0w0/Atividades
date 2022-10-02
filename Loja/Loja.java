package Loja;

import java.util.Scanner;

public class Loja {

    public static void main ( String [] args ) {

        int menuprincipal;
        int menuadm;
        double precocamiseta;
        double precocalca;
        String usuario, senha;
        String Adm, adm;
        String marcacamiseta, marcacalca;
        String novomodelocalca, novomodelocamiseta;



        novomodelocalca = "Nike";
        novomodelocamiseta = "Nike";

        precocalca = 1.333;
        
        precocamiseta = 1.333;

        usuario = "Adm";
        senha = "adm";


        Adm = "Adm";
        adm = "adm";

        Camiseta camisetamarca = new Camiseta();
        Calca calcamarca = new Calca();

        Camiseta camisetapreco = new Camiseta();
        Calca calcapreco = new Calca();



        calcamarca.marca = novomodelocalca;

        camisetamarca.marca = novomodelocamiseta;

    
        calcapreco.preco = precocalca;
        camisetapreco.preco = precocamiseta;



        Scanner scanner = new Scanner ( System.in );

        System.out.println("Calça(1)  Camiseta(2)  Menu(0)");

        menuprincipal = scanner.nextInt();

        if (menuprincipal==0) {

         System.out.println("Digite o Usuario: ");

         usuario = scanner.nextLine();

            if (usuario=="Adm") {

                 System.out.println("Digite a Senha: ");

                 senha = scanner.nextLine();
    
                    if (senha=="adm") {

                        System.out.println("Menu: ");
    
                        System.out.println("Mudar Modelo de Calça(1)  Mudar Modelo de Camiseta(2)");
      
                        menuadm = scanner.nextInt();
                     
     
                        if (menuadm==1) {
     
                         System.out.println("Digite o Nome do Novo modelo de Calça: ");
     
                         novomodelocalca = scanner.nextLine();
                        } else if (menuadm==2) {
     
                            System.out.println("Digite o Nome do Novo modelo de Camiseta: ");
          
                            novomodelocamiseta = scanner.nextLine();
                           
                        }
                    }
                    
                     
    
                

            

            } else {
                System.out.println("Usuario Errado");
            }
        } else if (menuprincipal==1) {

            System.out.println("Calças disponiveis: ");

            System.out.println(novomodelocalca);



        } else if (menuprincipal==2) {

            System.out.println("Camisetas disponiveis: ");

            System.out.println(novomodelocamiseta);




        } else {
            System.out.println("Erro");
        }

    }
}