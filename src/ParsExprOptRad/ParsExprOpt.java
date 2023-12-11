package ParsExprOptRad;
import java.io.*;
    public class ParsExprOpt {
        public static void readExprProt (String fileNameEP) { /* The name of the binary file to open.*/
            String fileName = fileNameEP;
            FileInputStream inputStream = null;
            try { /* Use this for reading the data.             */
                byte[] buffer = new byte[4];
                inputStream = new FileInputStream(fileName);
            /*read fills buffer with data and returns the number of bytes read (which of course
            // may be less than the buffer size, but it will never be more).*/
                int total = 0,  nRead = 0;
                //while ((nRead = inputStream.read(buffer)) != -1)
                { try(FileReader reader = new FileReader(fileName))
                {                  // читаем посимвольно
                    int c;
                    //while((c=reader.read())!=-1)
                    for (total=0; total<=127; total++ )
                    {
                        c=reader.read();
                        System.out.print("byte num "+ total); System.out.println(" byte value " + c);
                    }
                }
                catch(IOException ex){
                    System.out.println(ex.getMessage());
                }
                /* Convert to String so we can display it.
                // Of course you wouldn't want to do this with a 'real' binary file.*/
                    //System.out.println(new String(buffer));
                    //total += nRead;
                }
                System.out.println("Read " + total + " bytes");
            }
            catch (FileNotFoundException ex) {
                System.out.println("Unable to open file '" + fileName + "'");
            }
            catch (IOException ex) {
                System.out.println("Error reading file '" + fileName + "'");
                /* Or we could just do this: ex.printStackTrace(); */
            }
            finally { /* Always close files.*/
                try {
                    if (inputStream != null)
                        inputStream.close();
                }
                catch (IOException e)  {
                    System.out.println("Error close file "+ fileName);
                }
            }
        }

        public static void writeTxtExprProt(String fileNameTxtEP) {/*/ The name of the file to open.*/
            String fileName = fileNameTxtEP;
            BufferedWriter bufferedWriter = null;
            try { /* Assume default encoding.*/
                FileWriter fileWriter = new FileWriter(fileName);
                /* Always wrap FileWriter in BufferedWriter.*/
                bufferedWriter = new BufferedWriter(fileWriter);
            /* Note that write() does not automatically append a newline character.*/
                bufferedWriter.write("Hello there,");
                bufferedWriter.write(" here is some text.");
                bufferedWriter.newLine();
                bufferedWriter.write("We are writing");
                bufferedWriter.write(" the text to the file.");
            }
            catch (IOException ex) {
                System.out.println("Error writing to file '" + fileName + "'");
            /*/ Or we could just do this: ex.printStackTrace();*/
            }
            finally { /*/ Always close files. */
                try {
                    if (bufferedWriter != null)
                     bufferedWriter.close();
                }
                catch (IOException e) {
                    System.out.println("Error close file "+ fileName);
                }
            }
        }

        public static void copyFileEP(String fileNameEP, String fileNameTxtEP) {
            FileInputStream in = null;
            FileOutputStream out = null;
            try {
                in = new FileInputStream(fileNameEP);
                out = new FileOutputStream(fileNameTxtEP);
                int c;
                while ((c = in.read()) != -1)
                 out.write(c);
            } catch (FileNotFoundException e) {
                System.out.println("file " + fileNameEP + " not found ");
                //throw new RuntimeException(e);
            } catch (IOException e) {
                System.out.println("Error IO in the file "+ fileNameEP + " or in the file " + fileNameTxtEP);
                //throw new RuntimeException(e);
            } finally {
                if (in != null)
                {
                    try {
                        in.close();
                    } catch (IOException e) {
                        System.out.println("Error close input file " + fileNameEP);
                        //throw new RuntimeException(e);
                    }
                }
                if (out != null)
                {
                    try {
                        out.close();
                    } catch (IOException e) {
                        System.out.println("Error close output file " + fileNameTxtEP);
                        //throw new RuntimeException(e);
                    }
                }
            }
        }
    }


