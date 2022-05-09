package APP;


import CONTROLL.UserController;
import VIEW.Menu;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<UserController> users = new ArrayList<>();
        Menu.mainMenu(users);

    }


}
