import java.util.Scanner;

public class TrainTicket {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Get passenger information
    System.out.print("Enter passenger name: ");
    String name = input.nextLine();

    System.out.print("Enter destination: ");
    String destination = input.nextLine();

    System.out.print("Enter departure time: ");
    String departureTime = input.nextLine();

    // Generate ticket information
    int ticketNumber = (int) (Math.random() * 100000);
    String date = "2021-10-15"; // assume fixed date

    // Print ticket
    System.out.println("************************************");
    System.out.println("*           TRAIN TICKET           *");
    System.out.println("************************************");
    System.out.println("* Name: " + name);
    System.out.println("* Destination: " + destination);
    System.out.println("* Departure Time: " + departureTime);
    System.out.println("* Date: " + date);
    System.out.println("* Ticket Number: " + ticketNumber);
    System.out.println("************************************");
  }
}
