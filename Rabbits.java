class Rabbits {
    public static void main(String[] args) {
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
