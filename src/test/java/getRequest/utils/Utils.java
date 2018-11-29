package getRequest.utils;

public class Utils {

    private static final String URL = System.getProperty("url", "http://localhost:3000");


    public static String getUrl(){
        return URL;
    }



}
