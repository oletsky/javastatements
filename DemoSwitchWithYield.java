public class DemoSwitchWithYield {
public static void main(String[] args) {
String s= "bbbb";
int r = switch (s) {
    case "aaaa": yield 1;
    case "bbbb": yield 2;
    case "cccc": yield 3;
    default: yield 4;
    
};
System.out.println(r);
}
}