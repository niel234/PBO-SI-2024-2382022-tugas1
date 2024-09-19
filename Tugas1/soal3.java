package Tugas1;

public class soal3 {
    public static void main(String[] args) {
        System.out.println(countCameICaseWords("SatuTiga"));

        System.out.println(countCameICaseWords("SaveChangesInEditor"));

    }

    public static int countCameICaseWords(String cameLiCaseString) {
        if (cameLiCaseString == null || cameLiCaseString.isEmpty()) {
            return 0;
        }

        int count = 1;
        for (char c : cameLiCaseString.toCharArray()) {
            if (Character.isUpperCase(c)) {
                count++;

            }
        }

        return count;
    }
}
