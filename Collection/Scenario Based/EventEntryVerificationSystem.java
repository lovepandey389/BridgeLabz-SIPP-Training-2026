import java.util.HashSet;

public class EventEntryVerificationSystem {

    static HashSet<String> participants = new HashSet<>();

    public static void registerParticipant(String email) {

        if (participants.add(email)) {
            System.out.println(email + " registered successfully.");
        } else {
            System.out.println(email + " is already registered.");
        }

    }

    public static void displayParticipants() {

        System.out.println("\n----- Registered Participants -----");

        if (participants.isEmpty()) {
            System.out.println("No participants registered.");
        } else {

            for (String email : participants) {
                System.out.println(email);
            }

        }

        System.out.println("\nTotal Eligible Participants : " + participants.size());

    }

    public static void main(String[] args) {

        registerParticipant("rahul@gmail.com");
        registerParticipant("amit@gmail.com");
        registerParticipant("neha@gmail.com");
        registerParticipant("rahul@gmail.com");
        registerParticipant("riya@gmail.com");

        displayParticipants();

    }

}

// Operation	Complexity
// Register Participant	O(1)
// Check Duplicate	O(1)
// Display Participants	O(n)
// Count Participants	O(1)