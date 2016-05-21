import java.io.*;

public class DelTarget
{
    File[] files=null;

    public DelTarget(File floder)
    {
        if(floder.exists())
        {
        if(floder.isDirectory())
             this.files=floder.listFiles();
        else
            System.out.println("Parameter isn't directory.");
        }
        else
            System.out.println("File not exists.");
    }
}
