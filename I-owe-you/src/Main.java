public class Main {

    public static void main(String[] args) {
        
IOweYou mattsIOU = new IOweYou();
mattsIOU.setSum("Arthur", 51.5);
mattsIOU.setSum("Arthur", 10.5);

System.out.println(mattsIOU.howMuchDoIOweTo("Arthur"));
    }
}