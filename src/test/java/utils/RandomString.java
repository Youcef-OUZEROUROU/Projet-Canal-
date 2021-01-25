package utils;

public class RandomString {

    public static String getRandomStr(int n)
    {
        //choisissez un caractére au hasard à partir de cette chaîne
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "abcdefghijklmnopqrstuvxyz";

        StringBuilder s = new StringBuilder(n);

        for (int i = 0; i < n; i++) {
            int index = (int)(str.length() * Math.random());
            s.append(str.charAt(index));
        }
        return s.toString();
    }
    public static String nom = getRandomStr(10);
    public static String pre  = getRandomStr(8);
    public static String mail = getRandomStr(8)+"001@gmail.com";
    public static String pwd = "N@"+getRandomStr(10);

}
