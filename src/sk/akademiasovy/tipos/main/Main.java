package sk.akademiasovy.tipos.main;

import com.mysql.jdbc.authentication.MysqlClearPasswordPlugin;
import sk.akademiasovy.tipos.Bet;
import sk.akademiasovy.tipos.Tipos;
import sk.akademiasovy.tipos.database.MySQLdatabase;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException {
        Tipos t = new Tipos();
        t.generate();
        t.print();

        MySQLdatabase sql = new MySQLdatabase();
        //sql.insertValuesIntoDrawHistory(t.getArr());
        List<Bet> list = sql.getNewBets();
        t.printNewBets(list);
    }
}
