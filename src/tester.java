public class tester {
    public static void main(String[] args) {
        int count=0;
        while (count<29){

            int yeet = count+4;
            if(yeet>28){
                yeet = yeet-29;
            }
            String message = "if (bogst == alphabet["+yeet+"]){"+" return "+"alphabet["+count+"];}";
            System.out.println(message);

            count++;
        }
    }
}
