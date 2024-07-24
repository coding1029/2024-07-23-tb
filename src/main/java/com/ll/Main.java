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
        System.out.println("프로그램 실행");
        System.out.println("== 명언 앱 ==");
        while (true) {
            System.out.print("명령을 입력해주세요 : ");
            Scanner scanner = new Scanner(System.in);

            String cmd = scanner.nextLine(); // 명령을 입력받

            if (cmd.equals("종료")) {
                break;
            }
            else if (cmd.equals("등록")) {
                System.out.print("명언 : ");
                String text = scanner.nextLine();
                System.out.print("작가 : ");
                String author = scanner.nextLine();
                //System.out.printf("명언 : %s, 작가 : %s\n", text, author);
                System.out.println(num + "번 명령이 등록되었습니다.");
                num++;

                //textlist.add(text + " / " + author);
            }
            else if (cmd.equals("목록")) {
                System.out.println(textlist);
//                for (int i = 0; i < num; i++) {
//                    System.out.println(textlist);
//                    //System.out.println(num + " / " + scanner.author + " / " + scanner.text);
//                }
            }
            else if(cmd.equals("삭제")) {
                System.out.print("삭제할 번호 : ");
                int erasenum = scanner.nextInt();

                for (int i = 0; i < num; i++){
                    if (erasenum == i){
                        ///// erasenum번 명언을 삭제하는 코드 구현??????????????
                        System.out.println(erasenum + "번 명언이 삭제되었습니다");
                    }
                }
            }
            else if(cmd.equals("수정")) {

            }
        }
    }
}