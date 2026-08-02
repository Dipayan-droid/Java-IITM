import java.util.Scanner;

interface IResearchScholar {
    public void teaches(String str);

    public void studies(String str);
}

abstract class JuniorRS implements IResearchScholar {
    public void studies(String str1) {
        System.out.println("TA studies " + str1);
    }
}

class SeniorRS extends JuniorRS {
    public void teaches(String str) {
        System.out.println("TA teaches " + str);
    }
}

public class InterAbstrTest extends SeniorRS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        JuniorRS jrs = new InterAbstrTest();
        SeniorRS srs = new InterAbstrTest();
        jrs.studies(str1);
        srs.studies(str2);
        srs.teaches(str2);
        sc.close();
    }
}