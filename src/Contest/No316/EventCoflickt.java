package Contest.No316;

public class EventCoflickt {
    public static void main(String[] args) {
        String[] event1 = {"14:13","22:08"};
        String[] event2 = {"02:40","08:08"};


    }

    public static boolean haveConflict(String[] event1, String[] event2) {
        String compareTime1 = event1[0];
        String compareTime2 = event2[0];
        if(compareTime1.charAt(0) > compareTime2.charAt(0) ){
            String[] temp = event1.clone();
            event1 = event2.clone();
            event2 = temp.clone();
        }

        String[] ev1End = event1[1].split(":");
        String[] ev2Start = event2[0].split(":");
        int hours = Integer.parseInt(ev1End[0]);
        int hours2 = Integer.parseInt(ev2Start[0]);
        if(hours < hours2) return false;
        else if(hours == hours2){
            int mins1 = Integer.parseInt(ev1End[1]);
            int mins2 = Integer.parseInt(ev2Start[1]);
            return mins1 >= mins2;
        } else {
            return true;
        }
    }
}
