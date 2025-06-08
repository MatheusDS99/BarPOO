package BarPOO;

import java.util.Scanner;

public class Bill {
    final private static double beer = 5;
    final private static double softDrink = 3;
    final private static double barbecue = 7;
    private char gender;
    private int qtdBeer;
    private int qtdSoftDrink;
    private int qtdBarbecue;

    void setGender(char gender){
        this.gender=gender;
    }

    void setQtdBeer(int qtdBeer){
        this.qtdBeer=qtdBeer;
    }

    void setQtdSoftDrink(int qtdSoftDrink){
        this.qtdSoftDrink=qtdSoftDrink;
    }

    void setQtdBarbecue(int qtdBarbecue){
        this.qtdBarbecue=qtdBarbecue;
    }

    char getGender(){
        return gender;
    }

    int getQtdBeer(){
        return qtdBeer;
    }

    int getQtdSoftDrink(){
        return qtdSoftDrink;
    }

    int getQtdBarbecue(){
        return qtdBarbecue;
    }

    void corrigir(Scanner input){
        while(getGender()!='m' && getGender()!='f'){
                System.out.print("Sexo inválido. Digite novamente: ");
                gender = Character.toLowerCase(input.next().charAt(0));
        }
        while(getQtdBeer()<0){
            System.out.print("Quantidade inválida de cervejas. Tente novamente: ");
            qtdBeer=input.nextInt();
        }
        while(getQtdSoftDrink()<0){
            System.out.print("Quantidade inválida de refrigerantes. Tente novamente: ");
            qtdSoftDrink=input.nextInt();
        }
        while(getQtdBarbecue()<0){
            System.out.print("Quantidade inválida de espetos. Tente novamente: ");
            qtdBarbecue=input.nextInt();
        }
    }

    double feeding(){
        return qtdBeer*beer+qtdSoftDrink*softDrink+qtdBarbecue*barbecue;
    }

    double cover(){
        if (feeding()<30)
            return 4;
        else
            return 0;
    }

    double ticket(){
        if (getGender()=='m')
            return 10;
        else
            return 8;
    }

    double total(){
        return feeding()+cover()+ticket();
    }

    void imprimir(){
        System.out.println("RELATÓRIO: \n");
        System.out.printf("Consumo = R$ %.2f%n", feeding());
        System.out.println((cover()==0) ? "Isento de couvert.":String.format("Couvert = R$ %.2f", cover()));
        System.out.printf("Ingresso = R$ %.2f%n", ticket());
        System.out.println();
        System.out.printf("Total = R$ %.2f%n", total());

    }


}
