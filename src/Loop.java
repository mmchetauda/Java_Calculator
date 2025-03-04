
public class Loop {
    public static void main(String[] args) {
        String[] names = {"Bishal Baniya", "Aryan Adhikari", "Shikshya Mainali"};

        // while
        System.out.println("**while loop**");
        int i = 0;
        while(i < names.length) {
            System.out.printf("%d %s\n", i, names[i]);
            i++;
        }
        System.out.println("-------------------------");
        
        // do while
        System.out.println("**do while loop**");
        int j = 0;
        do {
            System.out.printf("%d %s\n", j, names[j]);
            j++;
        } while (j < names.length);
        System.out.println("-------------------------");
        
        // for loop
        System.out.println("**for loop**");
        for(int k = 0; k < names.length; k++) {
            System.out.printf("%d %s\n", k, names[k]);
        }
        System.out.println("-------------------------");
        
        // foreach loop
        System.out.println("**foreach loop**");
        int l = 0;
        for(String name:names) {
            System.out.printf("%d %s\n", l, name);
            l++;
        }
        System.out.println("-------------------------");
    }
}
