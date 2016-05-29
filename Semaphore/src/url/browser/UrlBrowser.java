package url.browser;

import java.net.*;
import java.io.*;
import java.util.*;

public class UrlBrowser {
    public static void main(String args[]) {
        // Check that the correct number of arguments have been passed
        if (args.length == 1) {
            try {
                // Create a URL object for the URL passed on the command line
                URL url = new URL(args[0]);

                // Retrieve the  UrlConnection from the URL
                URLConnection uc = url.openConnection();

                // Retrieve the InputStream from the URLConnection
                InputStream is = uc.getInputStream();

                // Create a BufferedInputStream to increase performance
                is = new BufferedInputStream(is);

                // Chain the InputStream to a Reader
                Reader reader  = new InputStreamReader(is);

                // Read and display the HTTP header information
                System.out.println();
                System.out.println("** HEADER **");
                Map map = uc.getHeaderFields();
                Set set = map.entrySet();
                Iterator iterator = set.iterator();
                while (iterator.hasNext()) {
                    System.out.println(iterator.next());
                }
                System.out.println();

                // Read and display the BODY
                System.out.println("** BODY **");
                int c;
                while ((c = reader.read()) != -1) {
                    System.out.print((char) c);
                }
            }
            catch (MalformedURLException mfe) {
                System.err.println(args[0] + " is not a valid URL");
            }
            catch (IOException ioe) {
                System.err.println(ioe);
            }
        }
        else {
            // Handle incorrect number or arguments
            System.err.println("Usage: URLBrowser <valid_url>");
        }
    }
}
