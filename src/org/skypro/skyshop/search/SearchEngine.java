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

    public Searchable findMostRelevant(String search) throws BestResultNotFound {
        Searchable bestMatch = null;
        int maxCount = 0;

        for (Searchable item : searchables) {
            if (item == null) {
                continue;
            }

            String text = item.getSearchTerm();
            int count = 0;
            int index = 0;
            int foundPos = text.indexOf(search, index);

            while (foundPos != -1) {
                count++;
                index = foundPos + search.length();
                foundPos = text.indexOf(search, index);
            }

            if (count > maxCount) {
                maxCount = count;
                bestMatch = item;
            }
        }

        if (bestMatch == null) {
            throw new BestResultNotFound("Для запроса " + search + " не нашлось подходящей статьи.");
        }


        return bestMatch;
    }

}
