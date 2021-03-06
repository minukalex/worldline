import java.util.*;
import java.io.*;

public class Main {
    public static String main(String[] args) {
        PrintStream output = new PrintStream(System.out);
        Scanner input = new Scanner(System.in);

        Map<Integer, String> normal =  new HashMap<>();
        output.println("Enter your map, one key-value pair per line,");
        output.println("comma-separated. Use empty line as sentinel.");
        for ( String entry = input.nextLine(); entry.length() !=0;
              entry = input.nextLine()) {
            int comma = entry.indexOf(",");
            Integer key = Integer.parseInt(entry.substring(0,comma));
            String value = entry.substring(comma+1);
            normal.put(key,value);
        }

        return Mainprint(normal);
    }

    private static String Mainprint(Map<Integer, String> normal) {
        String Str = "";
        for (int i=1; i<100; i++) {
            boolean flag = true;
            for (Map.Entry<Integer, String> entry : normal.entrySet()) {
                Integer key = entry.getKey();
                String val = entry.getValue();
                if (i % key == 0) {
                    Str = Str + " " + val;
                    flag = false;
                }
            }
            if(flag)
                Str= Str +" " + i;
        }
        System.out.println(Str);
        return Str;
    }


}