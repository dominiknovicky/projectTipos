package sk.akademiasovy.tipos.main;

import sk.akademiasovy.tipos.Tipos;
import sk.akademiasovy.tipos.database.MySQLdatabase;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException {
        Tipos t = new Tipos();
        t.generate();
        t.print();

        MySQLdatabase sql = new MySQLdatabase();
        //sql.insertValuesIntoDrawHistory(t.getArr());

        sql.getNewBets();
    }
}
