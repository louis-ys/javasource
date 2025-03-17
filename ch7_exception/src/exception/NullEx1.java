package exception;

public class NullEx1 {
    public static void main(String[] args) {

        String str = null;

        // System.out.println(str.length());

        Account accounts[] = new Account[5];

        try {

            for (Account account : accounts) {
                if (account != null) {
                    System.out.println(account.getAno());
                }

                System.out.println(account.getAno());

            }

        } catch (NullPointerException e) {
            // e.printStackTrace();
            // System.out.println(e.getMessage());

        }
    }

}
