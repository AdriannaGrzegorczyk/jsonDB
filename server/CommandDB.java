package server;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CommandDB {

    public Map<Integer, String> DB = new HashMap<>();

    public boolean setCommand(int index, String input) {
        if (index > 1000) {
            return false;
        }
        DB.put(index, input);
        return true;
    }

    public boolean getCommand(int index) {

        if (index > 1000 || index < 0) {
            return false;
        }

        if (!DB.containsKey(index)) {
            return false;
        }

        DB.get(index);
        return true;
    }

    public boolean deleteCommand(int index) {

        if (index > 1000 || index <= 0) {
            return false;
        }

        if (DB.get(index)==null){
            return true;
        }
        DB.put(index, null);
        return true;
    }
}
