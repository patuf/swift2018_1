import java.util.Scanner;

public class Task2_CredentialsManager {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input;

        Credentials[] credentials = new Credentials[100];
        int credentialCount = 0;

        while (!(input = sc.nextLine()).equalsIgnoreCase(("END"))) {

            String[] split = input.split(" ");
            String command = split[0];
            String target = split[1].trim();
            String targetPass = split[2].trim();

            switch (command.toUpperCase()) {
                case "ENROLL":
                    credentials[credentialCount++] = new Credentials(split[1], split[2]);
                    System.out.println("ENROLL success");
                    break;

                case "CHPASS":
                    for (int i = 0; i < credentialCount; i++) {
                        String source = credentials[i].getUsername();

                        if (source.equalsIgnoreCase(target)) {
                            boolean changePasswordSuccessful = credentials[i].changePassword(targetPass, split[3].trim());
                            if (changePasswordSuccessful) {
                                System.out.println("CHPASS success");
                            } else {
                                System.out.println("CHPASS fails");
                            }
                        }
                    }
                    break;

                case "AUTH":
                    for (int i = 0; i < credentialCount; i++) {
                        String source = credentials[i].getUsername();

                        if (source.equalsIgnoreCase(target)) {
                            if (credentials[i].matchPassword(targetPass)) {
                                System.out.println("AUTH success");
                            } else {
                                System.out.println("AUTH fails");
                            }
                        }
                    }
                    break;
                default:
                    break;
            }
        }
    }
}
