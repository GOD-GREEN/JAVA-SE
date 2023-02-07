package CONTROLL;

import MODEL.Users;
import VIEW.Menu;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

import static VIEW.Menu.login1;
import static VIEW.Menu.mainMenu;

public class UserController extends Users implements IUpdate {
    private String patch = "/home/godgreenn_sk/Documents/Tests/Users.dat";
    public String login;
    protected int pass, confirm;

    //private String patch = "/home/godgreenn/pCloudDrive/JAVA/JAVA SE/Saida/Users.dat";


    public void registerU() throws IOException {


        FileReader Read = new FileReader(patch);
        FileWriter writer = new FileWriter(patch);
        BufferedWriter buffer = new BufferedWriter(writer);
        BufferedReader readBuffer = new BufferedReader(Read);
        writer.close();
        buffer.close();

        String row = "";
        ArrayList<Users> usersu = new ArrayList<>();

        while ((row = readBuffer.readLine()) != null) {
            String[] aux = row.split("#;#");
            usersu.add(new Users(aux[0], aux[1]));
        }


        while (0 == 0) {
            Scanner get = new Scanner(System.in);
            System.out.println("=========Sign-up==========");
            System.out.print("Usuário: ");
            String login = get.nextLine();
            System.out.println("==Utilize apenas Numeros==");
            System.out.print("Senha: ");
            pass = get.nextInt();
            System.out.print("Confirmar: ");
            confirm = get.nextInt();

            if (pass == confirm) {
                Scanner read = new Scanner(System.in);
                writer = new FileWriter(patch,true);
                buffer = new BufferedWriter(writer);
                buffer.write(login + "#;#" + pass + "\n");
                buffer.close();
                writer.close();
                System.out.println();
                System.out.println("\n\n\n\n\n\nUsuario Registrado com Sucesso!!!");
                break;

            } else {
                System.out.println("\n\n\n\n\n\nAs senhas não coincidem!");

            }
        }
    }

    public void LoginU() throws IOException {

        FileReader user = new FileReader(patch);
        BufferedReader getUsers = new BufferedReader(user);
        String row = "";
        ArrayList<Users> users0 = new ArrayList<>();

        while ((row = getUsers.readLine()) != null) {
            String[] aux = row.split("#;#");
            users0.add(new Users(aux[0], aux[1]));
        }

        while (0 == 0) {
            Scanner get = new Scanner(System.in);
            System.out.println("=========LOGIN==========");
            System.out.print("Usuário: ");
            login = get.nextLine();
            System.out.print("Senha: ");
            String pass = get.nextLine();

            boolean sucesso = false;

            for (Users u : users0) {
                if (u.getLogin().equalsIgnoreCase(login) && u.getPass().equals(pass)) {
                    sucesso = true;
                }
            }

            if (sucesso) {
                System.out.println("\n\n\n\n\n\nLOGIN SUCCESSFULL");
                login1 = true;
                print();
                break;
            } else {
                System.out.println("\n\n\n\n\n\nUsuário ou senha inválidos!");
            }
        }
    }

    public void deleteU() throws IOException{
        if (login == "Root"){
            System.out.println("Funcionou");
        }
    }

    public void print(){
        System.out.println("Usuario: " + login + " Logado");
    }
}
