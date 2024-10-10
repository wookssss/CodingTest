package Programmers;

// 문자열 my_string이 매개변수로 주어질 때,
// 대문자는 소문자로 소문자는 대문자로 변환한 문자열을 return하도록 solution 함수를 완성해주세요.
public class _120893 {
    public static void main(String[] args) {
        String str1 = "cccCCC";
        String str2 = "abCdEfghIJ";

        System.out.println(solution(str1));
        System.out.println(solution(str2));
    }
    public static String solution(String my_string) {
        String answer = "";
        for(int i=0;i<my_string.length();i++){
            // ASCII 코드를 활용하는 경우 대문자와 소문자 코드값의 차이만큼 +,-
            char check_char = my_string.charAt(i);
            if(check_char>='A' && check_char<='Z') answer+=(char)(check_char+32);
            else answer+=(char)(check_char-32);
        }
        return answer;
    }
}
