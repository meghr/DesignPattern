package prototyePattern;

public abstract class Item implements Cloneable {

    private String title;
    private String url;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Item clone() throws CloneNotSupportedException{
        return (Item) super.clone();
    }

}
