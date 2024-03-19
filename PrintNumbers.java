package ThreadsPractice;

class PrintsNum extends Thread{
    @Override
    public void run(){
        for (int i =1 ; i <6 ; i++)
            System.out.println(i);
        try{
            Thread.sleep(500);
        }
        catch (Exception e){
            System.out.println("Exception");
        }
    }
}

public class PrintNumbers {
    public static void main(String[] args) {
        PrintsNum printsNum = new PrintsNum();
        printsNum.start();
    }
}
