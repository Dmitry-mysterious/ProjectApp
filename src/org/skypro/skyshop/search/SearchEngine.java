package org.skypro.skyshop.search;

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

}
