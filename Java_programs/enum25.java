
public class enum25 {

    public static void main(String args[]) {
        Status s = Status.Failed;
        System.out.println(s.ordinal());
        Status[] ss = Status.values();
        System.out.println(ss[3]);
        for (Status x : ss) {
            System.out.println(x + " " + x.ordinal());
        }
    }
}

enum Status {
    Running, Failed, Pending, Success;
}
