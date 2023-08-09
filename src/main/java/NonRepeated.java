public class NonRepeated {
    public static void main(String[] args) {
        System.out.println(firstNonRepeated("teeter"));
        String c = "123";
    }
    public static Character firstNonRepeated(String source) {
        source.chars();
        for (int i=0; i<source.length(); i++){
            String temp = source.replaceFirst("" + source.charAt(i), "");
            if (!temp.contains("" + source.charAt(i))){
                return source.charAt(i);
            }
        }
        return null;
    }
}
