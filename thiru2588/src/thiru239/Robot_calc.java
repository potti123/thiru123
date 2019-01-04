package thiru239;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class Robot_calc
{
private static final java.awt.datatransfer.DataFlavor DataFlavor = null;
private static final String StringFlavor = null;

public static void main(String[] args) throws Exception
	{
		//launch calculat0r 
	Runtime.getRuntime().exec("calc.exe");
	Thread.sleep(5000);
	//enter input1
	StringSelection x=new StringSelection("150");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(x,null);
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_V);
	r.keyRelease(KeyEvent.VK_V);
	r.keyRelease(KeyEvent.VK_CONTROL);
	Thread.sleep(5000);
	// click +
	r.keyPress(KeyEvent.VK_ADD);
	r.keyRelease(KeyEvent.VK_ADD);
	Thread.sleep(5000);
	//Enter input2
	StringSelection y=new StringSelection("850");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(y,null);
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_V);
	r.keyRelease(KeyEvent.VK_V);
	r.keyRelease(KeyEvent.VK_CONTROL);
	Thread.sleep(5000);
	//click
	r.keyPress(KeyEvent.VK_EQUALS);
	r.keyRelease(KeyEvent.VK_EQUALS);
	Thread.sleep(5000);
	//get output
	r.keyPress(KeyEvent.VK_CONTEXT_MENU);
	r.keyRelease(KeyEvent.VK_CONTEXT_MENU);
	Thread.sleep(5000);
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	Thread.sleep(5000);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(5000);
	String z=(String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
	System.out.println(z);
	//close calculator
	r.keyPress(KeyEvent.VK_ALT);
	r.keyPress(KeyEvent.VK_F4);
	r.keyRelease(KeyEvent.VK_F4);
	r.keyRelease(KeyEvent.VK_ALT);
	
	
	
	
	
	
	}

}
