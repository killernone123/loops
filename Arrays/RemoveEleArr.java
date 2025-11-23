public class RemoveEleArr {
    public static void main(String[] args) {
        int arr[] = { 1, 9, 3, 4, 3, 2, 3, 1, 5, 3 };

        int ele = 3;
        int countEle = 0;
        for (int i = 1; i < arr.length; i++) {
            if (ele == arr[i]) {
                countEle++;

            }
        }
        if (countEle > 0) {
            int newArr[] = new int[arr.length - countEle];
            int index = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != ele) {
                    newArr[index] = arr[i];
                    index++;
                }
            }
            arr = newArr;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
