package sk.akademiasovy.tipos.main;


import sk.akademiasovy.tipos.Tipos;
import sk.akademiasovy.tipos.database.MySQLDatabase;

public class Main
{
    public static void main(String[] args)
    {

        Tipos t1= new Tipos();

        t1.generate();
        t1.sort();
        t1.print();

        MySQLDatabase dbs = new MySQLDatabase();

        dbs.insertValueIntoDrawHistory(t1.getArr());


    }
}