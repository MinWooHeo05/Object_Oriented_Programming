import java.util.Scanner;

class Student {
    long stuId;
    String name;
    String major;
    long phone;

    Student() {}

    Student(long id, String n, String m, long p) {
        stuId = id;
        name = n;
        major = m;
        phone = p;
    }

    void setstuId(long id) { stuId = id; }
    long getstuId() { return stuId; }

    void setName(String n) { name = n; }
    String getName() { return name; }

    void setMajor(String m) { major = m; }
    String getMajor() { return major; }

    void setPhone(long p) { phone = p; }
    long getPhone() { return phone; }

    String phoneNumHy() {
        String s = Long.toString(phone);
        s = "0" + s;
        // 010-xxxx-xxxx 형태로 분할 (substring만 사용)
        String head = s.substring(0, 3);
        String mid  = s.substring(3, 7);
        String tail = s.substring(7);
        return head + "-" + mid + "-" + tail;
    }

    String printLine() {
        return getstuId() + " " + getName() + " " + getMajor() + " " + phoneNumHy();
    }
}

public class Homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student[] students = new Student[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
            long id = Long.parseLong(sc.next());
            String name = sc.next();
            String major = sc.next();
            long phone = Long.parseLong(sc.next());
            students[i] = new Student(id, name, major, phone);
        }
        System.out.println();
        System.out.println("입력된 학생들의 정보는 다음과 같습니다.");
        System.out.println("첫번째 학생: " + students[0].printLine());
        System.out.println("두번째 학생: " + students[1].printLine());
        System.out.println("세번째 학생: " + students[2].printLine());
    }
}
