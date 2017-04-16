package fileoperations;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Bahadır
 */
public class BuildConfigurer {
    public void exportConfigs( String location) throws IOException {
        exportConfigData( "/fileoperations/buildconfigs/build.xml", location + "/build.xml");
        exportConfigData( "/fileoperations/buildconfigs/buildJavadoc.xml", location + "/buildJavadoc.xml");
        exportConfigData( "/fileoperations/buildconfigs/buildJar.xml", location + "/buildJar.xml");
        exportConfigData( "/fileoperations/buildconfigs/runJava.xml", location + "/runJava.xml");
    }
    
    private void exportConfigData( String source, String target) throws IOException {
        Scanner reader = new Scanner( getClass().getResourceAsStream( source));
        PrintWriter writer = new PrintWriter( new File( target));
        while( reader.hasNext())
            writer.println(reader.nextLine());
        reader.close();
        writer.close();
    }
}