package Programmers;


// 문자열 my_string이 매개변수로 주어집니다.
// my_string안의 모든 자연수들의 합을 return하도록 solution 함수를 완성해주세요.
public class _120851 {
    public static void main(String[] args) {
        int answer = 0;
        char ch;
        // 예시 문자열
        String my_string = "aAb1B2cC34oOp";

        for(int i=0;i<my_string.length();i++){
            // 문자열에서 index의 문자를 읽어오는 charAt() 메소드
            ch = my_string.charAt(i);
            // ASCII 코드 활용하여 자연수만 int로 형변환
            if(ch>=48 && ch<=57) answer += ch - 48;
        }

        // answer = 10
        System.out.println(answer);
    }
}

