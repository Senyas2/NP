public class  ColorPrinter extends Printer {
    public void print (String value){
        System.out.println((char) 27 + "[32m" + value);
    }


}
