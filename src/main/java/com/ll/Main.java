package com.ll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new app().run();
    }
}

class app {
    void run() {
        int num = 1;
        List<String> textlist = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("프로그램 실행");
        System.out.println("== 명언 앱 ==");
        while (true) {
            System.out.print("명령을 입력해주세요 : ");
            String cmd = scanner.nextLine(); // 명령을 입력받

            if (cmd.equals("종료")) {
                break;
            }
            else if (cmd.equals("등록")) {
                System.out.print("명언 : ");
                String text = scanner.nextLine();
                System.out.print("작가 : ");
                String author = scanner.nextLine();
                System.out.println(num + "번 명령이 등록되었습니다.");
                textlist.add(num + " / " + text + " / " + author);
                num++;

            }
            else if (cmd.equals("목록")) {
                System.out.println(textlist);
                if (textlist.isEmpty()) {
                    System.out.println("등록된 명언이 없습니다.");
                }
            }
            else if (cmd.equals("삭제")) {
                System.out.print("삭제할 번호 : ");
                int erasenum = scanner.nextInt();

                for (int i = 1; i <= num; i++) {
                    if (i == erasenum) {
                        textlist.remove(i - 1);
                        System.out.println(erasenum + "번 명언이 삭제되었습니다");
                    }
                }
//                for (int i = 1; i <= num; i++){
//                    if (i == erasenum){
//                        System.out.println(erasenum + "번 명언은 존재하지 않습니다.");
//                    }
//                }
            }
            else if (cmd.equals("수정")) {
                System.out.print("수정할 번호 : ");
                int changenum = scanner.nextInt();
                scanner.nextLine();

                System.out.print("명언 : ");
                String text = scanner.nextLine();
                System.out.print("작가 : ");
                String author = scanner.nextLine();

                for (int i = 1; i <= num; i++) {
                    if (i == changenum) {
                        textlist.set(i - 1, changenum + " / " + text + " / " + author);
                    }
                }

            }
            else {
                System.out.println("명령어를 다시 입력하세요");
            }
        }
    }
}
