package ua.com.poseal;

public class HelloWorldDecoupled {
    public static void main(String[] args) {
        MessageRender mr = new StandardMessageRender();
        MessageProvider mp = new HelloWorldMessageProvider();
        mr.setMessageProvider(mp);
        mr.render();
    }
}
