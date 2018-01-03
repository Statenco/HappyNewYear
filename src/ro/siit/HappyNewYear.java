package ro.siit;

import java.util.Calendar;

public class HappyNewYear {

    public static void main(String args[]) {

        String st[] = new String[7];
        st[0] = "             @@@@@@@@     @@@@@@@@    @   @@@@@@@ ";
        st[1] = "                     @   @        @  @@  @       @";
        st[2] = "                     @   @        @   @  @       @";
        st[3] = "             @@@@@@@@    @        @   @   @@@@@@@ ";
        st[4] = "            @            @        @   @  @       @";
        st[5] = "            @            @        @   @  @       @";
        st[6] = "             @@@@@@@@     @@@@@@@@   @@@  @@@@@@@ ";

        int stars = 1;
        String name = "**********Statenco Dragos-Alexandru wish's you a Happy New Year**********";
        int blank = 30;
        int year = 2018;
        String s = "Happy New Year Happy New Year Happy New Year Happy New Year Happy New Year Happy New Year Happy New Year";
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);


            try {

                if (year == currentYear) {
                    for (int i = 30; i > 1; i--) {
                        for (int j = 1; j <= blank; j++) {
                            System.out.print(' ');
                        }

                        try {
                            for (int e = 0; e < stars; e++) {
                                System.out.print(s.substring(e, e + 1));
                                Thread.sleep(10);
                            }
                        } catch (Exception ex) {
                            ex.printStackTrace();
                        }
                        if (i == 15) {
                            for (int u = 0; u < name.length(); u++) {
                                System.out.print(name.substring(u, u + 1));
                                Thread.sleep(100);
                            }
                        }
                        System.out.println();
                        blank = blank - 1;
                        stars += 2;
                        Thread.sleep(200);


                    }
                    for (int i = 1; i < 4; i++) {
                        System.out.println("                            ***");
                        if (i == 3)
                            System.out.println("                         *********");
                        Thread.sleep(100);
                    }


                }
                try {
                    for (int j = 0; j < 7; j++) {
                        for (int i = 0; i < 50; i++) {
                            System.out.print(st[j].substring(i, i + 1));
                            Thread.sleep(10);
                        }
                        System.out.println();
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }




