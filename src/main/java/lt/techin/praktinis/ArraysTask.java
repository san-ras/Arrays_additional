package lt.techin.praktinis;

import java.util.Arrays;

public class ArraysTask {


    public static void main(String[] args) {
        // Įgyvendikite visus metodus (turi pažaliuoti unit testai)
        // Pateiktas masyvas ir pavyzdys programos patikrinimui. Masyvo elementų reikšmes galite keisti.

        int[] arr = {3, 2, 1, 4, 6, 5};

        int[] arrWithRemovedElement = removeElementAndReturnNewArray(arr, 1);
        System.out.println(Arrays.toString(arrWithRemovedElement));

    }

    // Parašykite metodą, kuris sukuria nustatyto dydžio sveikųjų skaičių masyvą
    // ir užpildo jį atsitiktinai sugeneruotais skaičiais iš nurodyto intervalo.
    public static int[] generateRandomArray(int size, int min, int max) {
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = ((int) ((Math.random() * (max - min)) + min));
        }
        return numbers;
    }


    //Parašykite metodą, kuris pašalintų masyvo arr[n] k-tąjį elementą (su indeksu k),
    //surašant reikiamus elementus į naują masyvą b[n-1]. Metodas grąžina naują masyvą.
    //Jei k yra už masyvo ribų, metodas grąžina null (teisingiau būtų mesti exception, bet dar nesimokėm)
    public static int[] removeElementAndReturnNewArray(int[] arr, int k) {
        if (arr.length <= k || arr.length == 0) {
            return null;
        } else {
            int[] newArray = new int[arr.length - 1];
            for (int i = 0; i < arr.length; i++) {
                if (i < k) {
                    newArray[i] = arr[i];
                } else if (i > k) {
                    newArray[i - 1] = arr[i];
                }
            }
            return newArray;
        }
    }

    //Parašykite metodą, kuris įterptų į masyvą arr[n] prieš k-tąjį elementą reikšmę x,
    //surašant reikiamus elementus į naują masyvą b[n+1]. Metodas grąžina naują masyvą.
    //Jei k yra už masyvo ribų, metodas grąžina null (teisingiau būtų mesti exception, bet dar nesimokėm)
    public static int[] insertElementAndReturnNewArray(int[] arr, int k, int x) {
        if (arr.length <= k || arr.length == 0) {
            return null;
        } else {
            int index = 0;
            int[] newArray = new int[arr.length + 1];
            for (int i = 0; i < arr.length; i++) {
                if (i != k) {
                    newArray[index] = arr[i];
                    index++;
                } else {
                    newArray[index] = x;
                    index++;
                    newArray[index] = arr[i];
                    index++;
                }
            }
            return newArray;
        }
    }

    //Parašykite metodą, kuris grąžintų duoto masyvo apverstą kopija.
    public static int[] reverseArray(int[] arr) {
        int[] newArray = new int[arr.length];
        int index = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            newArray[index] = arr[i];
            index++;
        }
        return newArray;
    }

    //Parašykite metodą, kuris apverstu duotą masyvą (nekuriant naujo masyvo)
    public static void reverseInPlace(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temporaryNumber = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temporaryNumber;
        }
    }
}

