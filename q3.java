import java.util.*;

interface Registerable {
    public abstract String register();
}

class Department {
    String name;

    public Department(String n) {
        name = n;
    }

    private class DeptEnquiry implements Registerable {
        int reqseats;
        int avalseats;

        public DeptEnquiry(int s) {
            reqseats = s;
            avalseats = 5;
        }

        public String register() {
            if (avalseats < reqseats)
                return "Cannot register";
            else {
                avalseats = avalseats - reqseats;
                return "Registered successfully available seats are " + avalseats;
            }
        }
    }
    // ****** Define the method enrollRequest() here
    public Registerable enrollRequest(int seats){
        return new DeptEnquiry(seats);
    }
}

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Department d1 = new Department("DCSE");
        d1.enrollRequest(sc.nextInt());
        System.out.println(d1.enrollRequest(sc.nextInt()));
    }
}