import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Homework8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Map<String, String> accounts = new HashMap<String, String>();
        accounts.put("myId", "myPass");
        accounts.put("myId2", "myPass2");
        accounts.put("myId3", "myPass3");

        while (true) {
            System.out.println("id 와 password 를 입력해주세요.");
            System.out.print("id : ");
            String id = sc.nextLine();
            id = id.trim();
            
            if (!accounts.containsKey(id)) {
                System.out.println("입력하신 id 는 존재하지 않습니다. 다시 입력해주세요.");
                continue;
            }

            System.out.print("password : ");
            String password = sc.nextLine();
            password = password.trim();
            
            String savedPassword = accounts.get(id);
            if (!savedPassword.equals(password)) {
                System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
                continue;
            }
            System.out.println("id 와 비밀번호가 일치합니다.");
            break;
        }

        sc.close();
    }
}
