package J2HW3;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {

    private HashMap<String, String> phoneDB = new HashMap<>();

    public void add(String lastname, String phone) {
        this.phoneDB.put(phone, lastname);
    }

    public ArrayList<String> get(String lastname) {
        ArrayList<String> result = new ArrayList<>();

        for(String key : this.phoneDB.keySet()) {
            if(this.phoneDB.get(key).equals(lastname)) {
                result.add(key);
            }
        }

        return result;
    }

}