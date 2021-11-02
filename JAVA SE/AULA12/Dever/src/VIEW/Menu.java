package VIEW;

import CONTROLL.UserController;
import MODEL.Users;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static boolean login1 = false;

    public static void mainMenu(ArrayList<UserController> users) throws IOException {

        Scanner get = new Scanner(System.in);

        while (0 == 0) {

            System.out.println("\n=======================");
            System.out.println("======Facebook 80s=====");
            System.out.println("=======================");
            System.out.println("(1)Login");
            System.out.println("(2)Cadastrar");
            if (login1 == true){
                System.out.println("(3)Excluir");
                System.out.println("(0)Logoff");
            }
            int selected = get.nextInt();

            switch (selected) {
                case 1:
                    UserController login = new UserController();
                    login.LoginU();
                    break;
                case 2:
                    UserController reg = new UserController();
                    reg.registerU();
                    break;
            }

            if (login1 == true) {
                switch (selected) {
                    case 3:
                        UserController delete = new UserController();
                        delete.deleteU();
                        break;

                    case 0:
                        login1 = false;
                        break;
                }
            }
        }
    }
}
