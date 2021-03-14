package prototyePattern;

import java.util.HashMap;
import java.util.Map;

public class Registry {

    private Map<String,Item> items = new HashMap<String ,Item>();

    // This will create object very first with value defined in method loadItems()
    public Registry(){
        loadItems();
    }

    private void loadItems() {

        Movie movie = new Movie();
        movie.setRuntime(150.20);
        movie.setTitle("Default Movie Title");
        items.put("Movie",movie);

        Book book = new Book();
        book.setNumberOfPages(150);
        book.setTitle("Default Book Title");
        items.put("Book",book);

    }

    // In this method we are returning the item object depending on specified type e.g. Movie or Book
    public Item createItems(String type){
        Item item = null;

        // here we are cloning the object which was created in loadItems
        // as we are not using new so less overhead
        try {
            item = items.get(type).clone();
        }catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }

        return item;
    }
}
