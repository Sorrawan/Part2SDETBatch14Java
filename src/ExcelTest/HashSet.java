package ExcelTest;

public class HashSet {

    //ตัวซ้ำมันไม่สนใจ และที่สำคัญคือ ไม่สนใจลำดับในการเพิ่มข้อมูลด้วย
    public static void main(String[] args) {
        java.util.HashSet<String> h = new java.util.HashSet<String>();
        h.add("Elon Musk");
        h.add("Mark Zuckerberg");
        h.add("Bill Gates");
        h.add("Elon Musk");
        System.out.print(h);
    }
}
