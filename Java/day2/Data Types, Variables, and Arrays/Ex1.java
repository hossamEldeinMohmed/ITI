
class Ex1 {

    /*Develop an application that extracts the minimum and
      maximum of the elements of an array of 1000 element and
      compute the search running time.
     */
    public static void main(String args[]) {

        int min = 0;
        int max = 0;

        int[] arr = new int[1000];
        for (int i = 0; i < 1000; i++) {

            arr[i] = (int) Math.floor(Math.random() * 100 + 1);

        }
        long c = System.nanoTime();
        for (int i = 0; i < 1000; i++) {

            if (arr[i] < min) {
                min = arr[i];

            }

        }
        long time = System.nanoTime() - c;

        System.out.println("time interval to minimum " + time);
        System.out.println("minamum is :" + min);

        c = System.nanoTime();
        for (int i = 0; i < 1000; i++) {

            if (arr[i] > max) {
                max = arr[i];

            }

        }
        time =System.nanoTime() - c;
        System.out.println("time interval to maximum " + time);
        System.out.println("maximum is :" + max);
    }
}
