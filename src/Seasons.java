public class Seasons {


    public String method(int num){

        while(true){
            switch (num){
                case 1:
                    if(num==1){
                        return "December";
                    } case 2:
                    if(num==2){
                        return "Spring";
                    } case 3:
                    if(num==3){
                        return "Summer";
                    } case 4:
                    if(num==4){
                        return "Autumn";
                    } case 5:
                    if(num==5){
                        return "Not valid number of season";
                    }

            }
            return "Wrong";
        }
    }
        }


