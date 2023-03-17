package ua.com.poseal.hello;

public interface MessageRender {
    void render();

    void setMessageProvider(MessageProvider provider);

    MessageProvider getMessageProvider();
}
