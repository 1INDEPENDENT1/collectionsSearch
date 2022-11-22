package practice;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        CoolNumbers coolNumbers = new CoolNumbers();
        List<String> list = new ArrayList<>(coolNumbers.getGenerateCoolNumbers());

        long start = System.nanoTime();
        boolean bruteForceSearchInList = coolNumbers.getBruteForceSearchInList(list, "Х999ВЕ196");
        long end = System.nanoTime() - start;
        if (bruteForceSearchInList) {
            System.out.println("Поиск перебором: найден, поиск занял: " + end + "нс");
        } else System.out.println("Поиск перебором: не найден, поиск занял: " + end + "нс");

        HashSet<String> hashSet = new HashSet<>(list);
        start = System.nanoTime();
        boolean searchInHashSet = coolNumbers.getSearchInHashSet(hashSet, "Х999ВЕ196");
        end = System.nanoTime() - start;
        if (searchInHashSet) {
            System.out.println("Поиск в HashSet: найден, поиск занял: " + end + "нс");
        } else System.out.println("Поиск в HashSet: не найден, поиск занял: " + end + "нс");

        TreeSet<String> treeSet = new TreeSet<>(list);
        start = System.nanoTime();
        boolean searchInTreeSet = coolNumbers.getSearchInTreeSet(treeSet, "Х999ВЕ196");
        end = System.nanoTime() - start;
        if (searchInTreeSet) {
            System.out.println("Поиск в TreeSet: найден, поиск занял: " + end + "нс");
        } else System.out.println("Поиск в TreeSet: не найден, поиск занял: " + end + "нс");

        Collections.sort(list);
        start = System.nanoTime();
        boolean binarySearchInList = coolNumbers.getBinarySearchInList(list, "Х999ВЕ196");
        end = System.nanoTime() - start;
        if (binarySearchInList) {
            System.out.println("Бинарный поиск: найден, поиск занял: " + end + "нс");
        } else System.out.println("Бинарный поиск: не найден, поиск занял: " + end + "нс");
    }
}
