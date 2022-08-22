package Contest.No307;

public class MinimumHoursOfTraining {
    public int minNum(int initialEnergy, int initialExperience, int[] energy, int[] experience){
        int hours = 0;
        int sumEnergy = 0;
        for(int val : energy){
            sumEnergy += val;
        }
        hours = Math.max(0, sumEnergy - initialEnergy + 1);

        for (int i = 0 ; i < experience.length; i++){
            if(initialExperience > experience[i]){
                initialExperience += experience[i];
            } else if(initialEnergy == experience[i]){
                initialExperience += experience[i] + 1;
                hours += 1;
            } else {
                int diff = experience[i] - initialExperience + 1;
                initialExperience += experience[i] + diff;
                hours += diff;
            }
        }

        return hours;
    }
}
