import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class Robott {

    public static void clip(String text){
        StringSelection stringSelection=new StringSelection(text);
        Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
   clipboard.setContents(stringSelection,stringSelection);
    }


    public static void main(String[] args) throws IOException,AWTException {
        System.setProperty("sun.awt.enableExtraMouseButtons", "true");
        Robot robot =new Robot();
        Runtime runtime=Runtime.getRuntime();

        //copy&Paste
        String [] text=new String[10];
        text[0]="c:";
        text[1]="clear";
        text[2]="cd Desktop";
        text[3]="wget \"https://sample-videos.com/img/Sample-jpg-image-50kb.jpg\" -outfile \"ec.jpg\"";
       text[4]="exit";
       text[5]="Users";

        //Desktop
        //wait
//        robot.delay(1000);
//        //powershell
//        robot.keyPress(KeyEvent.VK_WINDOWS);
//        robot.keyPress(KeyEvent.VK_X);
//        robot.keyRelease(KeyEvent.VK_WINDOWS);
//        robot.keyRelease(KeyEvent.VK_X);
//        robot.delay(500);
//        robot.keyPress(KeyEvent.VK_I);
//        robot.keyRelease(KeyEvent.VK_I);

          //loop for copy&Paste
//        for(int i=0;i<5;i++){
//            robot.delay(    1000);
//            clip(text[i]);
//            robot.keyPress(KeyEvent.VK_CONTROL);
//            robot.keyPress(KeyEvent.VK_V);
//            robot.keyRelease(KeyEvent.VK_CONTROL);
//            robot.keyRelease(KeyEvent.VK_V);
//            robot.keyPress(KeyEvent.VK_ENTER);
//            robot.keyRelease(KeyEvent.VK_ENTER);
//
//
//        }
//opening a directory
//        robot.delay(1000);
//        robot.keyPress(KeyEvent.VK_WINDOWS);
//        robot.keyRelease(KeyEvent.VK_WINDOWS);
//        clip(text[6]);
//        robot.keyPress(KeyEvent.VK_CONTROL);
//        robot.keyPress(KeyEvent.VK_V);
//        robot.keyRelease(KeyEvent.VK_CONTROL);
//        robot.keyRelease(KeyEvent.VK_V);
//        robot.keyPress(KeyEvent.VK_ENTER);
//        robot.keyRelease(KeyEvent.VK_ENTER);

   runtime.exec("mspaint.exe");
   robot.delay(1000);
   int xstart=100;
   int ystart=300;
   robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
   for(int k=0;k<200;k++){
       int l=xstart+k;
       int m=ystart+k;
       robot.mouseMove(l,m);
       robot.delay(10);

   }
   robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);







    }
}
