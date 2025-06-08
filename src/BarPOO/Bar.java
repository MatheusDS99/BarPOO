package BarPOO;

import java.util.Scanner;
import java.util.Locale;

public class Bar {
    public static void main (String [] args){
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        Bill metodos = new Bill();

        System.out.print("Digite o sexo do cliente: ");
        char gender = Character.toLowerCase(input.next().charAt(0));
        System.out.print("Digite a quantidade de cervejas: ");
        int beer = input.nextInt();
        System.out.print("Digite a quantidade de refrigerantes: ");
        int softDrink = input.nextInt();
        System.out.print("Digite a quantidade de espetos: ");
        int barbecue = input.nextInt();


        metodos.setGender(gender);
        metodos.setQtdBeer(beer);
        metodos.setQtdSoftDrink(softDrink);
        metodos.setQtdBarbecue(barbecue);
        metodos.corrigir(input);
        metodos.imprimir();





    }

}