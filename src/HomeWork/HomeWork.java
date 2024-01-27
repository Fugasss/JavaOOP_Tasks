package HomeWork;

import java.util.Scanner;

public abstract class HomeWork {

    protected Scanner _scanner;

    public HomeWork(){
        _scanner = new Scanner(System.in);
    }

    public abstract void callAll();
}
