import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import static java.lang.System.out;
import java.util.Scanner;
import javax.swing.*;
public class a extends Frame
{
    ImageIcon c = new ImageIcon("a.png");
    public a() 
    { 
        setTitle("BaseGraphy v1");
        setVisible(true); 
        setBackground(new Color(255,255,255));
        setSize(600,600);
        setIconImage(c.getImage());
        addWindowListener(new WindowAdapter() { 
            @Override
            public void windowClosing(WindowEvent e) 
            { 
                System.exit(0); 
            } 
        }); 
    }
    public void paint(Graphics c)
    {
        Color d=new Color(0,0,0);
        c.setColor(d);
    }
    public void repaint(Graphics c)
    {
        paint(c);
    }
    public static void main(String[]c)
    {
        Frame a=new a();float[]pos=new float[]{0,0,0};float pov=0;int mxf=objects.framerate();
        Graphics d=a.getGraphics();
        while(true){
        try{Thread.sleep(1000/mxf);}catch(Exception e){return;}
        }
    }
}
class b
{
    public static void readfile(String path)
    {

    }
    static void update(Graphics a)
    {
        
    }
}
class objects
{
    String type;int[]pos;int[]size;int[]pov;int[]ppos;
    public objects(int a)
    {
        Scanner c;
        try{c=new Scanner(new File("script"));}catch(Exception e){out.println("Critical error occured");System.exit(0);}

    }
    static int framerate()
    {
        Scanner c=null;
        try{c=new Scanner(new File("script"));}catch(Exception e){out.println("Critical error occured");System.exit(0);}
        String d=c.nextLine();
        if(d.contains("framerate"))
        {
            int e=d.indexOf("framerate");
            return(Integer.parseInt(d.substring(d.indexOf("{",e)+1,d.indexOf("}",e))));
        }
        return 60;
    }
}