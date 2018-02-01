package sk.akademiasovy.tipos.main;


import sk.akademiasovy.tipos.Bet;
import sk.akademiasovy.tipos.Tipos;
import sk.akademiasovy.tipos.database.MySQLDatabase;

import java.util.List;

public class Main
{
    public static void main(String[] args)
    {

        Tipos t1= new Tipos();

        t1.generate();
        t1.sort();
        t1.print();

        MySQLDatabase dbs = new MySQLDatabase();

        //dbs.insertValueIntoDrawHistory(t1.getArr());
        List<Bet> list=dbs.getNewBets();
        dbs.getNewBets();
    }
}