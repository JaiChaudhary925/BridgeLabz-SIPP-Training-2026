import java.io.*;

public class SchoolResultPortal {
    public static void main(String[] args) {
        int totalMarks = 0;
        int studentCount = 0;

        try {
            BufferedReader reader = new BufferedReader(
                    new FileReader("students.txt"));

            BufferedWriter writer = new BufferedWriter(
                    new FileWriter("report.txt", true));

            writer.write("Student Report");
            writer.newLine();

            String line;

            while ((line = reader.readLine()) != null) {
                String[] data = line.split(" ");

                String name = data[0];
                int marks = Integer.parseInt(data[1]);

                totalMarks += marks;
                studentCount++;

                writer.write(name + " : " + marks);
                writer.newLine();
            }

            double average = (double) totalMarks / studentCount;

            writer.write("Average Marks = " + average);
            writer.newLine();
            writer.newLine();

            reader.close();
            writer.close();

            System.out.println("Report Generated Successfully");

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}