public class Main {
    public static void main(String[] args){
        hasTeen(12, 1,99);
    }

    public static boolean hasTeen(int one, int two, int three){
        if(((one<13) && (one>19)) || ((two<13) && (two>19)) || ((three<13) && (three>19))){
            System.out.println(false);
            return false;
        }else if(((one>=13) && (one<=19)) || ((two>=13) && (two<=19)) || ((three>=13) && (three<=19))){
            System.out.println(true);
            return true;
        }else {
            System.out.println(false);
            return false;
        }
    }
}
