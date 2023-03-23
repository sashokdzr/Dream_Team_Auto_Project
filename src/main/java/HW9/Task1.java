package HW9;
/*
Необходимо написать тесты для любого метода из подключенной
 библиотеки (можно использовать StringUtils)
  или можно написать свой метод и протестировать его.
   Тесты должны запускаться через TestNG.
*/
import wniemiec.util.java.StringUtils;

import java.util.List;


class Task1 {
    public static String concat (String str1, String str2, String str3, String delimiter){
        List<String> words = List.of(str1, str2, str3);
        return (StringUtils.implode(words, delimiter));
    }
    public static String concat (String str1, String str2, String delimiter){
        List<String> words = List.of(str1, str2);
        return (StringUtils.implode(words, delimiter));
    }
}
