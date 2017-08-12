package pmu.swtsandbox;

import org.eclipse.swt.*;
import org.eclipse.swt.widgets.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Display display = new Display();
       Shell shell = new Shell(display);
       
       
       Text helloText = new Text(shell, SWT.CENTER );
       
       helloText.setText("hello world");
       
       helloText.pack();
       
       shell.pack();
       
       shell.open();
       System.out.println("start");

       while (!shell.isDisposed()) {
    	   if (!display.readAndDispatch()) {
    		   display.sleep();
    	   }
    	   
       }
	   display.dispose();

       System.out.println("stop");

    }
}
