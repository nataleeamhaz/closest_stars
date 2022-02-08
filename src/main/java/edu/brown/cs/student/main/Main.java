package edu.brown.cs.student.main;

// look into using these imports for your REPL!
import java.io.*;

import joptsimple.OptionParser;
import joptsimple.OptionSet;
import spark.Spark;
import java.util.ArrayList;



/**
 * The Main class of our project. This is where execution begins.
 */
public final class Main {

  // use port 4567 by default when running server
  private static final int DEFAULT_PORT = 4567;
  ArrayList<Star> stars = new ArrayList<>();
  csvReader csv = new csvReader(stars);
  int input;
  /**
   * The initial method called when execution begins.
   *
   * @param args An array of command line arguments
   */
  public static void main(String[] args) throws IOException {
    new Main(args).run();
  }

  private String[] args;

  private Main(String[] args) {
    this.args = args;
  }

  private void run() throws IOException {
    // set up parsing of command line flags
    OptionParser parser = new OptionParser();

    // "./run --gui" will start a web server
    parser.accepts("gui");

    // use "--port <n>" to specify what port on which the server runs
    parser.accepts("port").withRequiredArg().ofType(Integer.class)
            .defaultsTo(DEFAULT_PORT);

    OptionSet options = parser.parse(args);
    if (options.has("gui")) {
      runSparkServer((int) options.valueOf("port"));

    }
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    while (true) {
      String s;

      s = in.readLine();
      if (s != null) {
        String[] data = s.split(" ");

        if (data[0].equals("stars")) {
          if (data.length == 1) {
            System.out.println("ERROR:");
          } else {
            csv.csvReader(data[1]);
          }

        } else if (data[0].equals("naive_neighbors")) {
          String result = data[2].replaceAll("^[\"']+|[\"']+$", "");
          Knearest k = new Knearest();
          if (data.length < 5) {
            for (int i = 0; i < stars.size(); i++) {
              if (result.equals(stars.get(i).get_ProperName())) {
                input = stars.get(i).get_StarID();
                k.neighborStar(input, stars, Integer.parseInt(data[1]), stars.get(i).get_X(), stars.get(i).get_Y(), stars.get(i).get_Z());
              }
            }
          } else {
            k.neighborCoord(stars, Integer.parseInt(data[1]), Double.parseDouble(data[2]), Double.parseDouble(data[3]), Double.parseDouble(data[4]));
          }
        } else {
          System.out.println("ERROR:");
        }
      }
      else{
        break;
      }
    }
  }



  private void runSparkServer(int port) {
    // set port to run the server on
    Spark.port(port);

    // specify location of static resources (HTML, CSS, JS, images, etc.)
    Spark.externalStaticFileLocation("src/main/resources/static");
  }
}

