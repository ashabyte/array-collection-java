public class HashMap {
    public static void main(String[] args) {
        java.util.HashMap<String, Integer> nilai = new java.util.HashMap<>();

        nilai.put("Alfath", 90);
        nilai.put("Iman", 90);
        nilai.put("Maya", 90);

        System.out.println("Nilai Alfath: " + nilai.get("Alfath"));
        System.out.println("Semua data: " + nilai);
    }
}