public class TimeConversion {
    public static void main(String[] args) {
        System.out.println(timeConversion("10:05:45PM"));
    }

    static String timeConversion(String s) {
        String ans = "";
        String meridiem = s.substring(s.length() - 2, s.length());
        int time = Integer.parseInt(s.substring(0, 2));
        if (meridiem.equals("PM")) {
            if (time < 12) {
                time += 12;
            } else if (time == 12) {
                time = 12;
            }
        }

        if (meridiem.equals("AM")) {
            if (time == 12) {
                time = 0;
            } else if (time < 12) {
                time = time;
            }
        }

        String afterHours = s.substring(2, s.length() - 2);
        if (time >= 0 && time <= 9) {
            ans = "0" + time + afterHours;
        } else {
            ans = time + afterHours;
        }
        return ans;
    }
}
