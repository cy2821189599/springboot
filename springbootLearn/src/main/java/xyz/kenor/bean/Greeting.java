package xyz.kenor.bean;

/**
 * @author ：kenor
 * @date ：Created in 2020/8/16 8:58
 * @description：
 * @version: 1.0
 */

public class Greeting {

    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
