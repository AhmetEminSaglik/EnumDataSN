package org.ahmeteminsaglik.enums.utility;

import org.ahmeteminsaglik.enums.*;

import java.util.Arrays;
import java.util.List;

public class EnumDataUtility {

    public synchronized static List<EnumDataStructor> getEnumDataStructorList() {
        List<EnumDataStructor> enumList = Arrays.asList(EnumDataStructor.values());
        return enumList;
    }

    public synchronized static List<EnumSortAlgorithm> getEnumSortAlgorithmList() {
        List<EnumSortAlgorithm> enumList = Arrays.asList(EnumSortAlgorithm.values());
        return enumList;
    }

    public synchronized static List<EnumSearchAlgorithm> getEnumSearchAlgorithmList() {
        List<EnumSearchAlgorithm> enumList = Arrays.asList(EnumSearchAlgorithm.values());
        return enumList;
    }

    public synchronized static List<EnumProcessName> getEnumProcessNameList() {
        List<EnumProcessName> enumList = Arrays.asList(EnumProcessName.values());
        return enumList;
    }

    public synchronized static List<EnumWordTable> getEnumWordTableList() {
        List<EnumWordTable> enumList = Arrays.asList(EnumWordTable.values());
        return enumList;
    }
}
