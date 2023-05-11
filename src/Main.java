import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)throws Exception{
       String[]first={"1","2","3","4","5"};
       String[]second={"5","6","7","8"};
       String[]test={"1","7"};
       List<String>uno= Arrays.asList(first);
       List<String>dos=Arrays.asList(second);
       if(uno.contains(test[0])&&uno.contains(test[1]))
           System.out.print("buenos");
       else if(dos.contains(test[0])&&dos.contains(test[1]))
           System.out.print("guapo");
       else
           System.out.print("mal");

    }


        }

