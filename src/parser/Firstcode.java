package parser;
interface Parse{
    String parse(String str);
}
class StringParser{
    public static String convert(String s){
        if (s.length()<=3)
            s=s.toUpperCase();
        else
            s=s.toLowerCase();
        return s;
    }
}
class Pri{
    public void print(String str,Parse p){
        str=p.parse(str);
        System.out.println(str);
    }
}
public class Firstcode {
    public static void main(String[] args) {
        String str="Abhiram p";
        Pri mp=new Pri();
        mp.print(str,StringParser::convert);
    }
}
