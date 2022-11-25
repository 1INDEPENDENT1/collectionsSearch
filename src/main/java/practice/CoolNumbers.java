package practice;

import java.util.*;

public class CoolNumbers {

    public static List<String> generateCoolNumbers() {
        String[] word = {"А", "В", "Е", "К", "М", "Н", "О", "Р", "С", "Т", "У", "Х"};
        String[] number = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String[] region = new String[198];
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;
        for (int i = 0; i <= region.length - 1; i++) {
            if (i <= 8) {
                region[i] = "0" + (i + 1);
            } else region[i] = String.valueOf(i + 1);
        }
        List<String> coolNumber = new ArrayList<>();
        while (!(e == region.length)) {
            String plate = word[a] + number[b] + number[b] + number[b] + word[c] + word[d] + region[e];
            coolNumber.add(plate);
            ++a;
            if (a == word.length) {
                a = 0;
                c++;
            }
            if (c == word.length) {
                c = 0;
                d++;
            }
            if (d == word.length) {
                d = 0;
                b++;
            }
            if (b == number.length) {
                b = 0;
                e++;
            }
        }
        return coolNumber;
    }

    public List<String> getGenerateCoolNumbers() {
        return generateCoolNumbers();
    }

    public static boolean bruteForceSearchInList(List<String> list, String number) {
        List<String> listNumber = new ArrayList<>(list);
        for (String getNumber : listNumber) {
            if (getNumber.equals(number)) {
                return true;
            }
        }
        return false;
    }

    public boolean getBruteForceSearchInList(List<String> list, String number) {
        return bruteForceSearchInList(list, number);
    }

    public static boolean binarySearchInList(List<String> sortedList, String number) {
        return Collections.binarySearch(sortedList, number) >= 0;
    }

    public boolean getBinarySearchInList(List<String> sortedList, String number) {
        return binarySearchInList(sortedList, number);
    }

    public static boolean searchInHashSet(HashSet<String> hashSet, String number) {
        HashSet<String> setNumber = new HashSet<>(hashSet);
        return setNumber.contains(number);

    }

    public boolean getSearchInHashSet(HashSet<String> hashSet, String number) {
        return searchInHashSet(hashSet, number);
    }

    public static boolean searchInTreeSet(TreeSet<String> treeSet, String number) {
        TreeSet<String> setNumber = new TreeSet<>(treeSet);
        return setNumber.contains(number);
    }

    public boolean getSearchInTreeSet(TreeSet<String> treeSet, String number) {
        return searchInTreeSet(treeSet, number);
    }

}
