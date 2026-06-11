package org.skypro.skyshop.search;

import org.skypro.skyshop.exceptions.BestResultNotFound;

public class SearchEngine {
    private Searchable[] searchables;

    public SearchEngine(int size) {
        searchables = new Searchable[size];
    }

    public Searchable[] search(String search) {
        Searchable[] result = new Searchable[5];
        int countElem = 0;

        for (Searchable item : searchables) {
            if (item != null && item.getSearchTerm().contains(search)) {
                result[countElem] = item;
                countElem++;
            }

            if (countElem == 5) {
                break;
            }
        }

        return result;
    }

    public void add(Searchable searchable) {
        for (int i = 0; i < searchables.length; i++) {
            if (searchables[i] == null) {
                searchables[i] = searchable;
                break;
            }
        }
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
