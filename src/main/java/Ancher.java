public class Ancher {
    public static void main(String[] args) {
        System.out.println(removeUrlAnchor("www.codewars.com#about"));
    }
    public static String removeUrlAnchor(String url) {
        if (url.contains("#")){
            int index = url.indexOf('#');
            String result = url.substring(0, index);
            return result;
        }
        else return url;
    }
}
