import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//파일 입출력이다

public class hello {
    public static void main(String[] args) {
        File file = new File("input.txt");
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextInt()) {
                System.out.print(sc.nextInt() * 100 + " ");
                sc.close();
            }
        } catch (FileNotFoundException e) {
            System.out.println("파일을 찾을 수 없습니다.");
            e.printStackTrace();
        }

    }
}