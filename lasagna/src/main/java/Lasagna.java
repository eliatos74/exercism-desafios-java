public class Lasagna {

    int explicitVar = 40;

    
    public int expectedMinutesInOven(){
        return explicitVar;
    }
   
    public int remainingMinutesInOven(int timeInOven){
        if (timeInOven <= 0) {
            return expectedMinutesInOven();
        }
        return explicitVar - timeInOven;
    }
  
    public int preparationTimeInMinutes(int timePreparing){
        return timePreparing * 2;
    }
  
    public int totalTimeInMinutes(int numberLayers, int numberMinutes){
        return preparationTimeInMinutes(numberLayers) + numberMinutes;
    }
}

