class Rabbits {
    public static void main(String[] args) {
	for (int month = 1; month <= 12; month++) {
	    System.out.println("At the end of month#" + month + ", there are "
			       + fibo(month) + " mature rabbit pairs.");
	}
    }

    public static int fibo(int month) {
	if (month == 1) {
	    return 0;
	} else if (month == 2) {
	    return 1;
	} else {
	    return fibo(month - 1) + fibo(month - 2);
	}
    }
}
