package Bai7;

public class Bai7_3 {

    public boolean laTamGiac(int a, int b, int c) {
        // Check if the sum of any two sides is greater than the third side
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    public String loaiTamGiac(int a, int b, int c) {
        if (!laTamGiac(a, b, c)) {
            return "Không phải tam giác";
        }

        if (a == b && b == c) {
            return "Tam giác đều";
        } else if (a == b || b == c || a == c) {
            return "Tam giác cân";
        } else {
            return "Tam giác thường";
        }
    }
}
