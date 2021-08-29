package lecture_20210829;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> numberMap = new HashMap<>();

        numberMap.put("one", 1);
        numberMap.put("two", 2);
        numberMap.put("three", 3);
        numberMap.put("four", 4);

        System.out.println("==== print map =====");
        System.out.println("key값 one : "+ numberMap.containsKey("one"));
        System.out.println("value값 4의 key값은 " + numberMap.containsValue(4));
        System.out.println("numberMap을 set으로 변환 : "+numberMap.entrySet());
        System.out.println("numberMap get method사용 : " + numberMap.get("three"));
        System.out.println("numberMap의 크기 : " + numberMap.size());
    }
}
