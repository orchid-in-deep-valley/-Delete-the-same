import java.io.*;
import java.util.Scanner;

public class Main
{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        String bdt,dt;
        System.out.print("Be delete file path:");
        bdt=input.nextLine();
        System.out.print("Delete file path:");
        dt=input.nextLine();
        BeDelTarget bedeltarget=new BeDelTarget(new File(bdt));
        DelTarget deltarget=new DelTarget(new File(dt));
        //获取被删除与删除的路径并创建对象
        
        DelSame(bedeltarget,deltarget);

        System.out.println("Programe end.");
    }

    public static void DelSame(BeDelTarget bd,DelTarget d)
    {
       for(int i=0;i<d.files.length;i++)
       {
           for(int j=0;j<bd.files.length;j++)
           {
               if((d.files[i].getName()).equals(bd.files[j].getName()))//使用==比较一直都得到false
               {
                   try
                   {
                       bd.files[j].delete();
                       System.out.println(d.files[i].getName()+" is be Delete.");
                   }catch(Exception e)
                   {
                       System.out.println(bd.files[j].getName()+" delete fail.");
                   }
               }
               else
            	   System.out.println(d.files[i].getName()+"------"+bd.files[j].getName());
           }
       }
    }
}
