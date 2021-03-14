package factoryPattern;

import java.util.ArrayList;
import java.util.List;

public abstract class Website {

    public Website(){
        this.createWebsite();
    }

    protected List<Page> pages = new ArrayList<Page>();

    public List<Page> getPages() {
        return pages;
    }

    public abstract void createWebsite();
}
