package za.ac.cput.ocp.obey.domain;
import za.ac.cput.ocp.obey.services.ValidateNameInterface;
/**
 * Created by Aphish on 2016/03/27.
 */
public class ValidatePesronName implements ValidateNameInterface{

    public boolean isValidName(String name){
        if (name.equalsIgnoreCase("Aphiwe")){
            return true;
        }else{
            return false;
        }
    }
}
