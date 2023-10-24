import java.util.*;
import java.io.*;

class Main {
  public static void main(String[] args) throws IOException {
    String tokens = "";
    // reading a txt data file-2 parts
    File fileName = new File("Hail.txt");
    Scanner inputFile = new Scanner(fileName);
    // use while loop to read tokens from the Hail.txt
    int count = 0;
    while (inputFile.hasNext()) {
      tokens = inputFile.next();
      System.out.println(tokens);
      count++;
    }
    inputFile.close();
    System.out.println("Number of tokens is " + count);

    // read Hail.txt and store in String array
    String[] hail = new String[count];
    Scanner inputFile2 = new Scanner(fileName);
    int index = 0;
    while (inputFile2.hasNext()) {
      hail[index] = inputFile2.next();
      index++;
    }
    inputFile2.close();
    for (String i : hail) {
      System.out.print(i + " ");
    }

    // read HailCommas.txt file with comma delimiter
    File fileName3 = new File("HailCommas.txt");
    Scanner inputFile3 = new Scanner(fileName3).useDelimiter(",");
    while (inputFile3.hasNext()) {
      tokens = inputFile3.next();
      System.out.println(tokens);
    }
    inputFile3.close();

    // read integers.txt file and calculate an average
    File fileName4 = new File("integers.txt");
    Scanner inputFile4 = new Scanner(fileName4);
    double sum = 0;
    int count4 = 0;
    while (inputFile4.hasNextInt()) {
      sum += inputFile4.nextInt();
      count4++;
    }
    inputFile4.close();
    System.out.println("Avg is " + (sum / count4));

    // writing to an output file
    File fileName5 = new File("hello.txt");
    PrintWriter outFile = new PrintWriter(fileName5);

    for (int i = 0; i < 10; i++) {
      outFile.println("Hello World!");
    }
    outFile.close(); // close the file when finished

    // read intCommas.txt, calculate avg, write to output file
    File fileName6 = new File("intCommas.txt");
    Scanner inputFile6 = new Scanner(fileName6).useDelimiter(",");
    File fileName66 = new File("intCommasAvg.txt");
    PrintWriter outFile6 = new PrintWriter("fileName66");
    double sum6 = 0;
    int count6 = 0;
    while (inputFile6.hasNextInt()) {
      sum6 += inputFile6.nextInt();
      count6++;
    }
    inputFile.close();
    outFile6.println("Average=" + (sum6 / count6));
    outFile6.close();
    // reading a file with multiple lines of text data6.txt
    File fileName7 = new File("data6.txt");
    Scanner inputFile7 = new Scanner(fileName7).useDelimiter(",");
    String token7 = "";
    int numLines = 0;
    while (inputFile7.hasNextLine()) {
      numLines++;
      while (inputFile7.hasNext()) {
        token7 += inputFile7.next();
      }
    }
    inputFile7.close();
    // System.out.println(token7);

    // Create an input file of random ints
    File fileName8 = new File("numbers.txt");
    PrintWriter outFile8 = new PrintWriter(fileName8);
    for (int i = 0; i < 10000; i++) {
      int rand = (int) (224 * Math.random()) + 32;
      outFile8.println(rand);
    }
    outFile8.close();
    char upperA = (char) 65;
    System.out.println(upperA);

  }
}