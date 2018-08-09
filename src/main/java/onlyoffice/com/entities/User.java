package onlyoffice.com.entities;

import com.fasterxml.jackson.databind.ObjectMapper;
import onlyoffice.com.data.CommonForTheSiteData;

import java.io.File;
import java.io.IOException;

public class User {
    public String email;
    public String password;

    private static ObjectMapper mapper = new ObjectMapper();

    public static User createFromFile(String pathToFile){
        User result = null;
        try {
            result = mapper.readValue(new File(CommonForTheSiteData.PATH_TO_USER_DATA_FILE), User.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (result == null) {
            throw new NullPointerException("[OTUS-ERROR] :: User can't be read from the file :: " + pathToFile + ".");
        }
        return result;
    }
}
