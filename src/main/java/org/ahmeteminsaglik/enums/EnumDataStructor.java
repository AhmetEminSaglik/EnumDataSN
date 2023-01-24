package org.ahmeteminsaglik.enums;

public enum EnumDataStructor {
//    ARRAY("Array"),
    HASHMAP("Hashmap"),
    ARRAYLIST("ArrayList"),
    SEARCHNODE_V1("SearchNode V1"),
    SEARCHNODE_V2("SearchNode V2");
    private final String name;

    EnumDataStructor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
