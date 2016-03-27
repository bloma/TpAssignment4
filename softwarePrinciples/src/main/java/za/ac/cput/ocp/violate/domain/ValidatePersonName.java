package za.ac.cput.ocp.violate.domain;

/**
 * Created by Aphish on 2016/03/27.
 */
public class ValidatePersonName {

    public  boolean isValidName(String name){

        if (name.equalsIgnoreCase("Anovuyo")){
            return true;
        }else {
            return false;
        }
    }
}
