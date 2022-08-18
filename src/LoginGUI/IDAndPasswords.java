package LoginGUI;

import java.util.HashMap;

public class IDAndPasswords {

    HashMap<String, String> loginInfo;

    public IDAndPasswords() {
        this.loginInfo = new HashMap<>();

        loginInfo.put("Georgi", "georgi123");
        loginInfo.put("Prometheus", "Olympus");
        loginInfo.put("SimpleUser", "password");
        loginInfo.put("123", "123");
    }

    protected HashMap<String, String> getLoginInfo() {
        return loginInfo;
    }
}
