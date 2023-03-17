package ua.com.poseal;

public interface MessageRender {
    void render();

    void setMessageProvider(MessageProvider provider);

    MessageProvider getMessageProvider();
}
