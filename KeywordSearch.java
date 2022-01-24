public class KeywordSearch {
    public static void main(String args[]) {
        // String key = "heru";
        // char arr[][] =
        // {
        // {'r','u','r','e','h','e','r','u'},
        // {'u','e','r','e','h','e','r','h'},
        // {'r','r','r','e','h','e','r','h'},
        // {'e','u','r','e','h','e','r','u'},
        // {'h','e','e','u','h','e','r','h'},
        // {'e','u','r','e','h','e','r','h'}
        // };

        String key = "mantan";

        // real data from the book, do not modify this

        // char arr[][] =
        // {
        // {'m','n','m','n','t','t','t','n','m','a','m','n','n','a','n','m','n','n','a','t'},
        // {'m','n','m','t','t','n','n','n','a','n','t','a','n','a','n','m','n','m','a','n'},
        // {'n','t','a','n','n','m','t','n','m','a','n','m','n','m','n','n','a','n','t','n'},
        // {'a','a','t','n','a','n','n','n','t','m','t','a','a','a','m','m','t','a','n','n'},
        // {'m','n','a','n','a','a','n','t','a','n','a','m','a','n','n','a','n','a','a','t'},
        // {'n','m','a','m','t','n','n','m','t','n','n','t','a','a','a','m','t','a','n','a'},
        // {'m','m','a','n','t','a','a','a','a','t','n','n','m','n','n','n','n','n','n','n'},
        // {'m','n','n','m','a','n','n','a','t','a','m','t','a','n','a','n','a','n','t','a'},
        // {'a','a','n','n','a','a','m','a','t','a','n','n','a','a','m','n','m','a','n','n'},
        // {'m','n','n','m','a','t','a','n','t','t','n','a','m','m','m','a','t','a','t','a'},
        // {'t','t','a','t','a','n','n','a','n','a','n','n','a','a','a','a','m','n','m','a'},
        // {'m','n','n','t','a','n','t','n','a','t','t','a','n','n','n','t','a','t','m','t'},
        // {'t','n','t','m','t','m','n','t','n','t','a','n','n','a','a','a','t','n','a','t'},
        // {'a','a','t','a','m','n','n','n','n','t','t','m','a','n','a','m','a','t','m','m'},
        // {'a','n','n','m','a','n','a','m','n','n','a','n','n','t','m','a','n','a','m','m'},
        // {'m','t','t','a','t','a','a','m','n','n','a','a','a','a','a','m','a','t','m','n'},
        // {'m','t','a','t','a','m','t','n','n','m','n','n','a','a','t','n','m','m','a','a'},
        // {'n','n','n','n','n','n','a','n','a','a','m','m','n','n','n','n','t','a','a','t'},
        // {'a','t','n','a','m','a','n','m','a','m','m','t','a','n','t','a','t','m','n','a'},
        // {'m','a','a','a','m','m','a','m','t','m','m','n','n','n','m','n','a','a','t','a'}
        // };

        // dummy for testing

        char arr[][] = {
                { 'm', 'n', 'm', 'n', 't', 't', 't', 'n', 'm', 'a', 'm', 'n', 'n', 'a', 'n', 'm', 'n', 'n', 'a', 't' },
                { 'm', 'n', 'm', 't', 't', 'n', 'n', 'n', 'a', 'n', 't', 'a', 'n', 'a', 'n', 'm', 'n', 'm', 'a', 'n' },
                { 'n', 't', 'a', 'n', 'n', 'm', 't', 'n', 'm', 'a', 't', 'm', 'n', 'm', 'n', 'n', 'a', 'n', 't', 'n' },
                { 'a', 'a', 't', 'n', 'a', 'n', 'n', 'n', 't', 'n', 't', 'a', 'a', 'a', 'm', 'm', 't', 'a', 'n', 'n' },
                { 'm', 'n', 'a', 'n', 'a', 'a', 'n', 't', 'a', 'n', 'a', 'm', 'a', 'n', 'n', 'a', 'n', 'a', 'a', 't' },
                { 'n', 'm', 'a', 'm', 't', 'n', 'n', 'm', 't', 'n', 'n', 't', 'a', 'a', 'a', 'm', 't', 'a', 'n', 'a' },
                { 'm', 'm', 'a', 'n', 't', 'a', 'a', 'a', 'a', 't', 'n', 'n', 'm', 'n', 'n', 'n', 'n', 'n', 'n', 'n' },
                { 'm', 'n', 'n', 'm', 'a', 'n', 't', 'a', 'n', 'a', 'm', 't', 'a', 'n', 'a', 'n', 'a', 'n', 't', 'a' },
                { 'a', 'a', 'n', 'n', 'a', 'a', 'm', 'a', 't', 'a', 'n', 'n', 'a', 'a', 'm', 'n', 'm', 'a', 'n', 'n' },
                { 'm', 'n', 'n', 'm', 'a', 't', 'a', 'n', 't', 't', 'n', 'a', 'm', 'm', 'm', 'a', 't', 'a', 't', 'a' },
                { 't', 't', 'a', 't', 'a', 'n', 'n', 'a', 'n', 'a', 'n', 'n', 'a', 'a', 'a', 'a', 'm', 'n', 'm', 'a' },
                { 'm', 'n', 'n', 't', 'a', 'n', 't', 'n', 'a', 't', 't', 'a', 'n', 'n', 'n', 't', 'a', 't', 'm', 't' },
                { 't', 'n', 't', 'm', 't', 'm', 'n', 't', 'n', 't', 'a', 'n', 'n', 'a', 'a', 'a', 't', 'n', 'a', 't' },
                { 'a', 'a', 't', 'a', 'm', 'n', 'n', 'n', 'n', 't', 't', 'm', 'a', 'n', 'a', 'm', 'a', 't', 'm', 'm' },
                { 'a', 'n', 'n', 'm', 'a', 'n', 'a', 'm', 'n', 'n', 'a', 'n', 'n', 't', 'm', 'a', 'n', 'a', 'm', 'm' },
                { 'm', 't', 't', 'a', 't', 'a', 'a', 'm', 'n', 'n', 'a', 'a', 'a', 'a', 'a', 'm', 'a', 't', 'm', 'n' },
                { 'm', 't', 'a', 't', 'a', 'm', 't', 'n', 'n', 'm', 'n', 'n', 'a', 'a', 't', 'n', 'm', 'm', 'a', 'a' },
                { 'n', 'n', 'n', 'n', 'n', 'n', 'a', 'n', 'a', 'a', 'm', 'm', 'n', 'n', 'n', 'n', 't', 'a', 'a', 't' },
                { 'a', 't', 'n', 'a', 'm', 'a', 'n', 'm', 'a', 'm', 'm', 't', 'a', 'n', 't', 'a', 't', 'm', 'n', 'a' },
                { 'm', 'a', 'a', 'a', 'm', 'm', 'a', 'm', 't', 'm', 'm', 'n', 'n', 'n', 'm', 'n', 'a', 'a', 't', 'a' }
        };

        System.out.println("MATRIKS SOAL:");
        System.out.println("");
        System.out.println("KEY: " + key);
        System.out.println("");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" | " + (i + 1));
        }

        System.out.println("");
        // algorithm start

        System.out.println();
        System.out.println("start searching...");
        System.out.println();
        System.out.println("result:");
        System.out.println();

        char keyFirstLetter = key.charAt(0);
        int bound = arr[0].length - 1;
        int boundVertical = arr.length - 1;
        String result = "";
        String diagResultKanan = "";
        String diagResultKiri = "";
        int diagKiri = 0;
        int diagKanan = 0;
        boolean isFound = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == keyFirstLetter) {
                    // kiri lurus
                    if (j - (key.length() - 1) >= 0) {
                        for (int k = j; k > (j - key.length()); k--) {
                            result = result + arr[i][k];
                        }
                        if (result.equals(key)) {
                            isFound = true;
                            System.out
                                    .println("found " + result + " at index: " + (i + 1) + "-" + (j + 1) + " ke kiri");
                        }
                        result = "";
                    }
                    // kanan lurus
                    if (j + (key.length() - 1) <= bound) {
                        for (int k = j; k < (j + key.length()); k++) {
                            result = result + arr[i][k];
                        }
                        if (result.equals(key)) {
                            isFound = true;
                            System.out
                                    .println("found " + result + " at index: " + (i + 1) + "-" + (j + 1) + " ke kanan");
                        }
                        result = "";
                    }
                    // atas lurus
                    if (i - (key.length() - 1) >= 0) {
                        diagKanan = j;
                        diagKiri = j;
                        for (int k = i; k > (i - key.length()); k--) {
                            result = result + arr[k][j];
                            // mulai cek diagonal ke atas kanan
                            if (j + (key.length() - 1) <= bound) {
                                diagResultKanan = diagResultKanan + arr[k][diagKanan];
                                diagKanan++;
                            }
                            // mulai cek diagonal ke atas kiri
                            if (j - (key.length() - 1) >= 0) {
                                diagResultKiri = diagResultKiri + arr[k][diagKiri];
                                diagKiri--;
                            }
                        }
                        if (result.equals(key)) {
                            isFound = true;
                            System.out
                                    .println("found " + result + " at index: " + (i + 1) + "-" + (j + 1) + " ke atas");
                        }
                        if (diagResultKanan.equals(key)) {
                            isFound = true;
                            System.out.println("found " + diagResultKanan + " at index: " + (i + 1) + "-" + (j + 1)
                                    + " arah diagonal atas kanan");
                        }
                        if (diagResultKiri.equals(key)) {
                            isFound = true;
                            System.out.println("found " + diagResultKiri + " at index: " + (i + 1) + "-" + (j + 1)
                                    + " arah diagonal atas kiri");
                        }
                        result = "";
                        diagResultKanan = "";
                        diagResultKiri = "";
                    }
                    // bawah lurus
                    if (i + (key.length() - 1) <= boundVertical) {
                        diagKanan = j;
                        diagKiri = j;
                        for (int k = i; k < (i + key.length()); k++) {
                            result = result + arr[k][j];
                            // mulai cek diagonal ke bawah kanan
                            if (j + (key.length() - 1) <= bound) {
                                diagResultKanan = diagResultKanan + arr[k][diagKanan];
                                diagKanan++;
                            }
                            // mulai cek diagonal ke bawah kiri
                            if (j - (key.length() - 1) >= 0) {
                                diagResultKiri = diagResultKiri + arr[k][diagKiri];
                                diagKiri--;
                            }
                        }
                        if (result.equals(key)) {
                            isFound = true;
                            System.out
                                    .println("found " + result + " at index: " + (i + 1) + "-" + (j + 1) + " ke bawah");
                        }
                        if (diagResultKanan.equals(key)) {
                            isFound = true;
                            System.out.println("found " + diagResultKanan + " at index: " + (i + 1) + "-" + (j + 1)
                                    + " arah diagonal bawah kanan");
                        }
                        if (diagResultKiri.equals(key)) {
                            isFound = true;
                            System.out.println("found " + diagResultKiri + " at index: " + (i + 1) + "-" + (j + 1)
                                    + " arah diagonal bawah kiri");
                        }
                        result = "";
                        diagResultKanan = "";
                        diagResultKiri = "";
                    }
                }
            }
        }

        if (!isFound) {
            System.out.println("not found");
        }
    }
}