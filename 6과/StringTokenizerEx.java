import java.util.*;

public class StringTokenizerEx{
    public static void main(String[] args) {
        StringTokenizer st= new StringTokenizer("유원준/최종현/최고운/자바/스터디/화이팅","/");
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}