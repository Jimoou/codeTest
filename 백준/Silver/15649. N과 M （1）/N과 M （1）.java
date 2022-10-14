import java.io.*;
import java.util.*;
public class Main {
    static StringBuilder sb = new StringBuilder();

    static int N, M;
    static int[] selected, used;

    static void rec_Func(int k) {
        if (k == M + 1) {
            for (int i = 1; i <= M; i++) sb.append(selected[i]).append(' ');
            sb.append('\n');
        }
        else {
            for (int cand = 1; cand <= N; cand++) {
                if (used[cand] == 1) continue;

                selected[k] = cand;     used[cand] = 1;

                rec_Func(k + 1);

                selected[k] = 0;        used[cand] = 0;
            }
        }
    }

    public static void main(String[] args) {
        input();

        rec_Func(1);
        System.out.println(sb.toString());
    }
    static void input() {
        FastReader scan = new FastReader();
        N = scan.nextInt();
        M = scan.nextInt();
        selected = new int[M + 1];
        used = new int[N + 1];
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        public FastReader(String s) throws FileNotFoundException {
            br = new BufferedReader(new FileReader(new File(s)));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer((br.readLine()));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine(){
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

    }
}

