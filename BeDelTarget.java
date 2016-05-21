import java.io.*;

public class BeDelTarget
{
    File[] files=null;
    
    public BeDelTarget(File floder)
    {
        if(floder.exists())
        {
            if(floder.isDirectory())
            {
                this.files=floder.listFiles();
            }
            else
            {
                System.out.println("Parameter isn't directory.");
            }
        }
        else
        {
            System.out.println("File not exists.");
        }
    }
}
