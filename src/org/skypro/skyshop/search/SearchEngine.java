package org.skypro.skyshop.search;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class SearchEngine {
    private List<Searchable> searchables;

    public SearchEngine() {
        searchables = new LinkedList<>();
    }

    public List<Searchable> search(String search) {
        List<Searchable> result = new LinkedList<>();
        Iterator<Searchable> iterator = searchables.iterator();

        while (iterator.hasNext()) {
            Searchable searchable = iterator.next();

            if (searchable != null && searchable.getSearchTerm().contains(search)) {
                result.add(searchable);
            }
        }

        return result;
    }

    public void add(Searchable searchable) {
        searchables.add(searchable);
    }

}
