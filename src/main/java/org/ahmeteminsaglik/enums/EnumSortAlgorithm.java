package org.ahmeteminsaglik.enums;

public enum EnumSortAlgorithm {
    NO_SORT("No-Sort"),
    SELECTION_SORT("Selection Sort"),
    INSERTION_SORT("Insertion Sort"),
    BUBBLE_SORT("Bubble Sort"),
    MERGE_SORT("Merge Sort"),
    HEAP_SORT("Heap Sort"),
    QUICK_SORT("Quick Sort"),
    INTRO_SORT("Intro Sort"),
    TIM_SORT("Tim Sort");
    private final String name;

    EnumSortAlgorithm(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
