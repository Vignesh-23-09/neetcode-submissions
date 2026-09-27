
class Solution {
    public int numUniqueEmails(String[] emails) {
        // Set will store only the unique normalized email addresses
        Set<String> uniqueEmails = new HashSet<>();
        
        for (String email : emails) {
            // Split the email into local name and domain name
            int atIndex = email.indexOf('@');
            String local = email.substring(0, atIndex);
            String domain = email.substring(atIndex); // Keeps the '@' with the domain
            
            // Rule 1: Ignore everything after the '+' in the local name
            if (local.contains("+")) {
                local = local.substring(0, local.indexOf('+'));
            }
            
            // Rule 2: Remove all '.' from the local name
            local = local.replace(".", "");
            
            // Reconstruct the normalized email and add it to the Set
            uniqueEmails.add(local + domain);
        }
        
        // The size of the set represents the number of unique target addresses
        return uniqueEmails.size();
    }
}
