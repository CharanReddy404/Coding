public class Main {
    public static void main(String[] args){
        printMegaBytesAndKiloBytes(8143);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes<0){
            System.out.println("invalid value, because the value is less that 0");
        }else {
            int megaByte = kiloBytes / 1024;
            int remainingKiloByte = kiloBytes % 1024;
            System.out.println(kiloBytes + "KB = " + megaByte + "MB and " + remainingKiloByte + "KB");
        }
    }
}
