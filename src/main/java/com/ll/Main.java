package com.ll;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력을 받고 싶다?
        Scanner scanner = new Scanner(System.in);
        System.out.println("명령을 입력해주세요 : ");
        String 명령 = scanner.next(); // 명령을 입력받

        System.out.println("== 명언 앱 ==");
        while (true) {
            if(명령 == "종료"){
                break;
            }
            else if(명령 == "등록"){

            }
        }
    }
}
class 명언앱{
    String 명언, 작가;
    void 등록(){
        System.out.println("명언 : ");
    }
}