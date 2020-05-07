public class DemoSwitchWithArrow {
public static void main(String[] args) {
String s= "bbbb";
int r = switch (s) {
    case "aaaa" -> 1;
    case "bbbb" -> 2;
case "cccc"->3;
    default    -> 4;
    
};
System.out.println(r);
}
}