package models;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Administrador {
public boolean checkUser(String usuario) {
    boolean flagUser=false;
    try (
            InputStream input = new FileInputStream("config.properties")) {
        Properties prop = new Properties();
        prop.load(input);
        String value = prop.getProperty("db.user");

        if (value.equalsIgnoreCase(usuario)) {
            flagUser=true;
        }
    } catch (
            FileNotFoundException e) {
        throw new RuntimeException(e);
    } catch (
            IOException e) {
        throw new RuntimeException(e);
    }
    return flagUser;
}
    public boolean checkPassword(String password) {
        boolean flagPassword=false;
        try (
                InputStream input = new FileInputStream("config.properties")) {
            Properties prop = new Properties();
            prop.load(input);
            String value = prop.getProperty("db.pass");

            if (value.equalsIgnoreCase(password)) {
                flagPassword=true;
            }
        } catch (
                FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (
                IOException e) {
            throw new RuntimeException(e);
        }
        return flagPassword;
    }
}
