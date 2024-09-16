
public class demo7 {

    public static void main(String args[]) {
        computer obj = new computer();
        obj.Playmusic();
        String result = obj.getPen(5);
        System.out.println(result);
    }
}

class computer {

    public void Playmusic() {
        System.out.println("Music plays..");
    }

    public String getPen(int cost) {
        if (cost >= 10) {
            return "Pen";
        }
        return "Nothing";
    }
}
