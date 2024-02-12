import java.util.Arrays;

class Application {

    void run(String[] args) {
        // implement me
        int length = Arrays.stream(args).toList().size();
        for (int i = 0; i <= length-1; i++) {
            System.out.println(args[i]);
        }
    }
}