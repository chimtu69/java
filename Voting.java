class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class VotingProcess {
    public void checkEligibility(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("You are not eligible to vote. Minimum voting age is 18 years.");
        } else {
            System.out.println("You are eligible to vote.");
        }
    }
}

public class Voting {
    public static void main(String[] args) {
        VotingProcess votingProcess = new VotingProcess();

        try {
            int age = 16; // Set the age here
            votingProcess.checkEligibility(age);
        } catch (InvalidAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
