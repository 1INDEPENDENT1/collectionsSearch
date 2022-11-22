package practice;

import java.util.*;

public class CoolNumbers {

    public static List<String> generateCoolNumbers() {
        String[] XYZ = {"А", "В", "Е", "К", "М", "Н", "О", "Р", "С", "Т", "У", "Х"};
        String[] N = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String[] R = new String[198];
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;
        for (int i = 0; i <= R.length - 1; i++) {
            if (i <= 8) {
                R[i] = "0" + (i + 1);
            } else R[i] = String.valueOf(i + 1);
        }
        List<String> coolNumber = new ArrayList<>();
        while (!(e == R.length)) {
            String number = XYZ[a] + N[b] + N[b] + N[b] + XYZ[c] + XYZ[d] + R[e];
            coolNumber.add(number);
            ++a;
            if (a == XYZ.length) {
                a = 0;
                c++;
            }
            if (c == XYZ.length) {
                c = 0;
                d++;
            }
            if (d == XYZ.length) {
                d = 0;
                b++;
            }
            if (b == N.length) {
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
