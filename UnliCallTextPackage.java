import java.util.*;

public class UnliCallTextPackage implements UnliCallTextOffer {
    private static Map<String, String> unliCallTextMap = new HashMap<>();
    
    static {
        unliCallTextMap.put("Smart", "No unlimited calls and texts offer. Calls and texts are charged per use.");
        unliCallTextMap.put("Globe", "Unlimited calls and texts to Globe subscribers within the country. Calls and texts to other networks are charged extra.");
        unliCallTextMap.put("Ditto", "Unlimited calls and texts to all networks within the country.");
    }

@Override
    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText) {
    
        if (unliCallText) {
            String message = unliCallTextMap.get(telcoName);
            return (message != null) ? message : "Unlimited package details not found.";
        } else {
            return unliCallTextMap.getOrDefault(telcoName, "This plan is charged per use.");
        }
    }
}