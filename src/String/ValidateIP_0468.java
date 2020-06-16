package String;

public class ValidateIP_0468 {
    public String validIPv4(String IP){
        String[] nums = IP.split("\\.", -1);
        for(String s : nums){
            if(s.length() == 0 || s.length() > 3) return "Neither";
            if(s.charAt(0) == '0' && s.length() != 1) return "Neither";
            for(char c : s.toCharArray()){
                if(!Character.isDigit(c)) return "Neither";
            }
            if(Integer.parseInt(s) > 255) return "Neither";
        }
        return "IPv4";
    }
    public String validIPv6(String IP) {
        String[] nums = IP.split(":", -1);
        String hexdigits = "0123456789abcdefABCDEF";
        for (String x : nums) {
            // Validate hexadecimal in range (0, 2**16):
            // 1. at least one and not more than 4 hexdigits in one chunk
            if (x.length() == 0 || x.length() > 4) return "Neither";
            // 2. only hexdigits are allowed: 0-9, a-f, A-F
            for (Character ch : x.toCharArray()) {
                if (hexdigits.indexOf(ch) == -1) return "Neither";
            }
        }
        return "IPv6";
    }
    public String validIPAddress(String IP) {
        if (IP.chars().filter(ch -> ch == '.').count() == 3) {
            return validIPv4(IP);
        }
        else if (IP.chars().filter(ch -> ch == ':').count() == 7) {
            return validIPv6(IP);
        }
        else return "Neither";
    }
}
