package org.example;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        String user1 = "admin";
        String password1 = "12345";
        int i = 0;
        while (i < 3) {
            Scanner user = new Scanner(System.in);
            Scanner password = new Scanner(System.in);
            String userInput = user.nextLine();
            String passInput = password.nextLine();
            if (!user1.equals(userInput) || !password1.equals(passInput)) {
                System.out.println("El usuario o la contraseña son incorrectos");
                i++;
            } else {
                System.out.println("El usuario o la contraseña son correctos");
                break;
            }
            if (i == 3) {
                System.out.println("Intentos excedidos");
            }
        }
    }
}
