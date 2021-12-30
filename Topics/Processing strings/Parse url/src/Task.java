import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String url = scanner.nextLine();

        int pos1 = url.indexOf("?");
        String[] params = url.substring(pos1 + 1).split("&");

        String pass = "";
        for (String param : params) {
            String[] paramSplit = param.split("=");
            if ("pass".equals(paramSplit[0]) && paramSplit.length == 2 && !paramSplit[1].isEmpty()) {
                pass = paramSplit[1];
            }
            System.out.printf("%s : %s\n", paramSplit[0], paramSplit.length == 2 ? paramSplit[1] : "not found");
        }
        if (!pass.isEmpty()) {
            System.out.printf("password : %s", pass);
        }
    }
}