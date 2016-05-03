package tutoriallog4j;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PruebaArchivoPropiedades {
  public static void main(String[] args) {

    Properties propiedades = new Properties();
    InputStream entrada = null;

    try {

        entrada = new FileInputStream("log4j.properties");

        // cargamos el archivo de propiedades
        propiedades.load(entrada);

        // obtenemos las propiedades y las imprimimos
        System.out.println(propiedades.getProperty("log4j.appender.file.MaxBackupIndex"));
        System.out.println(propiedades.getProperty("log4j.appender.file.layout"));
        System.out.println(propiedades.getProperty("log4j.appender.stdout.layout"));

    } catch (IOException ex) {
        ex.printStackTrace();
    } finally {
        if (entrada != null) {
            try {
                entrada.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

  }
}
